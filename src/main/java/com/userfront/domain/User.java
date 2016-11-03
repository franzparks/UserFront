package com.userfront.domain;

import java.util.List;

public class User {
	
	private Long userId;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	
	private boolean enabled =true;
	
	private PrimaryAccount primaryAccount;
	private SavingsAccount savingsAccount;
	
	private List<Appointment> appointmentList;
	private List<Recipient> recipientList;
	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @return the enabled
	 */
	public boolean isEnabled() {
		return enabled;
	}
	/**
	 * @return the primaryAccount
	 */
	public PrimaryAccount getPrimaryAccount() {
		return primaryAccount;
	}
	/**
	 * @return the savingsAccount
	 */
	public SavingsAccount getSavingsAccount() {
		return savingsAccount;
	}
	/**
	 * @return the appointmentList
	 */
	public List<Appointment> getAppointmentList() {
		return appointmentList;
	}
	/**
	 * @return the recipientList
	 */
	public List<Recipient> getRecipientList() {
		return recipientList;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @param enabled the enabled to set
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	/**
	 * @param primaryAccount the primaryAccount to set
	 */
	public void setPrimaryAccount(PrimaryAccount primaryAccount) {
		this.primaryAccount = primaryAccount;
	}
	/**
	 * @param savingsAccount the savingsAccount to set
	 */
	public void setSavingsAccount(SavingsAccount savingsAccount) {
		this.savingsAccount = savingsAccount;
	}
	/**
	 * @param appointmentList the appointmentList to set
	 */
	public void setAppointmentList(List<Appointment> appointmentList) {
		this.appointmentList = appointmentList;
	}
	/**
	 * @param recipientList the recipientList to set
	 */
	public void setRecipientList(List<Recipient> recipientList) {
		this.recipientList = recipientList;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", firstName="
				+ firstName + ", lastName=" + lastName + ", email=" + email + ", phone=" + phone + ", enabled="
				+ enabled + "]";
	}
		
	

}
