package com.zph.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zph.pojo.Category;
import com.zph.pojo.Page;
import com.zph.service.CategoryService;

@Controller
@RequestMapping("")
public class CategoryController {
	@Autowired
	CategoryService categoryService;
	
	@RequestMapping("listCategory")
	public ModelAndView listCategory(Page page) {
		ModelAndView mav = new ModelAndView();
		int total = categoryService.total();
		page.caculateLast(total);
		if(page.getStart() < 0) page.setStart(0);
		else if(page.getStart() >= total) page.setStart(page.getLast());

		List<Category> cs = categoryService.list(page);
		
		//放入转发参数
		mav.addObject("cs",cs);
		//放入jsp路径
		mav.setViewName("listCategory");
		return mav;
	}
	@RequestMapping("editCategory")
	public ModelAndView editCategory(Category c) {
		ModelAndView mav = new ModelAndView();
		Category category = categoryService.get(c.getId());
		mav.addObject("category",category);
		mav.setViewName("update");
		
		return mav;
	}
	@RequestMapping("update")
	public ModelAndView updateCategory(Category category) {
		categoryService.update(category);
		ModelAndView mav = new ModelAndView("redirect:/listCategory");
		return mav;
	}
	@RequestMapping("addCategory")
	public ModelAndView addCategory(Category category) {
		categoryService.add(category);
		ModelAndView mav = new ModelAndView("redirect:/listCategory");
		return mav;
	}
	@RequestMapping("deleteCategory")
	public ModelAndView deleteCategory(Category category) {
		categoryService.delete(category.getId());
		ModelAndView mav = new ModelAndView("redirect:/listCategory");
		return mav;
	}
}
