package tuezy;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Application {
	private Database database;
	private Request request;
	
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		this.request = new Request(request, response);
		String queryString = request.getQueryString();
		String path = request.getRequestURI();
		System.out.println(path);
	}


}
