package com.ustglobal.springmvcassesment.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ustglobal.springmvcassesment.dto.Product;
import com.ustglobal.springmvcassesment.dto.Retailer;
import com.ustglobal.springmvcassesment.service.RetailerService;

@Controller
public class RetailerControler {

	@Autowired
	private RetailerService service;
	
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}//end of loginPage
	
	@PostMapping("/login")
	public String login(int id, String password, HttpServletRequest request) {
		Retailer bean = service.login(id, password);
		if(bean == null) {
			request.setAttribute("msg", "Id is not found.Please Register");
			return "login";
		}else {
			HttpSession session = request.getSession();
			session.setAttribute("bean", bean);
			return "home";
		}
		
	}//end of login
	
	@GetMapping("/register")
	public String registerPage() {
		return "register";
	}//end of registerPage

	@PostMapping("/register")
	public String register(Retailer bean, ModelMap map) {

		int check = service.register(bean);
		if(check > 0) {
			map.addAttribute("msg", "You are Registered and ID is " +check);
		}else {
			map.addAttribute("msg", "Email is repeated");
		}
		return "login";
	}//end of register
	
	@GetMapping("/home")
	public String home(ModelMap map, @SessionAttribute(name="bean",required = false) Retailer bean){
		if(bean == null) {
			map.addAttribute("msg", "Login First");
			return "login";
		}else {
			return "home";
		}
	}//end of home

	@PostMapping("/home")
	public String home() {
		return "home";
	}//end of home
	
	@GetMapping("/search")
	public String search(@RequestParam("pid")int pid, ModelMap map) {
		Product product = service.searchProduct(pid);
		if(product == null) {
			map.addAttribute("msg", "Data Not Found");
		} else {
			map.addAttribute("product",product);
		}
		return "home";
	}//end of search
	
	@GetMapping("/updatepassword")
	public String updatePassword(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if(session != null) {
			return "updatepassword";
		}else {
			return "login";
		}
	}//end of updatePassword
	
	@PostMapping("/updatepassword")
	public String updatePassword(String password, String confirmpassword, @SessionAttribute(name="bean")Retailer bean, ModelMap map) {
		if(password.equals(confirmpassword)) {
			service.updatePassword(bean.getId(), confirmpassword);
			map.addAttribute("msg", "Password Changed");
		}else {
			map.addAttribute("msg", "Password is not matching");
		}
		return "home";
	}//end of updatePassword
	
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";
	}//end of logout

		
	
	
	
}//end of RetailerController
