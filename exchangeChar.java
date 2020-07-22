package assignment1;

import java.util.Scanner;

public class exchangeChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		System.out.print("Enter a string to exchange: ");  
		String str= sc.nextLine(); 
		char first,last;
		String middle="";
		first=str.charAt(0);
		last=str.charAt(str.length()-1);
		for(int i=1; i<str.length()-1; i++) {
			middle+=str.charAt(i);
		}
		System.out.println(last+""+middle+""+first);
	}

}
