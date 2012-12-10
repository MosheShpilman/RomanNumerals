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
		assertEquals("DLXXX", number.toRoman(580));
		assertEquals("CXCIX", number.toRoman(199));
		assertEquals("CCCLIX", number.toRoman(359));
		assertEquals("CXLIII", number.toRoman(143));
		assertEquals("DCCXI", number.toRoman(711));
		assertEquals("CDXCIX", number.toRoman(499));
		assertEquals("M", number.toRoman(1000));
		assertEquals("MCCV", number.toRoman(1205));
		assertEquals("MMDXLIII", number.toRoman(2543));
		assertEquals("MMMCMXCIX", number.toRoman(3999));
		
	}
	

}
