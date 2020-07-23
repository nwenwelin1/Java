package prj2;

public class Students extends Person {
	int year;
	double fee;
	String program;
	Students(String name,String address,String p, int y, double f){
		super(name,address);
		this.program=p;
		this.year=y;
		this.fee=f;
	}
	void showStudentsInfo() {
		System.out.println("Name:"+name);
		System.out.println("Address:"+address);
		System.out.println("Fee:"+fee);
		System.out.println("Year:"+year);
		System.out.println("Program:"+program);
	}
}
