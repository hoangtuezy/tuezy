package xyz.tuezy.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.annotation.SessionScope;

import xyz.tuezy.model.Session;

@Controller
public class MainController extends BaseController{
		
	@RequestMapping("/index")
	public String index(@RequestParam("name") String name,Model model, HttpServletRequest  request) {
		HttpSession session = request.getSession();
		String currentURL = request.getRequestURL().toString();
		model.addAttribute("current_url", currentURL);
		model.addAttribute("website_title", "This for demo");
		model.addAttribute("name", name);
        
		return "index";
	}
	
	
}
