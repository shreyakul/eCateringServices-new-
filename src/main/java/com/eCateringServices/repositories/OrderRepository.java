package com.eCateringServices.repositories;

import org.springframework.data.repository.CrudRepository;

import com.eCateringServices.entities.OrderEntity;

public interface OrderRepository extends CrudRepository<OrderEntity, Long> {
	
	OrderEntity findByOrderId(String orderId);

}
