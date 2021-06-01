//package com.metapack.estimatedpackagedeliverytime.controller;
//
//import com.metapack.estimatedpackagedeliverytime.authorization.JwtUtil;
//import com.metapack.estimatedpackagedeliverytime.authorization.MyUserDetails;
//import com.metapack.estimatedpackagedeliverytime.model.AuthenticationResponse;
//import com.metapack.estimatedpackagedeliverytime.model.AuthenticationUser;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class AuthenticationController {
//
//    private AuthenticationManager authenticationManager;
//    private MyUserDetails myUserDetails;
//    private JwtUtil jwtTokenUtil;
//
//    @Autowired
//    public AuthenticationController(AuthenticationManager authenticationManager, MyUserDetails myUserDetails, JwtUtil jwtTokenUtil) {
//        this.authenticationManager = authenticationManager;
//        this.myUserDetails = myUserDetails;
//        this.jwtTokenUtil = jwtTokenUtil;
//    }
//
//    @PostMapping("/authorize")
//    public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationUser authenticationUser) throws Exception
//    {
//        try {
//            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationUser.getUsername(),
//                    authenticationUser.getPassword()));
//        }
//        catch(BadCredentialsException ex)
//        {
//            throw new BadCredentialsException("Incorrect username or password", ex);
//        }
//        final UserDetails actualUser = myUserDetails.loadUserByUsername(authenticationUser.getUsername());
//        final String jwt = jwtTokenUtil.generateToken(actualUser);
//
//        return ResponseEntity.ok(new AuthenticationResponse(jwt));
//    }
//}
