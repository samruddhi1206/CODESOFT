package codesoft.tasks;

import java.util.Scanner;

/*
 * TASK 2 : STUDENT GRADE CALCULATOR
 */
public class Task2 
{
	Scanner sc = new Scanner(System.in);
	public void gradeCalculator()
	{
		double marksSum=0;
		System.out.print("Enter no. of subjects : ");
		int totalSub = sc.nextInt();
		System.out.println("\nEnter marks of each subject out of 100 : ");
		for(int i = 1;i<=totalSub;i++)
		{
			System.out.print("Subject "+i+" : ");
			int marks = sc.nextInt();
			marksSum = marksSum + marks;
		}
		System.out.println("\nTotal Marks : "+marksSum);
		double per = marksSum/totalSub;
		System.out.println("Percentage : "+per);
		System.out.print("Grade : ");
		if(per<=100 && per>80) 
		{
			System.out.println("A");
		}
		else if(per<=80 && per>60)
		{
			System.out.println("B");	
		}
		else if(per<=60 && per>40)
		{
			System.out.println("C");
		}
		else if(per<=40 && per>=35)
		{
			System.out.println("D");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	public static void main(String[] args) 
	{
		Task2 t = new Task2();
		t.gradeCalculator();
	}
}
