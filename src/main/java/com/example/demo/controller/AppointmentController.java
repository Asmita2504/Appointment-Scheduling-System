package com.example.demo.controller;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.AppointmentRequestDTO;
import com.example.demo.model.AppointmentModel;
import com.example.demo.service.AppointmentService;

@RestController
@CrossOrigin("*")
public class AppointmentController {
	@Autowired
	AppointmentService appointmentService;

	@PostMapping("/appointments")
    public ResponseEntity<AppointmentModel> schedule(@RequestBody AppointmentRequestDTO dto) {
        return new ResponseEntity<>(appointmentService.schedule(dto), HttpStatus.CREATED);
    }
	
	@PutMapping("/appointments/{appointmentId}/reschedule")
    public ResponseEntity<AppointmentModel> reschedule(@PathVariable Long appointmentId, @RequestBody Map<String, String> body) {
        LocalDateTime newDate = LocalDateTime.parse(body.get("appointmentDate"));
        return ResponseEntity.ok(appointmentService.reschedule(appointmentId, newDate));
    }
	
	@DeleteMapping("/{appointmentId}")
    public ResponseEntity<?> cancel(@PathVariable Long appointmentId) {
        appointmentService.cancel(appointmentId);
        return ResponseEntity.ok("Appointment cancelled");
    }
	
	@GetMapping("/user/{userId}")
    public ResponseEntity<AppointmentModel> getByUser(@PathVariable Long userId) {
        return ResponseEntity.ok(appointmentService.getAppointmentsByUser(userId));
    }

	@GetMapping("/provider/{providerId}")
    public ResponseEntity<AppointmentModel> getByProvider(@PathVariable Long providerId) {
        return ResponseEntity.ok(appointmentService.getAppointmentsByProvider(providerId));
    }

}
