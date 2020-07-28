package exercises;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Students {
	String name,phno,rollNo,address;
	public Students(String name, String phno, String rollNo, String address) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.phno=phno;
		this.rollNo=rollNo;
		this.address=address;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <String,Students> stuList = new HashMap <String,Students> ();
		stuList.put("aye moe kyaw", new Students("aye moe kyaw","12345","5cs-12","Monywa"));
		stuList.put("moe moe", new Students("moe moe","12333505105","5cs-2","Sagaing"));
		stuList.put("aye moe lwin", new Students("aye moe lwin","198345","5cs-1","Yangon"));
		stuList.put("moe khin", new Students("moe khin","120345","5cs-10","Monywa"));
		stuList.put("su su", new Students("su su","2690606","5cs-8","Kalay"));
		
	
		
		Students student,stu;
		 
		 Set set = stuList.entrySet();
		 Iterator i = set.iterator();
		 Set set1 = stuList.entrySet();
		 Iterator i1 = set1.iterator();
		 System.out.println("Names of the student:");
	
		 while(i1.hasNext()) {
			 Map.Entry me1 = (Map.Entry)i1.next();
			 stu= (Students) me1.getValue();
			 System.out.println(stu.name);
	      }
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter name if you want to start:");
		 String start = sc.nextLine();
		 while(i.hasNext()) {
			 Map.Entry me = (Map.Entry)i.next();
			 student= (Students) me.getValue();
			 if(student.name.toLowerCase().startsWith(start.toLowerCase())) { 	 
				 System.out.println("Name:\t"+student.name+"\nPhno:\t"+student.phno+"\nRollNo:\t"+student.rollNo+"\nAddress:\t"+student.address);	  
				 System.out.println();
			 }
	      }

	}

}
