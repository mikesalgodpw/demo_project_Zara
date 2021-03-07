package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.UserRepo;
import com.example.demo.model.User;

@Controller
public class UserController {
	
	@Autowired
	UserRepo repo;
	
	@RequestMapping("/")
	public String displayIndexPage() {
		
		//String val="Val1";
		//model.addAttribute("val", val);
		
		return "index.jsp";
		//return "sds";
	}

	/*
	@RequestMapping("/searchUserById")
	public ModelAndView getUserById (@RequestParam String userId) {
		ModelAndView modelAndView = new ModelAndView("findUserResult.jsp");
		
		User user = repo.findById(Integer.parseInt(userId)).orElse(new User());
		modelAndView.addObject(user);	

	    return modelAndView;
	}
	*/
	
	//(ok)verify: http://localhost:8080/searchUserById?userId=101
	@RequestMapping("/searchUserById")
	public ModelAndView getUserById (@RequestParam Integer userId) {
		ModelAndView modelAndView = new ModelAndView("findUserResult.jsp");
		
		User user = repo.findById(userId).orElse(new User());
		modelAndView.addObject(user);	

	    return modelAndView;
	}
	
	
	//verify: http://localhost:8080/searchUserByUsername?username=user1
	//(need debug) NO result displayed...
	@RequestMapping("/searchUserByUsername")
	public ModelAndView getUserByUsername (@RequestParam String username) {
		ModelAndView modelAndView = new ModelAndView("findUserResult.jsp");
		
		List<User> userlist = repo.findByUsername(username);
		System.out.println(userlist);
		
		//userlist = repo.findByUsernameSorted(username);
		//System.out.println(userlist);
		
		//User user=userlist.get(0);
		
		modelAndView.addObject(userlist);
		//modelAndView.addObject(user);
		//userlist.toString()

	    return modelAndView;
	}

	//verify: http://localhost:8080/Users
	@RequestMapping("/Users")
	@ResponseBody
	public List<User> getUsers () {
	    return repo.findAll();
	}
	

	/*
	@RequestMapping("/User/{id}")
	@ResponseBody
	public String getUser (@PathVariable("id") Integer userId) {

	    return repo.findById(userId).toString();
	}*/
	
	//(ok) verify: http://localhost:8080/User/101
	//@RequestMapping(path="/User/{id}", produces = { "application/json", "application/xml" })
	@RequestMapping(path="/User/{id}", produces = { "application/xml" })
	@ResponseBody
	public Optional<User> getUser (@PathVariable("id") Integer userId) {
	    return repo.findById(userId);
	}

	
    /*
	//display result on the same page, test result: it does not work)
	@RequestMapping("/searchUser")
	public ModelAndView getUserById (@RequestParam String userId) {
		ModelAndView modelAndView = new ModelAndView("findUser.jsp");
		
		User user = repo.findById(Integer.parseInt(userId)).orElse(new User());
		modelAndView.addObject(user);	

	    return modelAndView;
	}*/
    

	//(ok) verified
	@RequestMapping("/addUser")
	public String addUser (User user) {
	    repo.save(user);
	    return "addUserResult.jsp";
	}
	
	/*@GetMapping("/processForm")
	public ModelAndView passParametersWithModelAndView (User user) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("obj", user);
	    return modelAndView;
	}*/


	
	
	/*
	@RequestMapping("/displayUser")
	public String addUser (@RequestParam String id) {
		
		System.out.println("------userId: " + id);
	    return "displayUser.jsp";
	}*/
	
	/*
	@RequestMapping("/displayUser")
	public String addUser () {
		
		System.out.println("------addUser()");
	    return "displayUser.jsp";
	}*/
	//
}
