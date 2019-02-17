
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot bobby = new Robot();
		// 1. Set the X position of the robot so that it starts on the left. 
		bobby.setX(50);
		bobby.setY(100);
		// You also need to show the robot to see the result of this line.
for (int i = 0; i < 5; i++) {
		bobby.move(144);
		bobby.turn(45);
}
		// 2. Make the robot draw a star shape. Hint: 144.

		// 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/RobotWalk
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
