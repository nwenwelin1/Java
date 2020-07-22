package assignment1;

import java.util.Scanner;

public class delimitedFormat {

	private static String[] limits;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		System.out.print("Enter the numbers for delimit: ");  
		String num= sc.nextLine(); 
		String f="";
		if(num.length()%2 == 0) {
			for(int i=0; i<num.length(); i+=2) {
				f=num.substring(i,i+2)+",";
				System.out.print(f);
			}
		}
		
		else {
			System.out.println("Please enter even number:");
		}
	}

}
