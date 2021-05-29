package com.metapack.estimatedpackagedeliverytime.controllers;

import com.metapack.estimatedpackagedeliverytime.authorization.JwtUtil;
import com.metapack.estimatedpackagedeliverytime.authorization.MyUserDetails;
import com.metapack.estimatedpackagedeliverytime.models.AuthenticationResponse;
import com.metapack.estimatedpackagedeliverytime.models.AuthenticationUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private MyUserDetails myUserDetails;

    @Autowired
    private JwtUtil jwtTokenUtil;

    @PostMapping("/authentication")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationUser authenticationUser) throws Exception
    {
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationUser.getUsername(),
                    authenticationUser.getPassword()));
        }
        catch(BadCredentialsException ex)
        {
            throw new BadCredentialsException("Incorrect username or password", ex);
        }
        final UserDetails actualUser = myUserDetails.loadUserByUsername(authenticationUser.getUsername());
        final String jwt = jwtTokenUtil.generateToken(actualUser);

        return ResponseEntity.ok(new AuthenticationResponse(jwt));
    }
}
