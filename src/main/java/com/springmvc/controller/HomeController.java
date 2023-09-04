package com.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.entity.User;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model m)
	{
		m.addAttribute("name", "Seema");
		m.addAttribute("id", 101);
		
		return "home";
	}

	
	@RequestMapping("/login")
	public ModelAndView login()
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("name","Sonia");
		mv.addObject("id",102);
		mv.setViewName("login");
		return mv;
	}
	
	@RequestMapping("/testjstl")
	public ModelAndView testjstl()
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("name","Sonia Verma");
		mv.addObject("id",103);
		List<Integer> marks=new ArrayList<Integer>();
		marks.add(100);
		marks.add(86);
		marks.add(89);
		marks.add(95);
		mv.addObject("m",marks);
		mv.setViewName("testjstl");
		return mv;
	}
	
	@RequestMapping("/register")
	public String signup()
	{		
		return "register";
	}
	
	@RequestMapping(path="/createUser", method= RequestMethod.POST)
	public String registerUser(@ModelAttribute User user, @RequestParam("img") String img )
	{
		System.out.println(img);
		System.out.println(user);
		return "register";
	}
	
}
