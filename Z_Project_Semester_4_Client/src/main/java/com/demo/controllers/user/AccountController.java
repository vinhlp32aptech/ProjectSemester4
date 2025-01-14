package com.demo.controllers.user;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.demo.models.Account;
import com.demo.models.Role;
import com.demo.services.APIClient;
import com.demo.services.AccountAPIService;
import com.demo.services.RoleAPIService;


@Controller
@RequestMapping(value =  {"", "user/account"})
public class AccountController {


	@RequestMapping(value = {"", "login"}, method = RequestMethod.GET)
	public String login() {
		
		return "user/account/login";
	}
	
//	@RequestMapping(value = {"", "login"}, method = RequestMethod.GET)
//	public String login(@RequestParam(value = "error", required = false) String error,
//			@RequestParam(value = "logout", required = false) String logout, ModelMap modelMap) {
//		if(error != null) {
//			modelMap.put("msg", "Invalid!");
//		}
//		if(logout != null) {
//			modelMap.put("msg", "Logout Successfully!");
//		}
//	
//		return "user/account/login";
//	}
	
	@RequestMapping(value = "register", method = RequestMethod.GET)
	public String register(ModelMap modelMap) {
		try {
			RoleAPIService roleAPIService = APIClient.getClient().create(RoleAPIService.class);
			modelMap.put("roles", roleAPIService.findAll());
			Account account = new Account();
			modelMap.put("account", account);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return "user/account/register";
	}
	
	@RequestMapping(value = "register", method = RequestMethod.POST)
	public String register(@ModelAttribute("account") Account account, @RequestParam("role") String[] roles, @PathVariable("passconfirm") String passconfirm) {
	
		try {
			RoleAPIService roleAPIService = APIClient.getClient().create(RoleAPIService.class);
			AccountAPIService accountAPIService = APIClient.getClient().create(AccountAPIService.class);
			
			if(account.getPassword().equalsIgnoreCase(passconfirm)){
				String hash = new BCryptPasswordEncoder().encode(account.getPassword());
				account.setPassword(hash);
				if(roles.length > 0  && roles != null) {
					for(String role : roles) {
						Role rolee = (Role) roleAPIService.find(role);
						account.getRoles().add(rolee);
					}
				}
				accountAPIService.create(account);	
				return "redirect:/user/account/login";
			}else {
				return "user/account/register";
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return "user/account/register";
	}
	
	@RequestMapping(value = "welcome", method = RequestMethod.GET)
	public String welcome() {
		
		return "account/welcome";
	}
	
	@RequestMapping(value = "accessDenied", method = RequestMethod.GET)
	public String accessDenied() {
		
		return "404/index";
	}
}
