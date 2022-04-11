package com.smg.data;

import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.smg.models.UserModel;

@Service
public class UserDataService implements DataAccessInterface <UserModel> {

	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	public DataSource getDataSource() {
		return dataSource;
	}
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public JdbcTemplate getJdbcTemplateObject() {
		return jdbcTemplateObject;
	}
	
	public void setJdbcTemplateObject(JdbcTemplate jdbcTemplateObject) {
		this.jdbcTemplateObject = jdbcTemplateObject;
	}
	
	public UserDataService(DataSource dataSource) {
		
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	@Override
	public List<UserModel> findAll() {
		
		String sql = "SELECT * FROM users INNER JOIN user_data ON users.ID=user_data.USER_ID;";
		
		List<UserModel> users = new ArrayList<UserModel>();
		try
		{
			// Execute SQL Query and loop over result set
			SqlRowSet srs = jdbcTemplateObject.queryForRowSet(sql);
			while(srs.next())
			{
				users.add(new UserModel(srs.getLong("ID"),
											srs.getString("NAME"),
											srs.getString("USER_NAME"),
											srs.getString("EMAIL")));
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return users;
	}

	@Override
	public UserModel findById(int id) {	
		return null;
	}


	@Override
	public boolean create(UserModel user) {
		String sql = "INSERT INTO users (USERNAME, PASSWORD, ROLE) VALUES(?, ?, ?)"; 
		String role = "ROLE_USER";		
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String encodedPassword = passwordEncoder.encode(user.getPassword());
		user.setPassword(encodedPassword);
		System.out.println("create method called successfully");
			
		try
		{
			// Execute SQL Insert
			System.out.println("passwords matched");
			
			int rows = jdbcTemplateObject.update(sql,
												user.getUsername(), 
												user.getPassword(),
												role);
			System.out.println("update method called");
			return rows == 1 ? true: false;
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return false;
		} 
	

	@Override
	public boolean update(UserModel user) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean delete(UserModel user) {
		// TODO Auto-generated method stub
		return false;
	}
}
