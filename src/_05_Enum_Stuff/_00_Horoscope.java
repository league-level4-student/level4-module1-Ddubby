package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	static void getHoroscope(Zodiac zodiac){
		switch(zodiac) {
		case ARIES:{
			JOptionPane.showMessageDialog(null, "You will die in the near future.");
			break;
		}
		case TAURUS:{
			JOptionPane.showMessageDialog(null, "You will be happy in the near future.");
			break;
		}
		case GEMINI:{
			JOptionPane.showMessageDialog(null, "You will be bored in the near future.");
			break;
		}
		case CANCER:{
			JOptionPane.showMessageDialog(null, "You will be sad in the near future.");
			break;
		}
		case LEO:{
			JOptionPane.showMessageDialog(null, "You will be depressed in the near future.");
			break;
		}
		case VIRGO:{
			JOptionPane.showMessageDialog(null, "You will be excited about the near future.");
			break;
		}
		case LIBRA:{
			JOptionPane.showMessageDialog(null, "You will be desperate in the near future.");
			break;
		}
		case SCORPIO:{
			JOptionPane.showMessageDialog(null, "You will gain a great insight in the near future.");
			break;
		}
		case SAGITTARIUS:{
			JOptionPane.showMessageDialog(null, "You will gain a new friend in the near future.");
			break;
		}
		case CAPRICORN:{
			JOptionPane.showMessageDialog(null, "You will lose a family member in the near future.");
			break;
		}
		case AQUARIUS:{
			JOptionPane.showMessageDialog(null, "You will discover a new hobby in the near future.");
			break;
		}
		case PISCES:{
			JOptionPane.showMessageDialog(null, "You will be disgusted in the near future.");
			break;
		}
		}
	}
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		getHoroscope(Zodiac.AQUARIUS);
	}
}
