package com.forum.dao;

import org.apache.ibatis.annotations.Mapper;

import com.forum.model.Blea;

@Mapper
public interface BleaDao {
	public Blea findById();
}
