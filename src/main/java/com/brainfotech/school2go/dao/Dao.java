package com.brainfotech.school2go.dao;

import java.util.List;

import com.brainfotech.school2go.entity.Entity;


public interface Dao<T extends Entity, I> {

	List<T> findAll();


	T find(I id);


	T save(T newsEntry);


	void delete(I id);

}
