package com.test.services;

import java.util.ArrayList;
import java.util.List;

public class ServiceB{
	
	public List<String> something() throws Exception{
		System.out.println("Service B started");
		List<String> names = new ArrayList<String>();
		names.add("Z");
		System.out.println("Adding Z");
		Thread.sleep(5000);
		names.add("Y");
		System.out.println("Adding Y");
		names.add("X");
		System.out.println("Adding X");
		Thread.sleep(5000);
		names.add("W");
		System.out.println("Adding W");
		names.add("V");
		System.out.println("Adding V");
		Thread.sleep(15000);
		names.add("U");
		System.out.println("Adding U");
		names.add("T");
		System.out.println("Adding T");
		Thread.sleep(1000);
		names.add("S");
		System.out.println("Adding S");
		Thread.sleep(1000);
		names.add("R");
		System.out.println("Adding R");
		Thread.sleep(1000);
		return names;
	}
}
