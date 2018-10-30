package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

import main.Rectangle;

public class RectangleTest {
	
	@Test
	public void RectangleTest1() {		
		try {
			Rectangle r1 = new Rectangle(2, 3);
		}
		catch(Exception e) {
			fail("Test failed to build a Rectangle");
		}
	}
		
	@Test
	public void getiWidthTest() {
		int expected = 3;
		
		try {
			Rectangle rec = new Rectangle(3, 2);
			int width = rec.getiWidth();
			
			assertTrue(width == expected);
		}
		catch (Exception e) {
			fail("Test failed to build a Rectangle");
		}
	}
	
	@Test
	public void setiWidthTest() {
		int expected = 3;

		try {
			Rectangle rec = new Rectangle(2, 2);
			rec.setiWidth(3);
			int width = rec.getiWidth();
			
			assertTrue(width == expected);
		}
		catch (Exception e) {
			fail("Test failed to build a Rectangle");
		}
	}
	
	@Test
	public void getiLengthTest() {
		int expected = 2;
		
		try {
			Rectangle rec = new Rectangle(3, 2);
			int length = rec.getiLength();
			
			assertTrue(length == expected);
		}
		catch (Exception e) {
			fail("Test failed to build a Rectangle");
		}
	}
	
	@Test
	public void setiLengthTest() {
		int expected = 3;

		try {
			Rectangle rec = new Rectangle(2, 2);
			rec.setiLength(3);
			int length = rec.getiLength();
			
			assertTrue(length == expected);
		}
		catch (Exception e) {
			fail("Test failed to build a Rectangle");
		}
	}
	
	@Test
	public void areaTest() {
		double expected = 6.0;
		
		try {
			Rectangle rec = new Rectangle(2,3);
			double val = rec.area();
			
			assertTrue(val == expected);
		}
		catch (Exception e) {
			fail("Test failed to build a Rectangle");
		}
	}
	
	@Test
	public void perimeterTest() {
		double expected = 10.0;
		
		try {
			Rectangle rec = new Rectangle(2,3);
			double val = rec.perimeter();
			
			assertTrue(val == expected);
		}
		catch (Exception e) {
			fail("Test failed to build a Rectangle");
		}
	}
	
	@Test
	public void compareToTest1() {
		try {
			Rectangle rec1 = new Rectangle(2,2);
			Rectangle rec2 = new Rectangle(4,6);
			
			assertTrue(rec1.compareTo(rec2) < 0);
		}
		catch (Exception e) {
			fail("Test failed to build a Rectangle");
		}
	}
	
	@Test
	public void compareToTest2() {
		try {
			Rectangle rec1 = new Rectangle(4,6);
			Rectangle rec2 = new Rectangle(4,6);
			
			assertTrue(rec1.compareTo(rec2) == 0);
		}
		catch (Exception e) {
			fail("Test failed to build a Rectangle");
		}
	}
	
	@Test
	public void compareToTest3() {
		try {
			Rectangle rec1 = new Rectangle(4,2);
			Rectangle rec2 = new Rectangle(4,6);
			
			assertTrue(rec2.compareTo(rec1) > 0);
		}
		catch (Exception e) {
			fail("Test failed to build a Rectangle");
		}
	}
	
}
