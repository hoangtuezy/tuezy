package tuezy;

import java.io.File;
import java.io.FileNotFoundException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public abstract class AbstractController implements Controller{
	private HttpServletRequest request;
	private HttpServletResponse response;
	protected String pageContent;
	@Override
	public void init(HttpServletRequest request, HttpServletResponse response) {
		this.request = request;
		this.response = response;
	}
	protected HttpServletRequest getRequest(){
		return this.request;
	}
	protected HttpServletResponse getResponse(){
		return this.response;
	}
	
	public abstract void execute();
	@Override
	public String toString() {
		return this.pageContent;
	}
}
