package com.workshop.okeatp.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.workshop.okeatp.dataset.ItemsCtd;
import com.workshop.okeatp.dataset.ItemsCtdExample;
import com.workshop.okeatp.mapper.ItemsCtdMapper;
import com.workshop.okeatp.service.ItemsCtdService;

@Service
public class ItemsCtdServiceImpl implements ItemsCtdService {

	ItemsCtdMapper itemsCtdMapper;

	@Override
	public long countByExample(ItemsCtdExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(ItemsCtdExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(ItemsCtd record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(ItemsCtd record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ItemsCtd> selectByExample(ItemsCtdExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByExampleSelective(ItemsCtd record, ItemsCtdExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(ItemsCtd record, ItemsCtdExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

}
