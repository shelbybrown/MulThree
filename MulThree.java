//Shelby Brown
import java.util.*;

public class MulThree {

	public static void main(String[] args) {
		
		Scanner kbd = new Scanner(System.in);
		int n1, n2, n3, answ;   //Declaring the variables

		System.out.println("Hello out there.");
		System.out.println("I will multiply three numbers for you.");
		System.out.println("Enter three whole numbers on a line:");    //Explanation of program and instructions for user.
		n1 = kbd.nextInt();
		n2 = kbd.nextInt();
		n3 = kbd.nextInt();                                                 //Input from the user.
		answ = n1 * n2 * n3;    //Multiplying the input from user together.

		System.out.println("The product of those three numbers is");
		System.out.println( answ );     //Product of the numbers submitted by the user that are printed on the screen. 

		kbd.close();
	}

}
