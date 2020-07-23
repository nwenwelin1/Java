package prj2;


class Circle extends Shape{
	double radius;
	Circle(){
		
	}
	Circle(double r){
		this.radius=r;
	}
	Circle(double r, String color, boolean filled){
		super(color,filled);
		this.radius=r;
	}
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return radius*3.142*radius;
	}
	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*radius*3.142;
	}
	@Override
	void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("Circle Information:");
		System.out.println("Radius: "+radius+"\nArea: "+getArea()+"\nPerimeter: "+getPerimeter()+"\nColor: "+color+"\nFilled: "+filled+"\n");
	}
}
class Rectangle extends Shape {
	double width,height;
	Rectangle(){};
	Rectangle(double w, double h){
		this.width=w;
		this.height=h;
	}
	Rectangle(double w, double h, String color, boolean filled){
		super(color,filled);
		this.width=w;
		this.height=h;
	}
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return width*height;
	}
	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*(width+height);
	}
	@Override
	void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle Information:");
		System.out.println("Width: "+width+"\nheight: "+height+"\nArea: "+getArea()+"\nPerimeter: "+getPerimeter()+"\nColor: "+color+"\nFilled: "+filled+"\n");
	}
}

class Square extends Rectangle {
	double side;
	Square(){
		
	}
	Square(double side){
		this.side=side;
	}
	Square(double side, String color, boolean filled){
		super();
		this.side=side;
	}
	public void setWidth(double side) {
		this.side = side;
	}
	public void setHeight(double side) {
		this.side = side;
	}
	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return side*side;
	}
	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return 4*side;
	}
	@Override
	void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("Square Information:");
		System.out.println("Side: "+side+"\nArea: "+getArea()+"\nPerimeter: "+getPerimeter()+"\nColor: "+color+"\nFilled: "+filled+"\n");
	}
}

public class OOPAbstract extends Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OOPAbstract ca=new OOPAbstract();
		Circle circle = new Circle(5,ca.color,ca.filled);
		circle.showInfo();
		Rectangle rect = new Rectangle(10,5,ca.color,ca.filled);
		rect.showInfo();
		Square square = new Square(20,ca.color,ca.filled);
		square.showInfo();
		ca.showInfo();
	}

	@Override
	double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("Shape Information:");
		System.out.println("Color: "+color+"\nFilled: "+filled+"\n");
	}
}
