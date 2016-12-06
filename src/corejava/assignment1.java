package corejava;

import java.util.Scanner;

public class assignment1 {

	public static void main(String[] args) {
		
		int a,b,c;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the first number");
		a=in.nextInt();
		System.out.println("Enter the next number");
		b=in.nextInt();
		
		c=a-(-b);
		System.out.println("The sum is "+c);
	}

}
