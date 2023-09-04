package com.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	
}
