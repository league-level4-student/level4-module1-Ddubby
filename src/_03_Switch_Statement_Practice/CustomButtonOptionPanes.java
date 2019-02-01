package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null, options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice) {
		case "Sunday":
			System.out.println("Oh no, school continues tomorrow!");
			break;
		case "Monday":
			System.out.println("First day, very boring");
			break;
		case "Tuesday":
			System.out.println("Second day, very boring");
			break;
		case "Wednesday":
			System.out.println("Third day, very boring");
			break;
		case "Thursday":
			System.out.println("Fourth day, very boring");
			break;
		case "Friday":
			System.out.println("Final day, can't wait for the weekend!");
			break;
		case "Saturday":
			System.out.println("First day of a 2 day long break!");
			break;
		}
	}
}
