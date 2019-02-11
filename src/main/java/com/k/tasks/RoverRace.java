package com.k.tasks;

import java.util.Arrays;

import com.k.api.RoverIPLogic;
import com.k.model.Rover;

/**
 * @author Parik
 *
 * RoverRace.java - Feb 11, 2019
 */
public class RoverRace {

	public static void main(String[] args) throws InterruptedException {

		Rover roverJoe = new Rover("Joe", "FRFLLFRF", 3);
		Rover roverBill = new Rover("Bill", "FFFFFLF", 1);
		Rover roverJim = new Rover("Jim", "LFRF", 2);

		Thread roverJoeThread = new Thread(
				new RoverIPLogic(roverJoe), roverJoe.getName());
		Thread roverBillThread = new Thread(
				new RoverIPLogic(roverBill), roverBill.getName());
		Thread roverJimThread = new Thread(
				new RoverIPLogic(roverJim), roverJim.getName());

		roverJoeThread.start();
		roverBillThread.start();
		roverJimThread.start();

		roverJoeThread.join();
		roverBillThread.join();
		roverJimThread.join();

		System.out.println("The race has ENDED!");

		if (roverJoe.getRank() == 1) {
			System.out.println(roverJoe.getName() + " is #" + roverJoe.getRank() 
			+ " , at " + Arrays.toString(roverJoe.getLocation()));
		} else if (roverBill.getRank() == 1) {
			System.out.println(roverBill.getName() + " is #" 
					+ roverBill.getRank() + " , at " 
					+ Arrays.toString(roverBill.getLocation()));
		} else if (roverJim.getRank() == 1) {
			System.out.println(roverJim.getName() + " is #" + roverJim.getRank() 
			+ " , at " + Arrays.toString(roverJim.getLocation()));
		}

		if (roverJoe.getRank() == 2) {
			System.out.println(roverJoe.getName() + " is #" + roverJoe.getRank() 
			+ " , at " + Arrays.toString(roverJoe.getLocation()));
		} else if (roverBill.getRank() == 2) {
			System.out.println(roverBill.getName() + " is #" 
					+ roverBill.getRank() + " , at " 
					+ Arrays.toString(roverBill.getLocation()));
		} else if (roverJim.getRank() == 2) {
			System.out.println(roverJim.getName() + " is #" + roverJim.getRank() 
			+ " , at " + Arrays.toString(roverJim.getLocation()));
		}

		if (roverJoe.getRank() == 3) {
			System.out.println(roverJoe.getName() + " is #" + roverJoe.getRank() 
			+ " , at " + Arrays.toString(roverJoe.getLocation()));
		} else if (roverBill.getRank() == 3) {
			System.out.println(roverBill.getName() + " is #" 
					+ roverBill.getRank() + " , at " 
					+ Arrays.toString(roverBill.getLocation()));
		} else if (roverJim.getRank() == 3) {
			System.out.println(roverJim.getName() + " is #" + roverJim.getRank() 
			+ " , at " + Arrays.toString(roverJim.getLocation()));
		}
	}
}