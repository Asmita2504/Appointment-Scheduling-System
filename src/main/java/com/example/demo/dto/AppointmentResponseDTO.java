package com.example.demo.dto;

import java.time.LocalDateTime;

import com.example.demo.enums.AppointmentStatus;

public class AppointmentResponseDTO {
	private Long appointmentId;
    private String userName;
    private String providerName;
    private LocalDateTime appointmentDate;
    private AppointmentStatus status;
	public Long getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(Long appointmentId) {
		this.appointmentId = appointmentId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getProviderName() {
		return providerName;
	}
	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}
	public LocalDateTime getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(LocalDateTime appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public AppointmentStatus getStatus() {
		return status;
	}
	public void setStatus(AppointmentStatus status) {
		this.status = status;
	}

    
}
