package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

import com.test.services.ServiceC;

public class TestDriver {

	public static void main(String[] args) throws Exception{
		CountDownLatch startSignal = new CountDownLatch(1);
	     CountDownLatch doneSignal = new CountDownLatch(2);
	     
	     ServiceAWrapper aWrapper = new ServiceAWrapper(startSignal, doneSignal);
	     ServiceBWrapper bWrapper = new ServiceBWrapper(startSignal, doneSignal);
	     new Thread(aWrapper).start();
	     new Thread(bWrapper).start();

	     System.out.println("Lets start all the threads......");
	     startSignal.countDown();
	     System.out.println("All threads started....");
	     doneSignal.await();// wait for all to finish
	     System.out.println("Test Driver finished....");
	     List<String> allNames = new ArrayList<>();
	     allNames.addAll(aWrapper.getNames());
	     allNames.addAll(bWrapper.getNames());
	     new ServiceC().something(allNames);
	}
}
