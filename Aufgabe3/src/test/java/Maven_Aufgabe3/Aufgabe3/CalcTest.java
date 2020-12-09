package Maven_Aufgabe3.Aufgabe3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CalcTest {

	Calculator calculator; 									
	
	@Before public void setUp() throws Exception {
		calculator = new Calculator();
	}
	
	
	//Normale Addition
	@Test
	public void testAdd1() {
		assertEquals(11,calculator.add(5,6));
	}
	
	//Adition mit 0
	@Test
	public void testAdd2() {
		assertEquals(5,calculator.add(5,0));
	}
	
	//Adition mit Minuszahlen
	@Test
	public void testAdd3() {
		assertEquals(1,calculator.add((-5),6));
	}
	
	//Minus mit minus Zahlen
	@Test
	public void testMinus1() {
		assertEquals(-11,calculator.minus((-5),6));
	}
	
	//Minus von 0 aus
	@Test
	public void testMinus2() {
		assertEquals(-6,calculator.minus(0,6));
	}
	
	//Minus mit 0
	@Test
	public void testMinus3() {
		assertEquals(6,calculator.add(6,0));
	}

	//Minus und minus gibt plus
	@Test
	public void testMinus4() {
		assertEquals(1,calculator.minus((-5),(-6)));
	}
	
	//Normale Multiplikation
	@Test
	public void testMulti1() {
		assertEquals(30,calculator.multi(5,6));
	}
	
	//Multiplikation mit 0
	@Test
	public void testMulti2() {
		assertEquals(0,calculator.multi(0,6));
	}
	
	//Multipliaktion mit Minuszahlen
	@Test
	public void testMulti3() {
		assertEquals((-30),calculator.multi((-5),6));
	}
	
	//Multiplikation mit minus minus Zahlen
	@Test
	public void testMulti4() {
		assertEquals(30,calculator.multi((-5),(-6)));
	}
	
	//Normale Divison
	@Test
	public void testDiv1() {
		assertEquals(5,calculator.div(30,6));
	}
	
	//Divison mit 0
	//@Test
	//public void testDiv2() {
		//assertEquals(ERROR,calculator.div(30,0));
	//}

	@Test
	public void testDiv3() {
		assertEquals(0,calculator.div(0,6));
	}
	
	//Divison mit Minus
	@Test
	public void testDiv4() {
		assertEquals((-5),calculator.div((-30),6));
	}
	
	//Division mit Minus Minus
	@Test
	public void testDiv5() {
		assertEquals(5,calculator.div((-30),(-6)));
	}
}
