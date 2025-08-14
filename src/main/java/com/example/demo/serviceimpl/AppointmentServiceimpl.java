package com.example.demo.serviceimpl;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.AppointmentRequestDTO;
import com.example.demo.enums.AppointmentStatus;
import com.example.demo.model.AppointmentModel;
import com.example.demo.model.ProviderModel;
import com.example.demo.model.UserModel;
import com.example.demo.repository.AppointmentRepository;
import com.example.demo.repository.ProviderRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.AppointmentService;

@Service
public class AppointmentServiceimpl implements AppointmentService {
	@Autowired
	AppointmentRepository appointmentRepository;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	ProviderRepository providerRepository;

	@Override
	public AppointmentModel schedule(AppointmentRequestDTO dto) {
		UserModel user = userRepository.findById(dto.getUserId())
                .orElseThrow(() -> new RuntimeException("User not found"));

        ProviderModel provider = providerRepository.findById(dto.getProviderId())
                .orElseThrow(() -> new RuntimeException("Provider not found"));

        AppointmentModel appointment = new AppointmentModel();
        appointment.setUser(user);
        appointment.setProvider(provider);
        appointment.setAppointmentDate(dto.getAppointmentDate());
        appointment.setStatus(AppointmentStatus.SCHEDULED);
        
        appointment.setCreatedAt(LocalDateTime.now());
        appointment.setUpdatedAt(LocalDateTime.now());

        return appointmentRepository.save(appointment);
    }

	@Override
	public AppointmentModel reschedule(Long appointmentId, LocalDateTime newDate) {
		AppointmentModel appointment = appointmentRepository.findById(appointmentId)
                .orElseThrow(() -> new RuntimeException("Appointment not found"));

        appointment.setAppointmentDate(newDate);
        appointment.setStatus(AppointmentStatus.RESCHEDULED);
        return appointmentRepository.save(appointment);
	}

	@Override
	public void cancel(Long appointmentId) {
		AppointmentModel appointment = appointmentRepository.findById(appointmentId)
                .orElseThrow(() -> new RuntimeException("Appointment not found"));

        appointment.setStatus(AppointmentStatus.CANCELLED);
        appointmentRepository.save(appointment);
	}

	@Override
	public AppointmentModel getAppointmentsByUser(Long userId) {
		return appointmentRepository.findByUserUserId(userId);
	}

	@Override
	public AppointmentModel getAppointmentsByProvider(Long providerId) {
		// TODO Auto-generated method stub
		return appointmentRepository.findByProviderProviderId(providerId);
	}
	
	
	}


