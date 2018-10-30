package main;

import java.util.Comparator;

public class Cuboid extends Rectangle{
	
	private int iDepth;
	
	public Cuboid(int length, int width, int depth) {
		super(width, length);
		this.iDepth = depth;
	}

	
	public int getiDepth() {
		return iDepth;
	}

	public void setiDepth(int iDepth) {
		this.iDepth = iDepth;
	}
	
	
	public double volume() {
		return (double) super.area() * this.iDepth;
	}
	
	@Override
	public double area() {
		return 2.0 * iDepth * super.getiLength() + 2.0 * iDepth * super.getiWidth() + 2.0 * super.area();
	}
	
	@Override
	public double perimeter() {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public int compareTo(Object o) {
		Cuboid cub = (Cuboid) o;
		return (int) (this.volume() - cub.volume());
	}
	
	public class SortByArea implements Comparator<Cuboid> {
		
		@Override
		public int compare(Cuboid cub1, Cuboid cub2) {
			return (int) (cub1.area() - cub2.area());
		}
	}
	
	public class SortByVolume implements Comparator<Cuboid> {
		
		@Override
		public int compare(Cuboid cub1, Cuboid cub2) {
			return cub1.compareTo(cub2);
		}
	}
}
