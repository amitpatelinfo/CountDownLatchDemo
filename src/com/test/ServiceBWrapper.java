package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

import com.test.services.ServiceB;

public class ServiceBWrapper implements Runnable {
	private final CountDownLatch startSignal;
	private final CountDownLatch doneSignal;

	private List<String> names = new ArrayList<String>();

	public ServiceBWrapper(CountDownLatch startSignal, CountDownLatch doneSignal) {
		this.startSignal = startSignal;
		this.doneSignal = doneSignal;
	}

	public void run() {
		try {
			startSignal.await();
			names = new ServiceB().something();
			doneSignal.countDown();
		} catch (Exception ex) {
			//Catch Exception here....
		} 
	}

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}
}
