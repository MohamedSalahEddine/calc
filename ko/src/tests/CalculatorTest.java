package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class CalculatorTest {

	
	@Test
	public void twoPlusTwoFour() {
		Calculator calc = new Calculator();
		
		assertEquals(4, calc.addition(2,  2) );
	}
}
