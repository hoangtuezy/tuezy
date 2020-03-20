package tuezy;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Hashtable;

import javax.servlet.http.HttpSession;

public class Router extends AbstractController{
	HttpSession session;
	Hashtable<String, String> route;
	@Override
	public void execute() {
		PrintWriter out = null;
		try {
			out = this.getResponse().getWriter();
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		this.session = this.getRequest().getSession(true);
		String root = this.getRequest().getServletContext().getRealPath("/");
	
			
	}





}
