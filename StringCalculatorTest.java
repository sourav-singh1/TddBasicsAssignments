package com.yash.TddAssignments;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCalculatorTest {

	StringCalculator stringCalculator = new StringCalculator();

	@Test
	public void shouldReturnZeroForEmptyString() throws Exception {
		int actual = stringCalculator.addNumbersFromString("");
		assertEquals(0, actual);

	}

	@Test
	public void shouldReturnNumberIfStringHasOnlyOneNumberInNormalString() throws Exception {
		int actual = stringCalculator.addNumbersFromString("900");
		assertEquals(900, actual);
	}

	@Test(expected = NumberFormatException.class)
	public void shouldThrowExceptionIfStringsContainCharactersInNormalString() throws Exception {
		stringCalculator.addNumbersFromString("11,as");
	}

	@Test
	public void shouldReturnZeroIfStringHasOnlyOneNumberGreaterThan1000() throws Exception {
		int actual = stringCalculator.addNumbersFromString("//,1100");
		assertEquals(0, actual);
	}

	@Test
	public void shouldReturnNumberIfStringHasOnlyOneNumber() throws Exception {
		int actual = stringCalculator.addNumbersFromString("//,100");
		assertEquals(100, actual);
	}

	@Test
	public void shouldReturnSumOfTwoNumbersFromString() throws Exception {
		int actual = stringCalculator.addNumbersFromString("//;11; 100");
		assertEquals(111, actual);
	}

	@Test
	public void shouldReturnSumOfNumbersFromStringWhenInputIsGivenOnNewLine() throws Exception {
		int actual = stringCalculator.addNumbersFromString("//,12\n100");
		assertEquals(112, actual);
	}

	@Test(expected = NumberFormatException.class)
	public void shouldThrowExceptionIfStringsContainCharacters() throws Exception {
		stringCalculator.addNumbersFromString("11 \nas");
	}

	@Test(expected = MyException.class)
	public void shouldThrowExceptionIfStringsContainNegativeNumbers() throws Exception {
		stringCalculator.addNumbersFromString("11,-1");
	}

	@Test
	public void shouldReturnSumOfNumbersFromStringWhenInputIsGivenOnNewLineIgnoringNumberGreaterThan1000()
			throws Exception {
		int actual = stringCalculator.addNumbersFromString("//,123\n100, 1900");
		assertEquals(223, actual);
	}

}
