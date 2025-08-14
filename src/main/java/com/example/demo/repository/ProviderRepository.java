package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ProviderModel;

@Repository
public interface ProviderRepository extends JpaRepository<ProviderModel, Long>{

}
