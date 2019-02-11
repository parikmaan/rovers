package com.k.api;

import com.k.model.Direction;
import com.k.model.Rover;

/**
 * @author Parik
 *
 * RoverIPLogic.java - Feb 11, 2019
 */
public class RoverIPLogic implements Runnable {

	private static int count = 1;

	private Rover rover;

	public RoverIPLogic (Rover rover) {
		this.rover = rover;
	}

	public void processInstructions (boolean isRace) {

		try {

			String[] instructionsArray = this.rover.getInstructions().split("");
			int delay = rover.getDelay();

			for (String instruction: instructionsArray) {

				switch (instruction) {
				case "L":
					changeDirection(rover, instruction);
					if (isRace)
						doRaceStuff(delay, ": Turns L");
					break;
				case "R":
					changeDirection(rover, instruction);
					if (isRace)
						doRaceStuff(delay, ": Turns R");
					break;
				case "F":
					move(rover);
					if (isRace)
						doRaceStuff(delay, ": Moves F");
					break;
				default:
					System.out.println("System crashed!!!!!");
				}
			}

			if (isRace) {
				synchronized (RoverIPLogic.class) {
					rover.setRank(count);
					count++;
				}
			}
		} catch (InterruptedException exception) {
			System.out.println("System crashed!!!!!");
		}
	}

	private void changeDirection (Rover rover, String instruction) {

		if (instruction.equals("L")) {
			if (rover.getDirection().equals(Direction.EAST)) {
				rover.setDirection(Direction.NORTH);
			} else if (rover.getDirection().equals(Direction.NORTH)) {
				rover.setDirection(Direction.WEST);
			} else if (rover.getDirection().equals(Direction.WEST)) {
				rover.setDirection(Direction.SOUTH);
			} else {
				rover.setDirection(Direction.EAST);
			}
		} else {
			if (rover.getDirection().equals(Direction.EAST)) {
				rover.setDirection(Direction.SOUTH);
			} else if (rover.getDirection().equals(Direction.SOUTH)) {
				rover.setDirection(Direction.WEST);
			} else if (rover.getDirection().equals(Direction.WEST)) {
				rover.setDirection(Direction.NORTH);
			} else {
				rover.setDirection(Direction.EAST);
			}
		}
	}

	private void move (Rover rover) {

		if (rover.getDirection().equals(Direction.EAST)) {
			rover.getLocation()[0]++;
		} else if (rover.getDirection().equals(Direction.NORTH)) {
			rover.getLocation()[1]++;
		} else if (rover.getDirection().equals(Direction.WEST)) {
			rover.getLocation()[0]--;
		} else {
			rover.getLocation()[1]--;
		}
	}

	@Override
	public void run() {

		processInstructions(true);
	}

	private void doRaceStuff(int delay, String instructionMessage) 
			throws InterruptedException {

		System.out.println(rover.getName() + instructionMessage);

		Thread.sleep(delay);
	}
}