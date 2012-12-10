import static org.junit.Assert.*;

import org.junit.Test;


public class RomanNumeralUnitTests {

	private RomanNumerals number = new RomanNumerals();

	@Test
	public void testThat1ReturnsI() {
		assertEquals("I", number.toRoman(1));
		assertEquals("II", number.toRoman(2));
		assertEquals("III", number.toRoman(3));
		assertEquals("IV", number.toRoman(4));
		assertEquals("VII", number.toRoman(7));
		assertEquals("VIII", number.toRoman(8));
		assertEquals("IX", number.toRoman(9));
		assertEquals("X", number.toRoman(10));
	}
	

}
