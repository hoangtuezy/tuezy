package xyz.tuezy.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import xyz.tuezy.model.Account;

public class UserMapper implements RowMapper<Account>{
	 public static final String BASE_SQL //
     = "Select u.id, u.username, u.password From Account u ";
	@Override
	public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
		 Long userId = rs.getLong("id");
	        String userName = rs.getString("username");
	        String encrytedPassword = rs.getString("password");
	 
	        return new Account(userId, userName, encrytedPassword);
	}

}
