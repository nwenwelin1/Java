package exercises;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Student implements Serializable{
	String name,phno,rollNo,address;
	public Student(String name, String phno, String rollNo, String address) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.phno=phno;
		this.rollNo=rollNo;
		this.address=address;
	}
	public String toString() {
		return "\nName:\t"+name+"\nPhno:\t"+phno+"\nRollNo:\t"+rollNo+"\nAddress:\t"+address;
	}
}
