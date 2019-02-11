package com.k.tasks;

/**
 * @author Parik
 *
 * CountingPart2.java - Feb 10, 2019
 */
public class CountingPart2 {

	void countUpAndDown (int start, int end) {

		System.out.println(start);

		if (start < end) {

			countUpAndDown(start+1, end);

			System.out.println(start);
		}
	}

	public static void main(String[] args) {

		CountingPart2 c = new CountingPart2();

		c.countUpAndDown(1, 5);
	}
}