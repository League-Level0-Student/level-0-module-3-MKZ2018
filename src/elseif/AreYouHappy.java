package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	String question;
	String happy;
	question = JOptionPane.showInputDialog("Are you happy?");
	if(question.equals ("yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
	}
	if(question.equals ("no")) {
		happy = JOptionPane.showInputDialog("Do you want to be happy?");
		if(happy.equals ("yes")) {
			JOptionPane.showMessageDialog(null, "change something then");
		}
		if(happy.equals ("no")) {
		JOptionPane.showMessageDialog(null, "Keep doing what you're doing");
		}
	}
}
}
