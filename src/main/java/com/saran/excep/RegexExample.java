package com.saran.excep;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Regex is an API to define a pattern for searching or manipulating strings
 * package: java.util.regex
 * 
 */
public class RegexExample {

	public static void main(String[] args) {
		Pattern p = Pattern.compile(".s");
		Matcher m = p.matcher("as");
		boolean b = m.matches();

		boolean b1 = Pattern.compile(".s").matcher("as").matches();

		boolean b2 = Pattern.matches(".s", "as");

		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(Pattern.matches(".s", "nc"));// false
		System.out.println(Pattern.matches("..s", "mas"));// true
		System.out.println(Pattern.matches("[amn]", "m"));// any of those true
		System.out.println(Pattern.matches("[a-zA-Z]", "a"));// true
		System.out.println(Pattern.matches("[a-d[m-p]]", "n"));//
		System.out.println(Pattern.matches("[amn]?", "a"));// true
		/*
		 * X? -> X occurs once or not at all X+ -> X occurs once or more times X* -> X
		 * occurs zero or more times X{n} -> X occurs n times only X{y,z}-> X occurs at
		 * least y times but less than z times
		 * 
		 * 
		 */

		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("Enter regex pattern");
			Pattern p1 = Pattern.compile(s.nextLine());
			System.out.println("Enter your text");
			Matcher matcher = p1.matcher(s.nextLine());
			boolean b4 = false;
			while (matcher.find()) {
				System.out.println(
						"Found te text " + m.group() + "starting at index" + m.start() + "ending at index" + m.end());
				
				b4 = true;
				

			}
			if (!b4) {
				
				System.out.println("no match found");
			}

		}

	}

}
