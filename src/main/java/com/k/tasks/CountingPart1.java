package com.k.tasks;

/**
 * @author Parik
 *
 * CountingPart1.java - Feb 10, 2019
 */
public class CountingPart1 {

	public void countUp (int start, int end) {
		
		if (start > end) {
			
			return;
		}
		
		System.out.println(start);
		
		start += 1;
		
		countUp(start, end);
	}
	
	public static void main(String[] args) {
		
		CountingPart1 c = new CountingPart1();
		
		c.countUp(1, 5);
	}
}