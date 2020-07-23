package prj2;

public class ChildBranch extends Bank implements BankFunction{
	ChildBranch(double amt) {
		super(amt);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double increment(double amt) {
		// TODO Auto-generated method stub
		return super.totalAmt+=amt;
	}

	@Override
	public double decrement(double amt) {
		// TODO Auto-generated method stub
		return super.totalAmt-=amt;
	}
	

	public static void main(String[] args) {
		ChildBranch ch= new ChildBranch(20000);
		System.out.println("Increase Amount: 1000");
		System.out.println("After increment: "+ch.increment(1000));
		System.out.println("Decrement Amount: 1000");
		System.out.println("After decrement: "+ch.decrement(1000));
	}

}
