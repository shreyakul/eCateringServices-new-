package com.eCateringServices.dto;

import java.io.Serializable;

public class MenuDto implements Serializable{
	
	private static final long serialVersionUID = -8978558492303773093L;
	
	private long id;
	private String menuId;
	private String dishName;
	private String dishCategory;
	private float dishPrice;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMenuId() {
		return menuId;
	}
	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}
	public String getDishName() {
		return dishName;
	}
	public void setDishName(String dishName) {
		this.dishName = dishName;
	}
	public String getDishCategory() {
		return dishCategory;
	}
	public void setDishCategory(String dishCategory) {
		this.dishCategory = dishCategory;
	}
	public float getDishPrice() {
		return dishPrice;
	}
	public void setDishPrice(float dishPrice) {
		this.dishPrice = dishPrice;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
