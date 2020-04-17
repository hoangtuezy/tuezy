package xyz.tuezy.model;

import java.util.Hashtable;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class Session {
	private Hashtable<String, Object> session;
	public void add(String key,Object value) {
		this.session.put(key, value);
	}
	public Object get(String key) {
		return this.session.get(key);
	}
}
