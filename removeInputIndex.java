package assignment1;

import java.util.Scanner;

public class removeInputIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		System.out.println("Enter a string: ");  
		String str= sc.nextLine();
		StringBuffer sb= new StringBuffer(str);
		System.out.println("Enter index number if you want to delete: ");  
		String index= sc.nextLine();
		sb=sb.deleteCharAt(Integer.parseInt(index));
		System.out.println("After deleting:"+sb);

	}

}
