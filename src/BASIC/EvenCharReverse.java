package BASIC;

import java.util.Scanner;

public class EvenCharReverse {

	     public static void main(String[] args) {
	         @SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
	         System.out.println("Please enter a string and I will reverse it.");
	         String reverse = input.nextLine();

	         for (int i = reverse.length() - 1; i >= 0; i-=2) {
	             System.out.println(reverse.charAt(i));
	             if (i % 2 == 0) {
	                 System.out.println(i);
	             }
	         }



	     }
	 
}
