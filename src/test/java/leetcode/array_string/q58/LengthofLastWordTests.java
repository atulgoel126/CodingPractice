package leetcode.array_string.q58;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LengthofLastWordTests {

	@Test
	public void testNullString() {
		LengthofLastWord ob = new LengthofLastWord();
		String s = null;
		assertEquals(0, ob.lengthOfLastWord(s));
	}

	@Test
	public void testEmptyString() {
		LengthofLastWord ob = new LengthofLastWord();
		String s = "";
		assertEquals(0, ob.lengthOfLastWord(s));
	}

	@Test
	public void testSpaceString() {
		LengthofLastWord ob = new LengthofLastWord();
		String s = "          ";
		assertEquals(0, ob.lengthOfLastWord(s));
	}

	@Test
	public void testSingleWord() {
		LengthofLastWord ob = new LengthofLastWord();
		String s = "Hello";
		assertEquals(5, ob.lengthOfLastWord(s));
	}

	@Test
	public void testMultipleWords() {
		LengthofLastWord ob = new LengthofLastWord();
		String s = "Hello World";
		assertEquals(5, ob.lengthOfLastWord(s));
	}

	@Test
	public void testLastWordIsLongest() {
		LengthofLastWord ob = new LengthofLastWord();
		String s = "Hello World and Universe";
		assertEquals(8, ob.lengthOfLastWord(s));
	}

	@Test
	public void testNoLetters() {
		LengthofLastWord ob = new LengthofLastWord();
		String s = "12345 67890";
		assertEquals(0, ob.lengthOfLastWord(s));
	}

}