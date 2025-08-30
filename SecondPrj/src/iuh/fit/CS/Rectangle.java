package iuh.fit.CS;
public class Rectangle {
	private double length;
	private double width;
	
	//property get
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	
	
	//constructor
	public Rectangle() {}
	public Rectangle(double width, double length) {
		this.length=length;
		this.width=width;
	}
	
	//property set
	public void setLength(double length) {
		this.length = length;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	//computing
	public double calcPerimeter() {
		return 2*(width+length);
	}
	public double calcArea() {
		return width*length;
	}
	@Override
	public String toString() {
		String s=String.format("%.2f\t%.2f\t%.2f\t%.2f",width,length,calcArea(),calcPerimeter());
		return s;
	}
}
	
