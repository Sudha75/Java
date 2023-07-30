package character;
import java.util.*;
public class Main2 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the character to check for digit or vowel or consonent");
	char ch=scan.next().charAt(0);
	Main1.identifyCharacter(ch);
}
}
