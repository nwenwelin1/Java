package assignment1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern; 
public class avg_max_min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in); //System.in is a standard input stream
		System.out.print("Enter number Lists:\n");
		String numList= sc.nextLine(); 
		Pattern p=Pattern.compile("\\s");  
        String[] res=p.split(numList); 
        int avg=0;
        for(int i=0; i<res.length; i++) {
        	avg+=Integer.parseInt(res[i]); 
        }
        Arrays.sort(res);
        System.out.println("Average: "+avg/res.length);
        System.out.println("Fist Minimum value: "+res[0]);
        System.out.println("Second Minimum value: "+res[1]);
        System.out.println("Fist Maximum value: "+res[res.length-1]);
        System.out.println("Second Maximum value: "+res[res.length-2]);
        
	}

}
