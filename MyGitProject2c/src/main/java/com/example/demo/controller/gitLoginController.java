package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class gitLoginController {

	//最初のページ
	@RequestMapping(path = "/gitpralogin", method = RequestMethod.GET)
	public String doLoginGet() {
		return "gitlogin";
	}

	@RequestMapping(path = "/gitlogin", method = RequestMethod.POST)
	public String login(String ID,String password, RedirectAttributes redirectAttributes) {

		
		redirectAttributes.addFlashAttribute("ID", ID);
		redirectAttributes.addFlashAttribute("password", password);

		if(ID.equals("gitlogin")) {
			if(password.equals("gitpw")) {
				return "redirect:/gititemlist";
			}else {
				return "redirect:/gitlogin";
			}
		}else {
			return "redirect:/gitlogin";
		}
		
		
	}
}