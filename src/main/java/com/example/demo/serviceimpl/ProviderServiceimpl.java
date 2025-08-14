package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.model.ProviderModel;
import com.example.demo.repository.ProviderRepository;
import com.example.demo.service.ProviderService;


@Service
public class ProviderServiceimpl implements ProviderService{
	@Autowired
	ProviderRepository providerRepository;

	@Override
	public ProviderModel createProvider(ProviderModel providerModel) {
		// TODO Auto-generated method stub
		return this.providerRepository.save(providerModel);
	}

	@Override
	public List<ProviderModel> getAllProviders() {
		// TODO Auto-generated method stub
		return this.providerRepository.findAll();
	}

	
}
