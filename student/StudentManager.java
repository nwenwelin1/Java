package exercises;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class StudentManager {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String question;
		String str = "";
 		Student s;
		do {
			System.out.println("Enter Student's name: ");
	 		String sName = sc.nextLine();
	 		System.out.println("Enter Student's phNo: ");
	 		String sPhno = sc.nextLine();
	 		System.out.println("Enter Student's roll NO: ");
	 		String sRollNo = sc.nextLine();
	 		System.out.println("Enter Student's address: ");
	 		String sAddress = sc.nextLine();
	 		Student student = new Student (sName,sPhno,sRollNo,sAddress);
		      try {
		    	  FileOutputStream fo = new FileOutputStream(new File("studentInfo"));
		    	  ObjectOutputStream oo = new ObjectOutputStream(fo);
		    	  oo.writeObject(student);
		    	  oo.close();
		    	  
		    	  FileInputStream fi = new FileInputStream(new File("studentInfo"));
		    	  ObjectInputStream oi = new ObjectInputStream(fi);
		    	  s = (Student) oi.readObject();
		    	  str+=s.toString()+"\n";
		    	  System.out.println(str);
		    	  oi.close();
		    	  fi.close();
		      }
		      catch(IOException e) {
		    	  e.printStackTrace();
		      }
		      
		      System.out.println("Do you enter next (y/n)?: ");
		      question = sc.nextLine();
		}while(question.equals("y") || question.equals("y"));
	}
}


