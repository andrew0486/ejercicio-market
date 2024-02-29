/**
 * 
 */
package com.platzi.cursospring.ejerciciomarket.domain;

import java.math.BigDecimal;

/**
 * @author ASUS
 *
 */
public class PurchaseItem {

	private int id;
	private int quantity;
	private BigDecimal total;
	private boolean active;
	/**
	 * 
	 */
	public PurchaseItem() {
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
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the total
	 */
	public BigDecimal getTotal() {
		return total;
	}
	/**
	 * @param total the total to set
	 */
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	/**
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}
	/**
	 * @param active the active to set
	 */
	public void setActive(boolean active) {
		this.active = active;
	}
	
	@Override
	public String toString() {
		return "PurchaseItem [id=" + id + ", quantity=" + quantity + ", total=" + total + ", active=" + active + "]";
	}
	
	

}
