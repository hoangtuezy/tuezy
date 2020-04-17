package xyz.tuezy.controller;

import java.security.Principal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import xyz.tuezy.utils.WebUtils;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
 
@Controller
public class AdminController {
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String index(Model model,  Principal principal) {
		User loginedUser = (User) ((Authentication) principal).getPrincipal();
		String userInfo = WebUtils.toString(loginedUser);
        model.addAttribute("userInfo", userInfo);
         
        return "index";
	}
}
