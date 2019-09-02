package com.zph.service;

import java.util.List;

import com.zph.pojo.Category;
import com.zph.pojo.Page;

public interface CategoryService {
	List<Category> list();
	int total();
	List<Category> list(Page page);
	Category get(int id);
	void update(Category category);
	void add(Category category);
	void delete(int id);
	void addTwo();
	void deleteAll();
}
