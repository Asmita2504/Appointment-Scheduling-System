package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	    private long userId;
        private String name;
	    private String email;
	    private long PhNo;
		public UserModel() {
			super();
		}
		public UserModel(long userId, String name, String email, long phNo) {
			super();
			this.userId = userId;
			this.name = name;
			this.email = email;
			PhNo = phNo;
		}
		public long getUserId() {
			return userId;
		}
		public void setUserId(long userId) {
			this.userId = userId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public long getPhNo() {
			return PhNo;
		}
		public void setPhNo(long phNo) {
			PhNo = phNo;
		}
	    
}
