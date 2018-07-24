package com.sahoora.customer.model;

/**
 * BaseTableAware is implemented by entities and embedded objects that have common set of basic table columns.
 * 
 * <p/> Entities in JPA can look into events, so that base table fields can be updated whenever entity 
 * is being saved back to db or upon being loaded from the db.
 * @author rabindrasahoo
 *
 */
public interface BaseTableAware {
	BaseTable getBaseTable();
	
	void setBaseTable(BaseTable baseTable);
}
