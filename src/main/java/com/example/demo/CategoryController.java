package com.example.demo;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CategoryController {
	
		
		@Autowired
		HttpSession session;
		
		@Autowired
		CategoryRepository categoryRepository;
		
		@RequestMapping(value="/categorylist")
		public ModelAndView category(ModelAndView mv) {
			List<Category> categoryList = categoryRepository.findAll();
			mv.addObject("categorylist", categoryList);
			mv.setViewName("categorylist");
			return mv;
		}

}
