package com.test.services;

import java.util.ArrayList;
import java.util.List;

public class ServiceA{
	
	public List<String> something() throws Exception{
		System.out.println("Service A started");
		List<String> names = new ArrayList<String>();
		names.add("A");
		System.out.println("Adding A");
		Thread.sleep(5000);
		names.add("B");
		System.out.println("Adding B");
		names.add("C");
		System.out.println("Adding C");
		Thread.sleep(5000);
		names.add("D");
		System.out.println("Adding D");
		names.add("E");
		System.out.println("Adding E");
		names.add("F");
		System.out.println("Adding F");
		Thread.sleep(5000);
		names.add("G");
		System.out.println("Adding G");
		names.add("H");
		System.out.println("Adding H");
		names.add("I");
		System.out.println("Adding I");
		Thread.sleep(15000);
		names.add("J");
		System.out.println("Adding J");
		names.add("K");
		System.out.println("Adding K");
		Thread.sleep(1000);
		return names;
	}
}
