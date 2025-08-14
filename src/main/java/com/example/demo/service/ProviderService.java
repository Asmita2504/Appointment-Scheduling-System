package com.example.demo.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.demo.model.ProviderModel;

public interface ProviderService {

	ProviderModel createProvider(ProviderModel providerModel);


	List<ProviderModel> getAllProviders();

}
