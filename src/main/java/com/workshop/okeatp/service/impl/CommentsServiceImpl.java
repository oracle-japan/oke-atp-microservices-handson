package com.workshop.okeatp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop.okeatp.dataset.Comments;
import com.workshop.okeatp.dataset.CommentsExample;
import com.workshop.okeatp.mapper.CommentsMapper;
import com.workshop.okeatp.service.CommentsService;

@Service
public class CommentsServiceImpl implements CommentsService {

	@Autowired
	CommentsMapper commentsMapper;

	@Override
	public long countByExample(CommentsExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteByExample(CommentsExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Comments record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Comments record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Comments> selectByExample(CommentsExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByExampleSelective(Comments record, CommentsExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(Comments record, CommentsExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

}
