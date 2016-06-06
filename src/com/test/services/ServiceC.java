package com.test.services;

import java.util.List;

public class ServiceC{
	
	public List<String> something(List<String> names) throws Exception{
		System.out.println("Service C started");
		for(String name : names){
			System.out.println(name);
		}
		return names;
	}
}
