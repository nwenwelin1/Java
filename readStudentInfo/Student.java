package studentupdate;

public class Student {
	String name,phno,rollNo,address;
	public Student(String name, String phno, String rollNo, String address) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.phno=phno;
		this.rollNo=rollNo;
		this.address=address;
	}
	public String show() {
		return name+"\n"+phno+"\n"+rollNo+"\n"+address+"\n";
	}
}
