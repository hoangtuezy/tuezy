package xyz.tuezy.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import xyz.tuezy.mapper.UserMapper;
import xyz.tuezy.model.Account;

@Repository
@Transactional
public class UserDAO extends JdbcDaoSupport{
	@Autowired
    public UserDAO(DataSource dataSource) {
        this.setDataSource(dataSource);
    }
	public Account findUserAccount(String userName) {
        // Select .. from App_User u Where u.User_Name = ?
        String sql = UserMapper.BASE_SQL + " where u.username = ? ";
 
        Object[] params = new Object[] { userName };
        UserMapper mapper = new UserMapper();
        try {
            Account userInfo = this.getJdbcTemplate().queryForObject(sql, params, mapper);
            return userInfo;
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }
	
	public List<String> getRoleNames(Long userId) {
        String sql = "Select u.role " //
                + " from User u" //
                + " where u.id = ? ";
 
        Object[] params = new Object[] { userId };
 
        List<String> roles = this.getJdbcTemplate().queryForList(sql, params, String.class);
 
        return roles;
    }
	
}
