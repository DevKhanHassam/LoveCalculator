package com.lc.Dao;

import java.util.List;

public interface LvQueryInterface {

	
	
	public String addUserData(String uName,String cName, int uAge,String uEmail,String uResult);
	
	public List<userData> showData(String name, String email);
}
