package com.lc.Service;

import org.springframework.stereotype.Service;

@Service
public class LoveService {
	
	
	
	public String result()
	
	{
		String resultArr[]= {"Friend","LifePartner","Enemy"};
		
		
		int a= (int) (Math.random()*3);
		
		String result=resultArr[a];
		
		return  result;
		
		
	}
	
	
	
	

}
