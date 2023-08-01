package BrushUpProject.BrushUpProject;

import java.util.ArrayList;
import java.util.Scanner;

public class PracticeString {

	int count = 0;
	int b = 6;

	public void test(String s) {

		String s1 = "aeiou";

		ArrayList<Character> a = new ArrayList<Character>();
		for (int i = 0; i < s1.length(); i++) {
			a.add(s1.charAt(i));

		}
		for (int j = 0; j < s.length(); j++) {
			if (a.contains(s.charAt(j))) {
				count++;

			}
		}
		System.out.println("Total count is:" + count);
	}

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter username");
		String userName = myObj.nextLine();
		System.out.println("Enter salary");
		myObj.nextFloat();
		PracticeString p = new PracticeString();
		p.test(userName);
	}
}
