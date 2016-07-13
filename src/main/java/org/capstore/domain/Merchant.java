package org.capstore.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Merchant {

	@Id
	@GeneratedValue
	private int merchant_id;
	
	@Column(nullable=false)
	private String first_name;
	
	@Column(nullable=false)
	private String last_name;
	
	@Column(nullable=false)
	private String company_name;
	
	@Column(nullable=false)
	private String company_display_name;
	
	@Column(nullable=false)
	private String mobile_no;
	
	private String zip;
	private String city;
	private String state;
	
	@Column(nullable=false)
	private String password;
	
	@Column(nullable=false,unique=true)
	@NotEmpty(message="plz enter email id")
	@Email(message="Please enter valid emailid")
	private String email_id;
	
	@Column(unique=true)
	private String pancard_no;
	@Column(unique=true)
	private String trade_license;
	@Column(nullable=false)
	private String merchant_type;
	
	@Column(nullable=false,unique=true)
	private int email_verified;
	
	private String address;
	
	public Merchant(){}
	
	public Merchant(int merchant_id, String first_name, String last_name, String company_name,
			String company_display_name, String mobile_no, String zip, String city, String state, String password,
			String email_id, String pancard_no, String trade_license, String merchant_type, int email_verified,
			String address) {
		super();
		this.merchant_id = merchant_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.company_name = company_name;
		this.company_display_name = company_display_name;
		this.mobile_no = mobile_no;
		this.zip = zip;
		this.city = city;
		this.state = state;
		this.password = password;
		this.email_id = email_id;
		this.pancard_no = pancard_no;
		this.trade_license = trade_license;
		this.merchant_type = merchant_type;
		this.email_verified = email_verified;
		this.address = address;
	}

	public int getMerchant_id() {
		return merchant_id;
	}

	public void setMerchant_id(int merchant_id) {
		this.merchant_id = merchant_id;
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

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getCompany_display_name() {
		return company_display_name;
	}

	public void setCompany_display_name(String company_display_name) {
		this.company_display_name = company_display_name;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getPancard_no() {
		return pancard_no;
	}

	public void setPancard_no(String pancard_no) {
		this.pancard_no = pancard_no;
	}

	public String getTrade_license() {
		return trade_license;
	}

	public void setTrade_license(String trade_license) {
		this.trade_license = trade_license;
	}

	public String getMerchant_type() {
		return merchant_type;
	}

	public void setMerchant_type(String merchant_type) {
		this.merchant_type = merchant_type;
	}

	public int getEmail_verified() {
		return email_verified;
	}

	public void setEmail_verified(int email_verified) {
		this.email_verified = email_verified;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Merchant [merchant_id=" + merchant_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", company_name=" + company_name + ", company_display_name=" + company_display_name + ", mobile_no="
				+ mobile_no + ", zip=" + zip + ", city=" + city + ", state=" + state + ", password=" + password
				+ ", email_id=" + email_id + ", pancard_no=" + pancard_no + ", trade_license=" + trade_license
				+ ", merchant_type=" + merchant_type + ", email_verified=" + email_verified + ", address=" + address
				+ "]";
	}
	
	
	

}
