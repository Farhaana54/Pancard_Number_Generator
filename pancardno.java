import java.util.Random;
import java.util.Scanner;

class Base {
    Random random = new Random();
    public char firstletter;
    public String modetype;
    public String P = "P",C = "C", F = "F", H = "H", A = "A", T = "T";
    char randomLetter;
    int randomNumber;
    String word = "";

    void panno() {
        for (int i = 0; i < 3; i++) {
            randomLetter = (char) ('A' + random.nextInt(26));
            word = word + randomLetter;
        }
        if (modetype.equals(P)) {
            word = word + P;
        } else if (modetype.equals(C)) {
            word = word + C;
        }else if (modetype.equals(F)) {
            word = word + F;
        }else if (modetype.equals(H)) {
            word = word + H;
        }else if (modetype.equals(A)) {
            word = word + A;
        }else if (modetype.equals(T)) {
            word = word + T;
        }else {
            System.out.println("Invalid mode type. Please enter P, C, F, H, A, or T.");
            return; 
        }
        word = word + Character.toUpperCase(firstletter);

        for (int i = 0; i < 4; i++) {
            randomNumber = random.nextInt(10);
            word = word + randomNumber;
        }
        randomLetter = (char) ('A' + random.nextInt(26));
        word = word + randomLetter;
        System.out.println("Generated PAN: " + word);
    }
}
public class pancardno {
	 public static void main(String[] args) {
	        while(true) {
	    	Scanner s = new Scanner(System.in);
	        System.out.println("Enter Your Name");
	        String name = s.nextLine();
	        System.out.println("Enter mode\n P-Individual\n C-Company\n F-Firm\n H-HUF\n A-Association\n T-Trust");
	        String mode = s.nextLine().toUpperCase();
	        Base b = new Base();
	        b.firstletter = name.charAt(0);
	        b.modetype = mode;
	        b.panno();
	        }
	    }
}
