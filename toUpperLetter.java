package assignment1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class toUpperLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
		System.out.print("Enter a string change to Upperletter: ");  
		String str= sc.nextLine(); 
		Pattern p=Pattern.compile("\\s");  
        String[] res=p.split(str);
        char ch,le = 0;
        for(String substr:res) {
        	ch=substr.charAt(0);
        	if (92 <= ch && ch<=122){
                le = (char)( (ch - 32) );
            }
        	System.out.print(substr.replace(ch, le)+" ");
        }
	}

}
