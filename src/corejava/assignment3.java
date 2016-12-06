package corejava;

import java.util.Scanner;

public class assignment3 {

	public static void main(String[] args) {
            int a,b;
            Scanner in =new Scanner(System.in);
            System.out.println("enter the value of first variable");
            a=in.nextInt();
            System.out.println("enter the value of second variable");
            b=in.nextInt();
            a=a+b;
            b=a-b;
            a=a-b;
            System.out.println("The new value of first variable  is"+" "+a);
            System.out.println("The new value of second variable is"+" "+b);
	}

}
