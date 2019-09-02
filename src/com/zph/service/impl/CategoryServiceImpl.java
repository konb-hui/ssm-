package com.zph.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.zph.mapper.CategoryMapper;
import com.zph.pojo.Category;
import com.zph.pojo.Page;
import com.zph.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryMapper categoryMapper;
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categoryMapper.list();
	}
	@Override
	public int total() {
		// TODO Auto-generated method stub
		return categoryMapper.total();
	}
	@Override
	public List<Category> list(Page page) {
		// TODO Auto-generated method stub
		return categoryMapper.list(page);
	}
	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		return categoryMapper.get(id);
	}
	@Override
	public void update(Category category) {
		// TODO Auto-generated method stub
		categoryMapper.update(category);
	}
	@Override
	public void add(Category category) {
		// TODO Auto-generated method stub
		categoryMapper.add(category);
	}
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		categoryMapper.delete(id);
	}
	@Override
	@Transactional(propagation=Propagation.REQUIRED,rollbackForClassName="Exception")
	public void addTwo() {
		// TODO Auto-generated method stub
		Category c1 = new Category();
		c1.setName("短的名字");
		categoryMapper.add(c1);
		
		Category c2 = new Category();
		c2.setName("名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,");
		categoryMapper.add(c2);
	}
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		List<Category> cs = list();
		for(Category c:cs) {
			categoryMapper.delete(c.getId());
		}
	}

}
