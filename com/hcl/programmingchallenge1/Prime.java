package com.hcl.programmingchallenge1;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Receives the integers sent by randomizer and calculate whether
 * the integer is a prime or not and return the answer 
 * to Randomizer via a distributed queue 
 * @author hmuppala
 *
 */
public class Prime implements Runnable {

	ConcurrentLinkedQueue<Integer> inQueue;
	ConcurrentLinkedQueue<PrimeResponse> outQueue;
	
	public Prime(ConcurrentLinkedQueue<Integer> inQueue, ConcurrentLinkedQueue<PrimeResponse> outQueue) {
		super();
		this.inQueue = inQueue;
		this.outQueue = outQueue;
	}

	@Override
	public void run() {
		Integer nextInteger;
		try {
			while(!inQueue.isEmpty()) {
				nextInteger = inQueue.poll();
				PrimeResponse primeResponse = new PrimeResponse();
				primeResponse.setNumber(nextInteger);
				primeResponse.setPrime(isPrime(nextInteger));
				outQueue.add(primeResponse);
				Thread.currentThread();
				Thread.sleep(500);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private boolean isPrime(int n) {
	    int i;
	    for (i = 2; i < n; i++) {
	        if (n % i == 0) {
	            return false;
	        }
	    }
	    return true;
	}

}
