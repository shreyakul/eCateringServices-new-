package com.eCateringServices.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserEntity {
	
			
					@Id
					@GeneratedValue
					private long id;
					
					@Column(nullable= false)
					private String userId;
					
					@Column(nullable= false, length=20)
					private String firstName;
					
					@Column(nullable= false, length=20)
					private String lastName;
					
					@Column(nullable= false, length=10)
					private long contactNo;
					
					@Column(nullable= false, length=100)
					private String email;

					public long getId() {
						return id;
					}

					public void setId(long id) {
						this.id = id;
					}

					public String getUserId() {
						return userId;
					}

					public void setUserId(String userId) {
						this.userId = userId;
					}

					public String getFirstName() {
						return firstName;
					}

					public void setFirstName(String firstName) {
						this.firstName = firstName;
					}

					public String getLastName() {
						return lastName;
					}

					public void setLastName(String lastName) {
						this.lastName = lastName;
					}

					public long getContactNo() {
						return contactNo;
					}

					public void setContactNo(long contactNo) {
						this.contactNo = contactNo;
					}

					public String getEmail() {
						return email;
					}

					public void setEmail(String email) {
						this.email = email;
					}
					
					
					
}
