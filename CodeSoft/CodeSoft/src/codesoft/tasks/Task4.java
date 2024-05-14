package codesoft.tasks;
/*
 * TASK 4 : QUIZ APPLICATION WITH TIMER  
 */

import java.util.Scanner;
import java.util.Timer;

public class Task4
{
	Scanner sc = new Scanner(System.in);
	Timer tm = new Timer();
	int time = 10;
	
	public void quizApp()
	{
		
		System.out.println("..............QUIZ APPLICATION..............");
		int count=0;
		for(int i= 1;i<=10;i++)
		{
			System.out.println("-----------------------------------------------------------");
			if(i==1)
			{
				System.out.println("Que.1) Who is the father of Java?");
				System.out.println("1)James Gosling\t\t2)Devin Cord\t\t3)Robert Gentlmen\t\t4)Dennis Ritchie");
				System.out.print("Enter Correct Option : ");
				int option = sc.nextInt();
				switch(option)
				{
				case 1 :
					count++;
					break;
				}
			}
			else if(i==2)
			{
				System.out.println("Que.2) Java was developed in the year ....");
				System.out.println("1)1950\t\t2)1975\t\t3)1995\t\t4)1991");
				System.out.print("Enter Correct Option : ");
				int option = sc.nextInt();
				switch(option)
				{
				case 3 :
					count++;
					break;
				}
			}
			else if(i==3)
			{
				System.out.println("Que.3) Number of primitve data types in Java are ?");
				System.out.println("1)6\t\t2)7\t\t3)8\t\t4)9");
				System.out.print("Enter Correct Option : ");
				int option = sc.nextInt();
				switch(option)
				{
				case 3 :
					count++;
					break;
				}
			}
			else if(i==4)
			{
				System.out.println("Que.4) Which of the following is not a Java features ?");
				System.out.println("1)Dynamic\t\t2)Architecture Neutral\t\t3)Object-Oriented\t\t4)Use of pointers");
				System.out.print("Enter Correct Option : ");
				int option = sc.nextInt();
				switch(option)
				{
				case 4 :
					count++;
					break;
				}
			}
			else if(i==5)
			{
				System.out.println("Que.5) Which command is used to compile the Java program ?");
				System.out.println("1)java filename\t\t2)javac filename.java\t\t3)javac filename\t\t4)filename.java");
				System.out.print("Enter Correct Option : ");
				int option = sc.nextInt();
				switch(option)
				{
				case 2 :
					count++;
					break;
				}
			}
			else if(i==6)
			{
				System.out.println("Que.6) Which of the following is top most class in Exception Handling ?");
				System.out.println("1)Exception\t\t2)Throwable\t\t3)Error\t\t4)RuntimeException");
				System.out.print("Enter Correct Option : ");
				int option = sc.nextInt();
				switch(option)
				{
				case 2 :
					count++;
					break;
				}
			}
			else if(i==7)
			{
				System.out.println("Que.7) Who developed the Java programming language?");
				System.out.println("1)Oracle\t\t2)Microsoft\t\t3)Google\t\t4)Sun Microsystems");
				System.out.print("Enter Correct Option : ");
				int option = sc.nextInt();
				switch(option)
				{
				case 4 :
					count++;
					break;
				}
			}
			else if(i==8)
			{
				System.out.println("Que.8) What was the original name for Java?");
				System.out.println("1)Oak\t\t2)C++\t\t3)Pine\t\t4)Maple");
				System.out.print("Enter Correct Option : ");
				int option = sc.nextInt();
				switch(option)
				{
				case 1 :
					count++;
					break;
				}
			}
			else if(i==9)
			{
				System.out.println("Que.9) How do you declare an array in Java?");
				System.out.println("1)int arrayName;\t\t2)int[] arrayName;\t\t3)int arrayName[]\t\t4)Both 2 & 3");
				System.out.print("Enter Correct Option : ");
				int option = sc.nextInt();
				switch(option)
				{
				case 4 :
					count++;
					break;
				}
			}
			else if(i==10)
			{
				System.out.println("Que.10) In Java, strings are?");
				System.out.println("1)Primitive datatype\t\t2)Immutable Objects\t\t3)Mutable Objects\t\t4)Arrays of Characters");
				System.out.print("Enter Correct Option : ");
				int option = sc.nextInt();
				switch(option)
				{
				case 2 :
					count++;
					break;
				}
			}
		}
		System.out.println("-----------------------------------------------------------");
		System.out.println("Correct Answers : "+count+"/10");
		System.out.println("Wrong Answers : "+(10-count));
		int score = count*10;
		System.out.println("Score : "+score+"%");
	}
	public static void main(String[] args) 
	{
		Task4 t = new Task4();
		t.quizApp();
	}
}

