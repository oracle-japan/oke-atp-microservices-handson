package com.workshop.okeatp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop.okeatp.dataset.Items;
import com.workshop.okeatp.dataset.ItemsExample;
import com.workshop.okeatp.mapper.ItemsMapper;
import com.workshop.okeatp.service.ItemsService;

@Service
public class ItemsServiceImpl implements ItemsService {

	@Autowired
	ItemsMapper itemsMapper;

	@Override
	public long countByExample(ItemsExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(ItemsExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Items record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Items record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Items> selectByExample(ItemsExample example) {

		return itemsMapper.selectByExample(example);
	}

	@Override
	public int updateByExampleSelective(Items record, ItemsExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(Items record, ItemsExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

}
