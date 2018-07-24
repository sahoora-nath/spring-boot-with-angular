package com.sahoora.customer.model;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

public class BaseTableListener {
	@PreUpdate
	@PrePersist
	public void updateInfo(BaseTableAware baseTableAware) {
		baseTableAware.getBaseTable().updateForWrite();
	}
}
