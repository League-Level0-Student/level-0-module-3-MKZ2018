//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		 

		//3. Ask the user what color they would like the robot to draw
		
		for (int i = 0; i < args.length; i++) {
			Robot bobby;
		
		String color;
		color = JOptionPane.showInputDialog("what color? Red, Green, or Blue?");
		//5. Use an if/else statement to set the pen color that the user requested
if(color.equals("Blue")) {
bobby.setPenColor(0, 0, 100);
}
else(color.equals("Red")); {
	bobby.setPenColor(100,0,0);
}
else(color.equals("Green")){
	bobby.setPenColor(0,100,0);
}
        //6. If the user doesn’t enter anything, choose a random color
if(color.equals("Red")) {
	bobby.setRandomPenColor();
}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		bobby.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
bobby.penDown();
		bobby.move(20);
		bobby.move(10);
		}
		
	}
}
