import static org.junit.Assert.*;

import org.junit.Test;


public class TestLab0 {

	@Test
	public void testArea() {
		double area;
		//Test case 1
		area = Lab0.area(12.5, 7.8, 19.2);
		assertEquals(30.68, area, 0.01);
		
		//Test case 2
		area = Lab0.area(876.23, 255.71, 709.76);
		assertEquals(75953.81, area, 0.01);
		
		//Test case 3
		boolean isValidTriangle = Lab0.validTriangle(10, 50, 30);
		assertFalse(isValidTriangle);
	}

}
