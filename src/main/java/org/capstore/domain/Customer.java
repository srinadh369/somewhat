package org.capstore.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.Email;

@Entity
public class Customer {

	@Id
	@GeneratedValue
	
	private int	customer_id;
	
	@Column(nullable=false)
	private String first_name;
	@Column(nullable=false)
	private String last_name;
	/*private String country;
	private String state;
	private String city;
	private String pincode;
	private String street_name;
	private String  door_no;*/
	@Temporal(TemporalType.TIMESTAMP)
	private Date regdate;
	
	@Column(nullable=false,unique=true)
	private String mobile_no;
	@Email
	@Column(nullable=false,unique=true)
	private String email_id;
	@Column(nullable=false)
	private String password;
	@Column(nullable=false)
	private String verification_code;
	@Column(nullable=false,length=1)
	private int email_verified;
	@Column(nullable=false,unique=true)
	private int cart_id;
	private String userSecurityquestion;
	private String userSecurityanswer;
	
	public Customer(){
		
	}

	public Customer(int customer_id, String first_name, String last_name, Date regdate, String mobile_no,
			String email_id, String password, String verification_code, int email_verified, int cart_id,
			String userSecurityquestion, String userSecurityanswer) {
		super();
		this.customer_id = customer_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.regdate = regdate;
		this.mobile_no = mobile_no;
		this.email_id = email_id;
		this.password = password;
		this.verification_code = verification_code;
		this.email_verified = email_verified;
		this.cart_id = cart_id;
		this.userSecurityquestion = userSecurityquestion;
		this.userSecurityanswer = userSecurityanswer;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getVerification_code() {
		return verification_code;
	}

	public void setVerification_code(String verification_code) {
		this.verification_code = verification_code;
	}

	public int getEmail_verified() {
		return email_verified;
	}

	public void setEmail_verified(int email_verified) {
		this.email_verified = email_verified;
	}

	public int getCart_id() {
		return cart_id;
	}

	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}

	public String getUserSecurityquestion() {
		return userSecurityquestion;
	}

	public void setUserSecurityquestion(String userSecurityquestion) {
		this.userSecurityquestion = userSecurityquestion;
	}

	public String getUserSecurityanswer() {
		return userSecurityanswer;
	}

	public void setUserSecurityanswer(String userSecurityanswer) {
		this.userSecurityanswer = userSecurityanswer;
	}

	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", regdate=" + regdate + ", mobile_no=" + mobile_no + ", email_id=" + email_id + ", password="
				+ password + ", verification_code=" + verification_code + ", email_verified=" + email_verified
				+ ", cart_id=" + cart_id + ", userSecurityquestion=" + userSecurityquestion + ", userSecurityanswer="
				+ userSecurityanswer + "]";
	}

	
	
		
}
	
