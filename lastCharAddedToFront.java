package assignment1;

import java.util.Scanner;

public class lastCharAddedToFront {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		System.out.print("Enter a string: ");  
		String str= sc.nextLine(); 
		char last;
		last=str.charAt(str.length()-1);
		System.out.println(last+""+str+""+last);
	}

}
