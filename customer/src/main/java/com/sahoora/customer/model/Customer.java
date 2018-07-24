package com.sahoora.customer.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="CUSTOMER")
@EntityListeners(BaseTableListener.class)
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Customer implements BaseTableAware {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="first_Name")
	private String firstName;
	@Column(name="last_Name")
	private String lastName;
	private String email;
	
	@OneToOne(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinColumn(name="contact_Id")
	private ContactDetail contactDetail;

	@Embedded
	private BaseTable baseTable;
	
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ContactDetail getContactDetail() {
		return contactDetail;
	}

	public void setContactDetail(ContactDetail contactDetail) {
		this.contactDetail = contactDetail;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

}
