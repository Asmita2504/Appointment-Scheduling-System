package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/createUser")
	 public ResponseEntity<?> createUser(@RequestBody UserModel userModel) {
        try {
            UserModel created = userService.createUser(userModel);
            return new ResponseEntity<>(created, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("User already registered", HttpStatus.BAD_REQUEST);
        }
    }
	

}
