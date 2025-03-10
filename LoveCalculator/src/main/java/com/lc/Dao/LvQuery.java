package com.lc.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class LvQuery implements LvQueryInterface {
	
	@Autowired
	JdbcTemplate jdbc;
	
	public String addUserData(String uName,String cName, int uAge,String uEmail,String uResult)
	{
		String sql="insert into lovetable (USER_NAME,USER_CRUSH,USER_AGE,USER_EMAIL,USER_RESULT) values (?,?,?,?,?)";
		jdbc.update(sql,uName,cName,uAge,uEmail,uResult);
		return null;}

	
	public List<userData> showData(String name, String email) {
		String sql="select * from lovetable where USER_NAME=?";
		List<userData> loveList = jdbc.query(sql,new BeanPropertyRowMapper<userData>(userData.class),name);
		return loveList;
	}

	
	
	

}
