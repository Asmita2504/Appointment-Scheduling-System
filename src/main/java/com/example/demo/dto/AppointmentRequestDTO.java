package com.example.demo.dto;

import java.time.LocalDateTime;

public class AppointmentRequestDTO {
	private Long userId;
    private Long providerId;
    private LocalDateTime appointmentDate;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getProviderId() {
		return providerId;
	}
	public void setProviderId(Long providerId) {
		this.providerId = providerId;
	}
	public LocalDateTime getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(LocalDateTime appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
    
    

}
