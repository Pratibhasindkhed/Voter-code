package Anudip;
/* Write a java program to check leap year using if-else. How to check whether a given year is leap year or not. */

import java.util.Scanner;
public class Leap_Year_Checker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Taking any year from the user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Year: ");
		int year=sc.nextInt();
		if((year % 400 == 0)||((year % 4 == 0) && (year % 100 != 0))) //Condition for checking leap year
		{
			System.out.println(year+" is a leap year.");//Displaying the result if condition is true
		}
		else 
		{
			System.out.println(year+" is not a leap year.");//Displaying the result if condition is false
		}
	}
}

/* Output:
Enter any Year: 
2024
2024 is a leap year.
Enter any Year: 
2025
2025 is not a leap year.
*/
