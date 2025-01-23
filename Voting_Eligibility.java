package Anudip;
/* Write a java program to check candidate eligible for voting or not. */

import java.util.Scanner;
public class Voting_Eligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Taking age of candidate from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age of candidate: ");
		int age=sc.nextInt();
		if(age>=18) //Condition for voting
		{
			System.out.println("Candidate is eligible for voting...");//Displaying the result if condition is true
		}
		else
		{
			System.out.println("Candidate is not eligible for voting...");//Displaying the result if condition is false
		}

	}
}

/*Output:
Enter the age of candidate: 
21
Candidate is eligible for voting...
Enter the age of candidate: 
15
Candidate is not eligible for voting...
*/