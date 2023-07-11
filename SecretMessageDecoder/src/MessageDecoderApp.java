import java.util.*;
public class MessageDecoderApp {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);	
	System.out.println("enter the character");
	char ch=scan.next().charAt(0);



		MessageDecoder decoder = new MessageDecoder();

	System.out.println(	decoder.decodeCharacter('A'));

}
}