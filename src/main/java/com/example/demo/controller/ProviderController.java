package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.ProviderModel;
import com.example.demo.service.ProviderService;

@RestController
@CrossOrigin("*")
public class ProviderController {
	
	@Autowired
	ProviderService providerService;
	
	@PostMapping("/createProvider")
	public ResponseEntity<?> createProvider(@RequestBody ProviderModel providerModel) {
        try {
            ProviderModel createProvider = providerService.createProvider(providerModel);
            return new ResponseEntity<>(createProvider, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
	
	@GetMapping("/getAllProviders")
	public List<ProviderModel>getAllProviders(){
		return this.providerService.getAllProviders();
	}

}
