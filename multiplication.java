package assignment1;

import java.util.Scanner;

public class multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		System.out.print("Enter a number for multiplication table: ");  
		int num= Integer.parseInt(sc.nextLine());
		for(int i=1; i<12; i++) {
			System.out.println(num+"\t*\t"+i+"\t=\t"+num*i);
		}

	}

}
