package com.sahoora.customer.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="CONTACT")
@EntityListeners(BaseTableListener.class)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ContactDetail implements BaseTableAware {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="contact_Id")
	private Long contactId;
	
	private String address1;
	private String address2;
	private String city;
	private String country;
	private String postcode;
	
	@Embedded
	private BaseTable baseTable;
	
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
	
	public BaseTable getBaseTable() {
		if (baseTable == null) {
			baseTable = new BaseTable();
		}
		return baseTable;
	}
	public void setBaseTable(BaseTable baseTable) {
		this.baseTable = baseTable;
	}
	public Long getContactId() {
		return contactId;
	}
	public void setContactId(Long contactId) {
		this.contactId = contactId;
	}
}
