package com.aug5;

import java.util.Scanner;

public class PigLatinSent {

	public static void main(String[] args) {

		System.out.println("What word would you like in Pig Latin?");
		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine();

		String[] bunchOfWords = userInput.split("\\s");

		for (int i = 0; i < bunchOfWords.length; i++) {

			StringBuilder modUserInput = new StringBuilder(bunchOfWords[i].toLowerCase());
			String vowels = "aeiou";

			char firstLetter = modUserInput.charAt(0);
			char secondLetter = modUserInput.charAt(1);
			int vowelIndex = vowels.indexOf(firstLetter);
			int vowelIndex2 = vowels.indexOf(secondLetter);
			boolean firstIsAVowel = (vowelIndex >= 0);
			boolean secondIsAVowel = (vowelIndex2 >= 0);

			if (firstIsAVowel) {
				System.out.println(modUserInput + "yay");
			}

			else if (!(firstIsAVowel) && !(secondIsAVowel)) {
				char[] endings = { 'a', 'y' };

				char deleteFirstLetter = modUserInput.charAt(0);
				modUserInput.deleteCharAt(0);

				char deleteSecondLetter = modUserInput.charAt(0);
				modUserInput.deleteCharAt(0);

				modUserInput.append(firstLetter).append(secondLetter).append(endings);
				System.out.println(modUserInput);

			}

			else {
				char deleteFirstLetter = modUserInput.charAt(0);
				modUserInput.deleteCharAt(0);

				char[] endings = { 'a', 'y' };
				modUserInput.append(firstLetter).append(endings);
				System.out.println(modUserInput);

			}
		}
	}
}