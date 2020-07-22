package assignment1;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		System.out.print("Enter a number for factorial: ");  
		String num= sc.nextLine(); 
		int i,fact=1;  
		int number=Integer.parseInt(num);//It is the number to calculate factorial    
		for(i=1;i<=number;i++){    
		    fact=fact*i;  
		}   
		System.out.println("Factorial of "+number+" is: "+fact);
	}

}
