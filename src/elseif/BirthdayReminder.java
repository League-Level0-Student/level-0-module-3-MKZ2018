
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		
		String birthday;
		String momsBirthday = "September 14th";
		String nanaBirthday = "March 4th";
		String myBirthday = "March 29th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	birthday = JOptionPane.showInputDialog("Who's birthday did you want to know?");
		// 3. Print out what the user typed
		System.out.println(birthday);
		if(birthday.equals("mom")) {
			System.out.println(momsBirthday);
		}
		if(birthday.equals("nana")) {
			System.out.println(nanaBirthday);
		}
		if(birthday.equals("yours")) {
			System.out.println(myBirthday);
		}
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "nana"
			// print nana's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
