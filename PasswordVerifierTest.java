package com.yash.TddAssignments;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PasswordVerifierTest {

	PasswordVerifier PasswordVerifier = new PasswordVerifier();

	@Test(expected = MyException.class)
	public void shouldReturnInvalidMsgIfPasswordIsNull() throws Exception{
			PasswordVerifier.isValidPassword(null);
	}
	
	@Test(expected = MyException.class)
	public void shouldReturnInvalidMsgIfPasswordLengthIsNotEightCharacter() throws Exception {
		PasswordVerifier.isValidPassword("asd");
		//assertEquals("Password Should be greater than 8 character", actual);

	}
	@Test
	public void shouldCheckFurtherPasswordVerificationIfPasswordGreaterThanEightCharcaters() throws Exception {
		PasswordVerifier.isValidPassword("asdsdadsa");

	}
	
	@Test
	public void shouldReturnValidMsgIfPasswordDoesNotHaveOneUpperCaseCharacter() throws Exception {
		String actual = PasswordVerifier.isValidPassword("asdasdff");
		assertEquals("Password is OK!", actual);

	}
	@Test(expected = MyException.class)
	public void shouldReturnInvalidMsgIfPasswordDoesNotHaveOneLowerrCaseCharacter() throws Exception {
		String actual = PasswordVerifier.isValidPassword("ASDFWGJKLJJ");
		//assertEquals("Invalid Password - must have one lower case", actual);

	}
	
	@Test
	public void shouldReturnValidMsgIfPasswordDoesNotHaveOneDigit() throws Exception {
		String actual = PasswordVerifier.isValidPassword("ASDFasJweer");
		assertEquals("Password is OK!", actual);

	}
	
	@Test
	public void shouldReturnValidMsgIfPasswordHasAnyDigit() throws Exception {
		String actual = PasswordVerifier.isValidPassword("eeeees43sdgs");
		assertEquals("Password is OK!", actual);

	}
	
	@Test
	public void shouldReturnValidMsgIfPasswordMeetAllTheRequirements() throws Exception {
		String actual = PasswordVerifier.isValidPassword("ASDFasJweer");
		assertEquals("Password is OK!", actual);

	}
	

}
