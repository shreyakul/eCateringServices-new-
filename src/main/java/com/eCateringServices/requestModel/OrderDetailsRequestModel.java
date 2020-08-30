package com.eCateringServices.requestModel;

public class OrderDetailsRequestModel {
	
	private String[] item;
	private String userId;
	private float cost;

	public String[] getItem() {
		return item;
	}
	public void setItem(String[] item) {
		this.item = item;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
}
