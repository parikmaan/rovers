package com.k.model;

/**
 * @author Parik
 * 
 * Rover.java - Feb 10, 2019
 */
public class Rover {

	private int[] location;
	private Direction direction;
	private int delay;
	private String name;
	private String instructions;
	private int rank;

	public Rover () {
		this.location = new int[] {0, 0};
		this.direction = Direction.NORTH;
	}

	public Rover (String instructions) {

		this();

		this.instructions = instructions;
	}

	public Rover (String name, String instructions, int delay) {

		this();

		this.name = name;
		this.instructions = instructions;
		this.delay = delay;
	}

	/**
	 * @return the location
	 */
	public int[] getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(int[] location) {
		this.location = location;
	}

	/**
	 * @return the direction
	 */
	public Direction getDirection() {
		return direction;
	}

	/**
	 * @param direction the direction to set
	 */
	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	/**
	 * @return the delay
	 */
	public int getDelay() {
		return delay;
	}

	/**
	 * @param delay the delay to set
	 */
	public void setDelay(int delay) {
		this.delay = delay;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the instructions
	 */
	public String getInstructions() {
		return instructions;
	}

	/**
	 * @param instructions the instructions to set
	 */
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	/**
	 * @return the rank
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * @param rank the rank to set
	 */
	public void setRank(int rank) {
		this.rank = rank;
	}
}