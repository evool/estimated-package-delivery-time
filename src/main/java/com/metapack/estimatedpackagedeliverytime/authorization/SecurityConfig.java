package com.metapack.estimatedpackagedeliverytime.authorization;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.HttpStatusEntryPoint;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private final DataSource dataSource;
    private final ObjectMapper mapper;
    private final RestAuthenticationFailureHandler failureHandler;
    private final RestAuthenticationSuccessHandler successHandler;

    public SecurityConfig(ObjectMapper mapper, DataSource dataSource,
                          RestAuthenticationSuccessHandler successHandler,
                          RestAuthenticationFailureHandler failureHandler) {
        this.dataSource = dataSource;
        this.mapper = mapper;
        this.successHandler = successHandler;
        this.failureHandler = failureHandler;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user")
                .password("{noop}password")
                .roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.authorizeRequests()
                .antMatchers("/h2-console/**").permitAll()
                .anyRequest().authenticated()
                .and()
                .addFilter(authenticationFilter())
                .exceptionHandling()
                .authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED));
    }

    public JsonObjectAuthenticationFilter authenticationFilter() throws Exception {
        JsonObjectAuthenticationFilter objectAuthenticationFilter = new JsonObjectAuthenticationFilter(mapper);
        authenticationFilter().setAuthenticationSuccessHandler(successHandler);
        authenticationFilter().setAuthenticationFailureHandler(failureHandler);
        authenticationFilter().setAuthenticationManager(super.authenticationManager());
        return objectAuthenticationFilter;
    }


}
