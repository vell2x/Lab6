
public class DiceRollerApp {
	public static String diceRoller(int a, int b) {
		String result = "";
		
		if(a + b == 2) {
			result = "You crapped and rolled snake eyes by rolling a " + (a + b) + "!";
		}
		else if(a == 6 && b == 6) {
			result = "You crapped and rolled a box car by rolling " + (a + b) + "!";
		}
		else if(a + b == 3) {
			result = "You crapped by rolling a " + (a + b) + "!";
		}
		
		return result;
	}
}
