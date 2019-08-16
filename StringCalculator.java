package com.yash.TddAssignments;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StringCalculator {
	static Logger logger = Logger.getLogger(StringCalculator.class.getName());

	public int addNumbersFromString(String string) throws Exception {
		if (string.isEmpty()) {
			logger.log(Level.INFO, "sum = " +0);
			return 0;
		} else {
			if (string.charAt(0) == '/') {
				char delimetor = string.charAt(2);
				String numberString = string.replaceAll("\n", string.charAt(2) + "").replaceAll("/", "").substring(1);
				return StringCalculator.getSumOfNumbers(numberString, delimetor);
			} else {
				return StringCalculator.getSumOfNumbers(string, ',');
			}
		}
	}

	public static int getSumOfNumbers(String string, char delimetor) throws Exception {
		String[] number = string.split(delimetor + "");
		if (number.length == 1) {
			int num = Integer.parseInt(number[0]);
			if (num > 1000)
				return 0;
			else
				logger.log(Level.INFO, "sum = " +num);
				return num;
		} else {
			for (int i = 0; i < number.length; i++) {
			}
			int[] integerArray = new int[number.length];
			for (int i = 0; i < number.length; i++) {
				try {
					integerArray[i] = Integer.parseInt(number[i].trim());
					if (integerArray[i] < 0) {
						throw new MyException("Negative Numbers are Not allowed");
					}
					if (integerArray[i] > 1000) {
						integerArray[i] = 0;
					}
				} catch (NumberFormatException e) {
					throw new NumberFormatException();
				}
			}
			int sum = Arrays.stream(integerArray).sum();
			logger.log(Level.INFO, "sum = " +sum);
			return sum;
		}
	}
}
