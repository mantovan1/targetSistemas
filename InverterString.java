
import java.util.*;

public class InverterString {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String string;
		String stringReverse = "";
		
		System.out.println("Entre com uma string: ");
		string = in.nextLine();
		
		for(int i = string.length() - 1; i > -1; i--) {
			stringReverse = stringReverse + string.charAt(i);
		}
		
		System.out.println(stringReverse);

	}

}
