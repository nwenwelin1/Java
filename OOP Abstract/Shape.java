package prj2;

public abstract class Shape {
	public String color="red";
	public boolean filled=true;
	Shape(){
		
	}
	Shape(String c, boolean filled){
		this.color=c;
		this.filled=filled;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	abstract double getArea();
	abstract double getPerimeter();
	//String toString();
	abstract void showInfo();
}
