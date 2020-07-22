package assignment1;

import java.util.Scanner;

public class addthreeChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		System.out.print("Enter a string: ");  
		String str= sc.nextLine();
		if(str.length()>3) {
			String three=str.substring(0,3);
			System.out.println(three+""+str+""+three);
		}
		else {
			System.out.println("your string "+str+" is less than three.");
		}
	}

}
