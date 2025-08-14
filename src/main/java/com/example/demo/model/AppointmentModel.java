package com.example.demo.model;

import java.time.LocalDateTime;

import com.example.demo.enums.AppointmentStatus;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class AppointmentModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long appointmentId;

    @ManyToOne
    @JoinColumn(name = "userId")
    private UserModel user;

    @ManyToOne
    @JoinColumn(name = "providerId")
    private ProviderModel provider;

    private LocalDateTime appointmentDate;

    @Enumerated(EnumType.STRING)
    private AppointmentStatus status;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

	public AppointmentModel() {
		super();
	}

	public AppointmentModel(long appointmentId, UserModel user, ProviderModel provider, LocalDateTime appointmentDate,
			AppointmentStatus status, LocalDateTime createdAt, LocalDateTime updatedAt) {
		super();
		this.appointmentId = appointmentId;
		this.user = user;
		this.provider = provider;
		this.appointmentDate = appointmentDate;
		this.status = status;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public long getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(long appointmentId) {
		this.appointmentId = appointmentId;
	}

	public UserModel getUser() {
		return user;
	}

	public void setUser(UserModel user) {
		this.user = user;
	}

	public ProviderModel getProvider() {
		return provider;
	}

	public void setProvider(ProviderModel provider) {
		this.provider = provider;
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

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

}