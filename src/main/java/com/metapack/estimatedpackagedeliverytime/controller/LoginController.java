//package com.metapack.estimatedpackagedeliverytime.controller;
//
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class LoginController {

//    @PostMapping("/api/login")
//    public String LoginUser(@RequestBody UserModel user) {
//        long actualTime = System.currentTimeMillis();
//        return Jwts.builder()
//                .setSubject(user.getUser())
//                .claim("roles", "user")
//                .setIssuedAt(new Date(actualTime))
//                .setExpiration(new Date(actualTime + 10000))
//                .signWith(SignatureAlgorithm.HS512, "secretkey").compact();
//    }
//}
