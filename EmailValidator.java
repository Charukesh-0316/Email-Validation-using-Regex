package com.charukesh.regularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter email to check it is valid or not : ");
		String emailString = scanner.next();
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(emailString);
		if (matcher.find()) {
			System.out.println("Your email is valid + " + matcher.group());
		}else {
			System.out.println("Your email is not valid");
		}
		
		
	}

}
