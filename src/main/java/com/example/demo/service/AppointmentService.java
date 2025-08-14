package com.example.demo.service;

import java.time.LocalDateTime;

import com.example.demo.dto.AppointmentRequestDTO;
import com.example.demo.model.AppointmentModel;

public interface AppointmentService {
	AppointmentModel schedule(AppointmentRequestDTO dto);

	AppointmentModel reschedule(Long id, LocalDateTime newDate);

	void cancel(Long appointmentId);

	AppointmentModel getAppointmentsByUser(Long userId);

	AppointmentModel getAppointmentsByProvider(Long providerId);


	

}
