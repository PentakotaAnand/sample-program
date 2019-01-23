package devops.numbers;

import org.junit.*;

import devops.numbers.NumberWords;

public class NumberWordsTests {
	private NumberWords numberWords ;
	
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
	}

	/* Negative scenario 1 */
	@Test
	public void numberOutOfRangeReturnsError1() {
		Assert.assertEquals( "Error", "Number out of range", numberWords.toWords( -1 ) ) ;
	}
	/* Negative scenario 2 */
	@Test
	public void numberOutOfRangeReturnsError2() {
		Assert.assertEquals( "Error", "Number out of range", numberWords.toWords( 1000 ) ) ;
	}
	
	/* Positive scenario 1 */
	@Test
	public void testPositiveScenario1() {
		Assert.assertEquals("Error","Eighteen", numberWords.toWords( 18 ) ) ;
	}
	/* Positive scenario 2 */
	@Test
	public void testPositiveScenario2() {
		Assert.assertEquals( "Error", "Forty", numberWords.toWords( 40) ) ;
	}
	
	@Test
	public void testPositiveScenario3() {
		Assert.assertEquals("Error","Eighty Four", numberWords.toWords( 84 ) ) ;
	}
	
	@Test
	public void testPositiveScenario4() {
		Assert.assertEquals("Error","Five Hundred Twelve", numberWords.toWords( 512 ) ) ;
	}

	@Test
	public void testPositiveScenario5() {
		Assert.assertEquals( "Error", "Four Hundred", numberWords.toWords( 400) ) ;
	}
	
	@Test
	public void testPositiveScenario6() {
		Assert.assertEquals( "Error", "", numberWords.toWords( 0 ) ) ;
	}
}
