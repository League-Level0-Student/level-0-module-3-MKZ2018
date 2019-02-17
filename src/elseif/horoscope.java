package elseif;

import javax.swing.JOptionPane;

public class horoscope {
public static void main(String[] args) {
	String sign;
	sign = JOptionPane.showInputDialog("What is your zodiac sign?");
	if(sign.equals("aquarius")) {
		JOptionPane.showMessageDialog(null, "You will find something lost");
	}
	if(sign.equals("pisces")) {
		JOptionPane.showMessageDialog(null, "Great fortune will come today");
	}
	if(sign.equals("aries")) {
		JOptionPane.showMessageDialog(null, "The thing you've been fearing will not happen");
	}
	if(sign.equals("taurus")) {
		JOptionPane.showMessageDialog(null, "You will fail what you've dreading");
	}
	if(sign.equals("gemini")) {
		JOptionPane.showMessageDialog(null, "You will get what you've always wanted");
	}
	if(sign.equals("cancer")) {
		JOptionPane.showMessageDialog(null, "You will need all the luck you can get today");
	}
	if(sign.equals("leo")) {
		JOptionPane.showMessageDialog(null, "Today will be the best day of your life");
		}
	if(sign.equals("virgo")) {
		JOptionPane.showMessageDialog(null, "Prepare to be astounded");
	}
	if(sign.equals("libra")) {
		JOptionPane.showMessageDialog(null, "Today will be the worst day of your life");
	}
	if(sign.equals("scorpio")) {
		JOptionPane.showMessageDialog(null, "Have fun today, it'll be the last in a while");
	}
	if(sign.equals("sagittarius")) {
		JOptionPane.showMessageDialog(null, "You will ace what you've been dreading");
	}
	if(sign.equals("capricorn")) {
		JOptionPane.showMessageDialog(null, "Tragedy will come today");
	}
}
}
