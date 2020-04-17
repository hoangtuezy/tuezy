package xyz.tuezy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class Account {
	public Account() {
		 
    }
 
    public Account(Long userId, String userName, String encrytedPassword) {
        this.id = userId;
        this.username = userName;
        this.password = encrytedPassword;
    }
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = "stt")
    private int stt;
	
	@Column(name = "name")
    private String name;
	
	@Column(name = "photo")
    private String photo;
	
	@Column(name = "description")
    private String description;
	
	@Column(name = "content")
    private String content;
	
	@Column(name = "role")
    private int role;
	
	@Column(name = "email")
    private String email;
	
	
	@Column(name = "password")
    private String password;
	
	
	@Column(name = "username")
    private String username;
	
	@Column(name = "birthday")
    private String birthday;
	
	@Column(name = "token")
    private String token;
	
	@Column(name = "last_login")
    private String lastLogin;
	
	@Column(name = "remember_token")
    private String rememberToken;
	
	@Column(name = "created")
    private String created;
	
	@Column(name = "updated")
    private String updated;

	public int getStt() {
		return stt;
	}

	public void setStt(int stt) {
		this.stt = stt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}

	public String getRememberToken() {
		return rememberToken;
	}

	public void setRememberToken(String rememberToken) {
		this.rememberToken = rememberToken;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Account(Long id, int stt, String name, String photo, String description, String content, int role, String email,
			String password, String username, String birthday, String token, String lastLogin, String rememberToken,
			String created, String updated) {
		super();
		this.id = id;
		this.stt = stt;
		this.name = name;
		this.photo = photo;
		this.description = description;
		this.content = content;
		this.role = role;
		this.email = email;
		this.password = password;
		this.username = username;
		this.birthday = birthday;
		this.token = token;
		this.lastLogin = lastLogin;
		this.rememberToken = rememberToken;
		this.created = created;
		this.updated = updated;
	}

	public Long getId() {
		return id;
	}

	public static Object withDefaultPasswordEncoder() {
		// TODO Auto-generated method stub
		return null;
	}
	
}