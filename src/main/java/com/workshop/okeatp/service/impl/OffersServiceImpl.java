package com.workshop.okeatp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop.okeatp.dataset.Offers;
import com.workshop.okeatp.dataset.OffersExample;
import com.workshop.okeatp.mapper.OffersMapper;
import com.workshop.okeatp.service.OffersService;

@Service
public class OffersServiceImpl implements OffersService {

	@Autowired
	OffersMapper offersMapper;

	@Override
	public long countByExample(OffersExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(OffersExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Offers record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Offers record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Offers> selectByExample(OffersExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByExampleSelective(Offers record, OffersExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(Offers record, OffersExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

}
