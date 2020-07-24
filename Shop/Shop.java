package prj2;

import java.util.Date;

public class Shop {
	public static java.lang.String memberType;
	public Date date;
	String name;
	DiscountRate dd;
	double totalAmt;
	Shop(String name, String memberType, Date date){
		this.date=date;
		this.memberType=memberType;
		this.name=name;
	}
	
	double getTotalExpense(double sExpense, double pExpense) {
		return (sExpense-(sExpense*dd.getServiceDiscountRate(memberType)))+(pExpense-(pExpense * dd.getProductDiscountRate(memberType)));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiscountRate dd= new DiscountRate();
		Customer c1=new Customer("aye","platinum");
		Shop s1 = new Shop(c1.name,c1.memberType,new Date("7/24/2020"));
		System.out.println("Name: "+c1.name);
		System.out.println("Member Type: "+c1.memberType);	
		System.out.println("Date: "+s1.date);
		System.out.println("service expense: 5000");
		System.out.println("product expense: 5000");
		System.out.println("Total Expense: "+s1.getTotalExpense(5000,5000)); 
		System.out.println("Service Discount Rate: "+dd.getServiceDiscountRate(c1.memberType));
		System.out.println("Product Discount Rate: "+dd.getProductDiscountRate(c1.memberType));
		System.out.println();
		Customer c2=new Customer("moe","sliver");
		Shop s2 = new Shop(c2.name,c2.memberType,new Date("7/25/2020"));
		System.out.println("Name: "+c2.name);
		System.out.println("Member Type: "+c2.memberType);
		System.out.println("Date: "+s2.date);
		System.out.println("service expense: 5000");
		System.out.println("product expense: 5000");
		System.out.println("Total Expense: "+s2.getTotalExpense(5000,5000)); 
		System.out.println("Service Discount Rate: "+dd.getServiceDiscountRate(c2.memberType));
		System.out.println("Product Discount Rate: "+dd.getProductDiscountRate(c2.memberType));
		System.out.println();
		Customer c3=new Customer("lwin","gold");
		Shop s3 = new Shop(c3.name,c3.memberType,new Date("7/26/2020"));
		System.out.println("Name: "+c3.name);
		System.out.println("Member Type: "+c3.memberType);
		System.out.println("Date: "+s3.date);
		System.out.println("service expense: 5000");
		System.out.println("product expense: 5000");
		System.out.println("Total Expense: "+s3.getTotalExpense(5000,5000)); 
		System.out.println("Service Discount Rate: "+dd.getServiceDiscountRate(c3.memberType));
		System.out.println("Product Discount Rate: "+dd.getProductDiscountRate(c3.memberType));
		
	}
	
}
