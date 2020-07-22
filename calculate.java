package assignment1;

import java.util.Scanner;

public class calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		System.out.println("Enter first number: ");  
		int num1= Integer.parseInt(sc.nextLine());
		System.out.println("Enter second number: ");  
		int num2= Integer.parseInt(sc.nextLine());
		System.out.println("Choose operator +, -, *, /, %: ");  
		String op= sc.nextLine();
		int res = 0;
		switch(op) {
		case "+": res=num1+num2;break;
		case "-": res=num1-num2;break;
		case "*": res=num1*num2;break;
		case "/": res=num1/num2;break;
		case "%": res=num1%num2;break;
		
		}
		System.out.println("result: "+res);
	}

}
