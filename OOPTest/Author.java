package prj2;

public class Author{
	String name,email;
	char gender;
	Author(String n, String e, char g){
		this.name=n;
		this.email=e;
		this.gender=g;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author a1=new Author("layaung kyuu yint","layaungkyuuyint@gmail.com",'F');
		Author a2=new Author("Lamin Mo Mo","lamin@gmail.com",'F');
		Book b1=new Book("forgive me",a1,1500);
		Book b2=new Book("love",a2,1500,5);
		
		b1.showBookInfo();
		System.out.println();
		b2.showBookInfo();

	}

}
