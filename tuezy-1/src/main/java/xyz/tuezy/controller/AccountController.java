package xyz.tuezy.controller;

import java.security.Principal;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import xyz.tuezy.utils.WebUtils;

@Controller
public class AccountController {
	@RequestMapping(value = "/userAccountInfo", method = RequestMethod.GET)
	public String index(Model model,  Principal principal) {
		String userName = principal.getName();
		 
        System.out.println("User Name: " + userName);
 
        User loginedUser = (User) ((Authentication) principal).getPrincipal();
 
        String userInfo = WebUtils.toString(loginedUser);
        model.addAttribute("userInfo", userInfo);
         
        return "account";
	}
}
