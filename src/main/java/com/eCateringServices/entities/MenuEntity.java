package com.eCateringServices.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="menu")
public class MenuEntity {

	@Id
	@GeneratedValue
	private long id;
	
	@Column(nullable= false)
	private String menuId;
	
	@Column(nullable= false, length=80)
	private String dishName;
	
	@Column(nullable= false, length=60)
	private String dishCategory;
	
	@Column(nullable= false, length=10)
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

	
}
