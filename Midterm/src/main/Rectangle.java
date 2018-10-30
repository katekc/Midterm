package main;

public class Rectangle extends Shape{
	
	private int iWidth;
	private int iLength;

	
	public Rectangle(int width, int length) {
		this.iWidth = width;
		this.iLength = length;
	}
	
	
	public int getiWidth() {
		return iWidth;
	}

	public void setiWidth(int iWidth) {
		this.iWidth = iWidth;
	}

	public int getiLength() {
		return iLength;
	}

	public void setiLength(int iLength) {
		this.iLength = iLength;
	}


	@Override
	public double area() {
		return (double) iLength * iWidth;
	}

	@Override
	public double perimeter() {
		return 2.0 * (double) (iLength + iWidth);
	}

	public int compareTo(Object o) {
		Rectangle rec = (Rectangle) o;
		
		return (int) (this.area() - rec.area());
	}
	
	
}
