package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProviderModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long providerId;
    private String name;
    private String specialty;
    private String contact;
	public ProviderModel() {
		super();
	}
	public ProviderModel(Long providerId, String name, String specialty, String contact) {
		super();
		this.providerId = providerId;
		this.name = name;
		this.specialty = specialty;
		this.contact = contact;
	}
	public Long getProviderId() {
		return providerId;
	}
	public void setProviderId(Long providerId) {
		this.providerId = providerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
    

}
