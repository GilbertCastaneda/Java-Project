import java.util.Scanner;
public class Salty {

	public static void main(String[] args) {
		
		String a = "Lately I've been doing well";
		System.out.println(" .--------------.");
		System.out.println(" |ASCII Cat App |");
		System.out.println(" |--------------|");
		System.out.println(" | A - Persian  |");
		System.out.println(" | B - Siamese  |");
		System.out.println(" | C - Sphynx   |");
		System.out.println(" | D - Bengal   |");
		System.out.println(" | E - Russain  |");
		System.out.println(" ----------------");
		
		String A = "Persian";
		String B = "Siamese";
		String C = "Sphynx";
		String D = "Bengal";
		String E = "Russain";
		
		
		
		Scanner keyboardInput = new Scanner(System.in);

          System.out.print("Pick a cat: ");
          String username = keyboardInput.nextLine();
          System.out.println("You Picked" + username);
          
		;
	}

}
