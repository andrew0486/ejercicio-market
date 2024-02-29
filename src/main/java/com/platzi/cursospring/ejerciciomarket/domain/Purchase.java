/**
 * 
 */
package com.platzi.cursospring.ejerciciomarket.domain;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author ASUS
 *
 */
public class Purchase {

	private int id;
	private String clientId;
	private LocalDateTime date;
	private String pymentMethod;
	private String comment;
	private String state;
	private List<PurchaseItem> items;
	
	/**
	 * 
	 */
	public Purchase() {
		super();
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the clientId
	 */
	public String getClientId() {
		return clientId;
	}
	/**
	 * @param clientId the clientId to set
	 */
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	/**
	 * @return the date
	 */
	public LocalDateTime getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	/**
	 * @return the pymentMethod
	 */
	public String getPymentMethod() {
		return pymentMethod;
	}
	/**
	 * @param pymentMethod the pymentMethod to set
	 */
	public void setPymentMethod(String pymentMethod) {
		this.pymentMethod = pymentMethod;
	}
	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}
	/**
	 * @param comment the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the item
	 */
	public List<PurchaseItem> getItems() {
		return items;
	}
	/**
	 * @param item the item to set
	 */
	public void setItems(List<PurchaseItem> item) {
		this.items = item;
	}
	
	@Override
	public String toString() {
		return "Purchase [id=" + id + ", clientId=" + clientId + ", date=" + date + ", pymentMethod=" + pymentMethod
				+ ", comment=" + comment + ", state=" + state + ", item=" + items + "]";
	}
	
	

}
