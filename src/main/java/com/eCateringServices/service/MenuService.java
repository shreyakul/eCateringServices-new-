package com.eCateringServices.service;

import java.util.List;

import com.eCateringServices.dto.MenuDto;

public interface MenuService {
	
	MenuDto createMenu(MenuDto menu);
	MenuDto getMenuById(String menuId);
	MenuDto updateFoodDetails(String menuId, MenuDto menuDetails);
	void deleteMenuItem(String id);
	List<MenuDto> getMenus();
}
