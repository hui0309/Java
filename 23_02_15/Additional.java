// access input from data, display...
// absolute name
// if don't import it, you should take  absolute name to use
// (i think it like the use namespace std) 
// fully-qualified name => package + class 
import java.util.Scanner;

public class Additional{
	public static void main(String[] arges){
		//creat a scanner to obtain input from the command window
		/*
		 if you don't import the java.util.Scanner
		 you should write java.util.Scanner everytime when you use it
		  */
		Scanner input = new Scanner(System.in);
		
		//32-bit
		int num1, num2, sum;
		
		System.out.print("Enter first interger: ");
		//read first number(token) from user;
		//default saperate with '\n', ' ' 
		num1 = input.nextInt();
		
		System.out.print("Enter second interger: ");
		//read second number(token) from user;
		num2 = input.nextInt();

		sum = num1 + num2;

		//printf method same to the c but \n -> %n
		System.out.printf("Sum is %d%n", sum);
	}
}

