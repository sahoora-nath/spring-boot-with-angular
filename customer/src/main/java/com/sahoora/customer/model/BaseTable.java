package com.sahoora.customer.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonFormat;

@Embeddable
public class BaseTable implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name="LAST_UPDATED_BY")
	private Long lastUpdatedBy;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="MM-dd-yyyy")
	@Column(name="LAST_UPDATED_DATE")
	private Date lastUpdatedDate;
	
	public void updateForWrite() {
		lastUpdatedBy = 1L;
		lastUpdatedDate = new Date();
	}
	public Long getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	public void setLastUpdatedBy(Long lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}
	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
}
