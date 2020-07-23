package prj2;

public class Book {
	String name;
	double price;
	int qty;
	Author author;
	Book(String n, Author a, double p){
		this.name=n;
		this.author=a;
		this.price=p;
	}
	Book(String n, Author a, double p, int q){
		this.name=n;
		this.author=a;
		this.price=p;
		this.qty=q;
	}
	void showBookInfo() {
		System.out.println("book name:"+name);
		System.out.println("Author name:"+author.name);
		System.out.println("price:"+price);
		System.out.println("quantity:"+qty);
		System.out.println("gender:"+author.gender);

	}
}
