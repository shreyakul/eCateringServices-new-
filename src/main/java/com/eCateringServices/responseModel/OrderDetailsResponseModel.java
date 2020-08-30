package com.eCateringServices.responseModel;

public class OrderDetailsResponseModel {

	private String orderId;
	private String items[];
	private String userId;
	private float cost;
	private boolean status;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String[] getItems() {
		return items;
	}
	public void setItems(String[] items) {
		this.items = items;
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
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
	
}
