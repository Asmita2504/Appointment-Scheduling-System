package com.example.demo.service;

import com.example.demo.model.UserModel;

public interface UserService {

	UserModel createUser(UserModel userModel);
	UserModel getByEmail(String email); 
}
