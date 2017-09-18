package com.hcl.programmingchallenge1;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {
	public static void main(String args[]) {
		ConcurrentLinkedQueue<Integer> inQueue = new ConcurrentLinkedQueue<Integer>();
		ConcurrentLinkedQueue<PrimeResponse> outQueue = new ConcurrentLinkedQueue<PrimeResponse>();
		new Thread(new Randomizer(inQueue, outQueue)).start();
		new Thread(new Prime(inQueue, outQueue)).start();
	}
}
