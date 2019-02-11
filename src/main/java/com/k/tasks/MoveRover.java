package com.k.tasks;

import java.util.Arrays;

import org.springframework.stereotype.Component;

import com.k.api.RoverIPLogic;
import com.k.model.Rover;

/**
 * @author Parik
 *
 * Runner.java - Feb 10, 2019
 */
@Component
public class MoveRover {

	public static void main(String[] args) {
		
		Rover rover = new Rover("FF");

		RoverIPLogic logic = new RoverIPLogic(rover);

		logic.processInstructions(false);

		System.out.println(Arrays.toString(rover.getLocation()));
	}
}