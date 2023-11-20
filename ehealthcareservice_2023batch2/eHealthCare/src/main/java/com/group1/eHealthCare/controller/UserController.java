package com.group1.eHealthCare.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.group1.eHealthCare.entity.AuthenticationResponse;
import com.group1.eHealthCare.entity.UserCredentials;
import com.group1.eHealthCare.service.UserService;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController

public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/auth")
    public AuthenticationResponse authenticate(@RequestBody UserCredentials credentials) {
        // Authenticate the user
        boolean isAuthenticated = userService.authenticateUser(credentials.getInputusernameString(), credentials.getInputpasswordString());

        if (isAuthenticated) {
            // Check if the user is an admin based on the 'isadmin' column in the database
            boolean isAdmin = userService.isUserAdmin(credentials.getInputusernameString());
            if (isAdmin) {
                // If the user is an admin, route to admin API
                return new AuthenticationResponse("Admin API Access", credentials.getInputusernameString());
            } else {
                // If the user is not an admin, route to user API
                return new AuthenticationResponse("User API Access", credentials.getInputusernameString());
            }
        } else {
            return new AuthenticationResponse("Authentication Failed", null);
        }
    }
}

