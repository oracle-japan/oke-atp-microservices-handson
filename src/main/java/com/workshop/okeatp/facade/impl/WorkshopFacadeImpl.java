package com.workshop.okeatp.facade.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop.okeatp.dataset.Items;
import com.workshop.okeatp.dataset.ItemsExample;
import com.workshop.okeatp.facade.WorkshopFacade;
import com.workshop.okeatp.service.CommentsService;
import com.workshop.okeatp.service.ItemsCtdService;
import com.workshop.okeatp.service.ItemsService;
import com.workshop.okeatp.service.OffersService;
import com.workshop.okeatp.service.UsersService;

@Service
public class WorkshopFacadeImpl implements WorkshopFacade {

	@Autowired
	CommentsService commentsService;

	@Autowired
	ItemsCtdService itemsCtdService;

	@Autowired
	ItemsService itemsService;

	@Autowired
	OffersService offersService;

	@Autowired
	UsersService usersService;

	@Override
	public List<Items> selectItemsList() {

		ItemsExample example = new ItemsExample();
		return itemsService.selectByExample(example);
	}

}
