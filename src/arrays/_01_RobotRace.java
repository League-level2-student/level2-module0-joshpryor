package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		// 2. create an array of 5 robots.
		Robot[] rob = new Robot[5];
		Random ran = new Random();
		boolean top = false;
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < rob.length; i++) {

			rob[i] = new Robot("vic");
			rob[i].setSpeed(999);

			// 4. make each robot start at the bottom of the screen, side by side, facing up

			rob[i].moveTo(100 + i * 100, 500);
			/*
			 * rob[1].moveTo(200, 500); rob[2].moveTo(300, 500); rob[3].moveTo(400, 500);
			 * rob[4].moveTo(500, 500);
			 */
		}

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50

		while (!top) {

			for (int i = 0; i < rob.length; i++) {

				int rolly = ran.nextInt(50);

				rob[i].move(rolly);
				if (rob[i].getY() <= 0) {
					top = true;
					rob[i].move(-50);
					rob[i].turn(99999);
					break;
				}
			}

		}
	}

	// 6. use a while loop to repeat step 5 until a robot has reached the top of the
	// screen.

	// 7. declare that robot the winner and throw it a party!

	// 8. try different races with different amounts of robots.

	// 9. make the robots race around a circular track.
}
