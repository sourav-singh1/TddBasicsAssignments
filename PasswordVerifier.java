package com.yash.TddAssignments;

public class PasswordVerifier {

	public String isValidPassword(String password) throws Exception {

		if (password==null) {
			throw new MyException("Password should bot be null");
		} else {
			if (password.length() < 8) {
				throw new MyException("Password Should be greater than 8 character");
			} else if (password.chars().anyMatch(ch -> Character.isLowerCase(ch))) {
				if (password.chars().anyMatch(ch -> Character.isUpperCase(ch))) {
					return "Password is OK!";
				} else if (!password.chars().anyMatch(ch -> Character.isDigit(ch))) {
					return "Password is OK!";
				}
				return "Password is OK!";
			}
			throw new MyException("Invalid Password - must have one lower case");
		}
	}
}
