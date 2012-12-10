import static org.junit.Assert.*;

import org.junit.Test;


public class RomanNumeralUnitTests {

	private RomanNumerals number = new RomanNumerals();

	@Test
	public void testThat1ReturnsI() {
		assertEquals("I", number.toRoman(1));
		assertEquals("II", number.toRoman(2));
		assertEquals("III", number.toRoman(3));
		assertEquals("X", number.toRoman(10));
		assertEquals("XV", number.toRoman(15));
		assertEquals("XX", number.toRoman(20));
		assertEquals("LVIII", number.toRoman(58));
		assertEquals("XCIX", number.toRoman(99));
	}
	

}
