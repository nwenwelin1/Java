package studentupdate;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = "",question,studentStr="";
 		Student s;
 		ArrayList <Student> stuList = new ArrayList <Student> (); 
		do {
			System.out.println("Enter Student's name: ");
	 		String sName = sc.nextLine();
	 		System.out.println("Enter Student's phNo: ");
	 		String sPhno = sc.nextLine();
	 		System.out.println("Enter Student's roll NO: ");
	 		String sRollNo = sc.nextLine();
	 		System.out.println("Enter Student's address: ");
	 		String sAddress = sc.nextLine();
	 		//Student student = new Student (sName,sPhno,sRollNo,sAddress);
	 		studentStr="Name="+sName+";Phno="+sPhno+";RollNo="+sRollNo+";Address="+sAddress;
	 		try {
	 			BufferedWriter write=new BufferedWriter(new FileWriter("studentData",true));
				PrintWriter w=new PrintWriter(write);
				
				w.println(studentStr);
				w.close();
	 			stuList=showStudentInfo();
	 			 for (Student str1 : stuList) {
	 		        System.out.println(str1.show());
	 		    }
	 		}
	 		catch(IOException e) {
	 			e.printStackTrace();
	 		}
	 		 System.out.println("Do you enter next (y/n)?: ");
		     question = sc.nextLine();
		}while(question.equals("y") || question.equals("yes"));
	}

	public static ArrayList<Student> showStudentInfo() throws IOException {
		String strLine;
		Student stu;
		ArrayList <Student> studentList = new ArrayList <Student> (); 
		FileInputStream fstream = new FileInputStream("studentData");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
        while ((strLine = br.readLine()) != null) {
             String tokens[] = strLine.split(";");
             if (tokens.length > 0) {
                     stu = new Student(tokens[0],tokens[1],tokens[2],tokens[3]);
                     studentList.add(stu);    
             }
        }
        return studentList;
	}
//	public static String updateStudentInfo() {
//		ArrayList <Student> sList = new ArrayList <Student> ();
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Student's name if you want to update: ");
// 		String updateName = sc.nextLine();
// 		
// 		if(updateName.equals())
//	}

}
