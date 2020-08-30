package com.eCateringServices.repositories;

import org.springframework.data.repository.CrudRepository;

import com.eCateringServices.entities.MenuEntity;

public interface MenuRepository extends CrudRepository<MenuEntity, Long>{
	
		MenuEntity findByMenuId(String foodId);
			
			
}
