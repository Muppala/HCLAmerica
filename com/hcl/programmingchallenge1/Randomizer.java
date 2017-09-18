package com.hcl.programmingchallenge1;

import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Generates 10 positive random integers that are less than 50 and send those to
 * Prime via a distributed queue of integers
 * 
 * @author hmuppala
 *
 */
public class Randomizer implements Runnable {

	ConcurrentLinkedQueue<Integer> inQueue;
	ConcurrentLinkedQueue<PrimeResponse> outQueue;

	public Randomizer(ConcurrentLinkedQueue<Integer> inQueue, ConcurrentLinkedQueue<PrimeResponse> outQueue) {
		super();
		this.inQueue = inQueue;
		this.outQueue = outQueue;
	}

	@Override
	public void run() {
		Random random = new Random();
		try {
			for (int i = 1; i <= 10; i++) {
				// Generate the next random integer and add it to the queue
				int nextInteger = random.nextInt(50) + 1;
				inQueue.add(nextInteger);
				System.out.println("Next Integer " + nextInteger + " added to the input queue by Randomizer");
				
				Thread.currentThread();
				Thread.sleep(500);
				//Check if the response is available on the response queue
				while(!outQueue.isEmpty()) {
					System.out.println("Randomizer received response - " + outQueue.poll());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
