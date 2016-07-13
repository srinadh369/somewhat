package org.capstore.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Admin {

	
	@Id
	@GeneratedValue
	private int admin_id;
	@Column(nullable=false)
	private String first_name;
	@Column(nullable=false)
	private String last_name;
	@Column(nullable=false)
	private String mobile_no;
	@NotNull
	@Email
	@Column(name="email_id",unique=true,nullable=false)
	private String email_id;
	@Column(nullable=false)
	private String password;
	
	public Admin()
	{
		
	}



	public Admin(int admin_id, String first_name, String last_name, String mobile_no, String email_id,
			String password) {
		super();
		this.admin_id = admin_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.mobile_no = mobile_no;
		this.email_id = email_id;
		this.password = password;
	}



	public int getAdmin_id() {
		return admin_id;
	}



	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
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



	@Override
	public String toString() {
		return "Admin [admin_id=" + admin_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", mobile_no=" + mobile_no + ", email_id=" + email_id + ", password=" + password + "]";
	}
	
	
	

}
