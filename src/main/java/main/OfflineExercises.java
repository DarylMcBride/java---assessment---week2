package main;


public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") → "TTThhheee"
	// multChar("AAbb") → "AAAAAAbbbbbb"
	// multChar("Hi-There") → "HHHiii---TTThhheeerrreee"

	/*
	 * public String chToString(char[] a) { String result = "";
	 * 
	 * for (int i = 0; i < a.length; i++) { result += a[i]; }
	 * 
	 * return result; }
	 */

	public String multChar(String input) {
		// ArrayList<Character> c = new ArrayList<Character>();
		// char[] a = new char[input.length() * 3];
		String result = "";

		for (int i = 0; i <= input.length() - 1; i++) {
			for (int j = 1; j <= 3; j++) {
				result += input.substring(i, i + 1);
			}
		}

		/*
		 * for (int i = 1; i < input.length() - 1; i++) { for (int j = 1; j <= 3; j++) {
		 * 
		 * 
		 * } }
		 */
		return result;
	}

	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") → "evilc"
	// getBert("xxbertfridgebertyy") → "egdirf"
	// getBert("xxBertfridgebERtyy") → "egdirf"
	// getBert("xxbertyy") → ""
	// getBert("xxbeRTyy") → ""

	public String getBert(String input) {

		String result = "";
		int counter = 0;
		String[] str = input.split("bert");
		str.toString();

		for (int i = 0; i < input.length(); i++) {
			if (input.substring(i, i + 4).equalsIgnoreCase("bert")) {

			}
		}

		if (counter >= 2)
			result = "";

		return result;
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false
	// evenlySpaced(4, 60, 9) → false

	public boolean evenlySpaced(int a, int b, int c) {
		boolean evenSpace = false;

		if (a % 2 == 0 && b % 2 == 0 && c % 2 == 0) {
			evenSpace = true;
		}

		return evenSpace;
	}

	// Given a string and an int n, return a string that removes n letters from the
	// 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input
	// is odd.

	// nMid("Hello", 3) → "Ho"
	// nMid("Chocolate", 3) → "Choate"
	// nMid("Chocolate", 1) → "Choclate"

	public String nMid(String input, int a) {
		int middle = input.length() / 2;
		String result = "";
		for (int i = 0; i < input.length(); i++) {
			if (i < middle) {
				//if (input.substring(i, i-a))
				result += input.substring(i, i + 1);
			}
		}

		return result;
	}

	// Given a string, return true if it ends in "dev". Ignore Case

	// endsDev("ihatedev") → true
	// endsDev("wehateDev") → true
	// endsDev("everoyonehatesdevforreal") → false
	// endsDev("devisnotcool") → false

	public boolean endsDev(String input) {
		boolean isDevEnd = false;
		int middle = input.length() / 2;

		if (input.substring(middle).contains("dev") || (input.substring(middle).contains("Dev"))) {
			isDevEnd = true;
		}

		return isDevEnd;

	}

	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") → 2
	// superBlock("abbCCCddDDDeeEEE") → 3
	// superBlock("") → 0

	public int superBlock(String input) {
		int counter = 0;
		int length = 0;
		for (int i = 0; i < input.length() - 1; i++) {
			if (input.substring(i, i + 1).equalsIgnoreCase(input.substring(i + 1, i + 2))) {
				counter++;
			}
		}

		return counter;

	}

	// given a string - return the number of times "am" appears in the String
	// ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by
	// other letters
	//
	// amISearch("Am I in Amsterdam") → 1
	// amISearch("I am in Amsterdam am I?") → 2
	// amISearch("I have been in Amsterdam") → 0

	public int amISearch(String arg1) {
		int counter = 0;

		for (int i = 0; i <= arg1.length() - 2; i++) {
			if (arg1.substring(i, i + 1).equalsIgnoreCase("a") && arg1.substring(i + 1, i + 2).equals("m")) {

				counter++;
			}

			if (arg1.substring(i, i + 1).equalsIgnoreCase("d") && arg1.substring(i + 1, i + 2).equals("a")) {
				counter--;
			}

			if (arg1.substring(i, i + 1).equalsIgnoreCase("m") && arg1.substring(i + 1, i + 2).equals("s")) {
				counter--;
			}

			if (arg1.substring(i, i + 1).equalsIgnoreCase("m") && arg1.substring(i + 1, i + 2).equals("a")) {
				counter--;
			}

			if (arg1.substring(i, i + 1).equalsIgnoreCase("m") && arg1.substring(i + 1, i + 2).equals("u")) {
				counter -= 2;
			}
			/*
			 * if (arg1.substring(i, i + 1).equalsIgnoreCase("a")) { if (arg1.substring(i-1,
			 * i).equals("d")) {
			 * 
			 * } else { counter--; } }
			 */
		}

		return counter;
	}

	// given a number
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3 and 5return "fizzbuzz"
	//
	// fizzBuzz(3) → "fizz"
	// fizzBuzz(10) → "buzz"
	// fizzBuzz(15) → "fizzbuzz"

	public String fizzBuzz(int arg1) {
		String result = null;
		if (arg1 % 3 == 0 && arg1 % 5 == 0) {
			result = "fizzbuzz";
		} else if (arg1 % 5 == 0) {
			result = "buzz";
		} else if (arg1 % 3 == 0) {
			result = "fizz";
		}

		return result;

	}

	// Given a string split the string into the individual numbers present
	// then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	// largest("55 72 86") → 14
	// largest("15 72 80 164") → 11
	// largest("555 72 86 45 10") → 15

	public int largest(String arg1) {
		int a = 0;
		Integer abc = 0;

		for (int i = 0; i < arg1.length(); i++) {
			/*
			 * if (!arg1.substring(i, i + 1).equals(" ")) { a =
			 * abc.valueOf(arg1.substring(i,i+1)) + abc.valueOf(arg1.substring(i+1,i+2)); }
			 */
		}
		/*
		 * int resultFinal = 0; for (int i = 1; i < arg1.length() - 1; i++) { if
		 * (!arg1.substring(i, i + 1).equals(" ")) { int num1 =
		 * Integer.parseInt(arg1.substring(i, i + 1)); int num2 =
		 * Integer.parseInt(arg1.substring(i + 1, i + 2)); int total = num1 + num2; if
		 * (total >= resultFinal) { resultFinal = total; } } }
		 */
		return 123;
	}

}
