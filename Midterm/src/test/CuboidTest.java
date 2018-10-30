package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;
import main.Cuboid;
import main.Rectangle;

public class CuboidTest {
	
	@Test
	public void CuboidTest1() {
		try {
			Cuboid c1 = new Cuboid(2,3,4);
		}
		catch (Exception e) {
			fail("Test failed to build a Cuboid");
		}
	}
	
	@Test
	public void getiDepthTest() {
		int expected = 4;
		
		try {
			Cuboid c = new Cuboid(2,3,4);
			int val = c.getiDepth();
			
			assertTrue(val == expected);
		}
		catch (Exception e) {
			fail("Test failed to build a Cuboid");
		}
	}
	
	@Test
	public void setiDepthTest() {
		int expected = 5;

		try {
			Cuboid c = new Cuboid(2,3,4);
			c.setiDepth(5);
			int val = c.getiDepth();
			
			assertTrue(val == expected);
		}
		catch (Exception e) {
			fail("Test failed to build a Cuboid");
		}
	}
	
	@Test
	public void volumeTest() {
		double expected = 24.0;
		
		try {
			Cuboid c = new Cuboid(2,3,4);
			double val = c.volume();
			
			assertTrue(val == expected);
		}
		catch (Exception e) {
			fail("Test failed to build a Cuboid");
		}
	}
	
	@Test
	public void areaTest() {
		double expected = 52.0;
		
		try {
			Cuboid c = new Cuboid(2,3,4);
			double val = c.area();
			
			assertTrue(val == expected);
		}
		catch (Exception e) {
			fail("Test failed to build a Cuboid");
		}
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void perimeterTest() {
		Cuboid c = new Cuboid(2,3,4);
		double val = c.perimeter();
	}
	
	@Test
	public void SortByVolumeTest() {
		try {
			Cuboid c1 = new Cuboid(2,2,2);
			Cuboid c2 = new Cuboid(10,1,1);
			Cuboid c3 = new Cuboid(4,4,4);
			
			ArrayList<Cuboid> al = new ArrayList<Cuboid>();
			al.add(c2);
			al.add(c3);
			al.add(c1);
			
			ArrayList<Cuboid> expected = new ArrayList<Cuboid>();
			expected.add(c1);
			expected.add(c2);
			expected.add(c3);
			
			Collections.sort(al, c1.new SortByVolume());
			
			assertEquals(al, expected);
		}
		catch (Exception e) {
			fail("Test failed to build a Cuboid");
		}
	}
	
	@Test
	public void SortByAreaTest() {
		try {
			Cuboid c1 = new Cuboid(2,2,2);
			Cuboid c2 = new Cuboid(10,1,1);
			Cuboid c3 = new Cuboid(4,4,4);
			
			ArrayList<Cuboid> al = new ArrayList<Cuboid>();
			al.add(c2);
			al.add(c3);
			al.add(c1);
			
			ArrayList<Cuboid> expected = new ArrayList<Cuboid>();
			expected.add(c1);
			expected.add(c2);
			expected.add(c3);
			
			Collections.sort(al, c1.new SortByArea());
			
			assertEquals(al, expected);
		}
		catch (Exception e) {
			fail("Test failed to build a Cuboid");
		}
	}
}
