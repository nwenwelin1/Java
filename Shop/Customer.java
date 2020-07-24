package prj2;


public class Customer {
	public String name,memberType;
	boolean member;
	Customer(String name,String memberType){
		this.name=name;
		this.memberType=memberType;
	}
	boolean isMember(boolean member) {
		return member;
	}
}
