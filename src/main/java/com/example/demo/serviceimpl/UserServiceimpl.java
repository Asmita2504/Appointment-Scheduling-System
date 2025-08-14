package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.UserModel;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

@Service
public class UserServiceimpl implements UserService{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public UserModel createUser(UserModel userModel) {
		UserModel existingUser = null;
        try {
        	existingUser = getByEmail(userModel.getEmail());
        } catch (RuntimeException e) {
            // Expected if new customer
        }

        if (existingUser != null) {
            throw new RuntimeException("User already exists");
        }
        return userRepository.save(userModel);
	}

	@Override
	public UserModel getByEmail(String email) {
		UserModel user = userRepository.findByEmail(email);
        if (user == null) {
            throw new RuntimeException("User not found with email: " + email);
        }
        return user;
    }
	}

	
	
