package prj2;
class Account {
	String id,name;
	double balance;
	Account acc;
	Account(String id,String name){
		this.id=id;
		this.name=name;
	}
	Account(String id,String name,double amt){
		this.id=id;
		this.name=name;
		this.balance=amt;
	}
	double credit(double amt) {
		return balance+=amt;
	}
	double debit(double amt) {
		if(amt<=balance) {
			balance-=amt;
		}
		else {
			System.out.println("amount not insufficient");
		}
		return balance;
	}
	double transfer(Account a,double amt) {
		if(amt<=balance) {
			balance-=amt;
			a.balance+=amt;
		}
		else {
			System.out.println("amount exceed");
		}
		return balance;
	}
}

public class AccountOperation{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id,name;
		double amount;
		Account a1=new Account("1","Nwe",0);
		Account a2=new Account("2","Lin",0);
		System.out.println("Account a1");
		
		System.out.println("credit:50000");
		System.out.println("Amount of a1:"+a1.credit(50000));
		
		
		System.out.println("debit:20000");
		System.out.println("Amount of a1:"+a1.debit(20000));
		
		System.out.println("Account a2");
		
		System.out.println("credit:50000");
		System.out.println("Amount of a2:"+a2.credit(50000));
		
		System.out.println("debit:20000");
		System.out.println("total balance:"+a2.debit(20000));
		
		System.out.println("Transfer from a2 to a1:10000");
		System.out.println("Amount of a2:"+a2.transfer(a1, 10000));
		System.out.println("Amount of a1:"+a1.balance);

	}
}
