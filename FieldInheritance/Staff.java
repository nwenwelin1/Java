package prj2;

public class Staff extends Person {
	String school;
	double pay;
	String name,address;
	Staff(String name, String address, String sc, double pay){
		super(name,address);
		this.school=sc;
		this.pay=pay;
	}
	void showStaffInfo() {
		System.out.println("Name:"+name);
		System.out.println("Address:"+address);
		System.out.println("School:"+school);
		System.out.println("Pay:"+pay);
	}
}
