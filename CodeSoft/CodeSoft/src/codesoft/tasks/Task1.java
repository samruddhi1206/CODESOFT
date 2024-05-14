package codesoft.tasks;

import java.util.Random;
import java.util.Scanner;
/*
 * TASK 1 : NUMBER GAME
 */
public class Task1 
{
	Scanner sc = new Scanner(System.in);
	Random random = new Random();
	
	public void numberGame()
	{
		System.out.println(".....Welcome to the Number Game.....\nThe system will generate Random Number between 1 to 100. Try to guess it!");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("Rounds of Number Game : \nRound 1 : Easy Level (10 chances to guess the correct number.)\nRound 2 : Intermediate Level (5 chances to guess the correct number.)\nRound 3 : Hard Level (Only 2 chances to guess the correct number.)\n***Note : Press any key to exit the game.");
		System.out.println("------------------------------------------------------------------------------");
		while(true)
		{
			System.out.print("Enter round no. which you want to start : "); 
			int level = sc.nextInt();
			if(level==1)
			{
			
						System.out.println("Round 1 Started...");
						int numRandom = random.nextInt(0, 100);
						
						int attempt = 1;
						while(attempt<=10)
						{
							System.out.print("Enter attempt "+attempt+" : ");
							int numUser = sc.nextInt();
							if(numUser == numRandom)
							{
								System.out.println("Congratulations! You guessed the number "+numUser+" correctly.\n");
								System.out.println("Your Score "+(11-attempt)*10+"/100");
								System.out.println("------------------------------------------------------------------------------");
								break;
							}
							else if(attempt == 10)
							{
								System.out.println("\nYour attempt limit is complete.\nPlease try again...");
								System.out.println("Your Score : 0/100");
								System.out.println("------------------------------------------------------------------------------");
								break;
							}
							else if(numRandom>numUser)
							{
								System.out.println("To low! Try again.");
							}
							else if(numRandom<numUser)
							{
								System.out.println("To high! Try again.");
							}
							attempt++;
						}
						
			}
						
			else if(level==2)
			{
						System.out.println("Round 2 Started...");
						int numRandom = random.nextInt(0, 100);
						
						int attempt = 1;
						while(attempt<=5)
						{
							System.out.print("Enter attempt "+attempt+" : ");
							int numUser = sc.nextInt();
							if(numUser == numRandom)
							{
								System.out.println("Congratulations! You guessed the number "+numUser+" correctly.\n");
								System.out.println("Your Score "+(6-attempt)*20+"/100");
								System.out.println("------------------------------------------------------------------------------");
								break;
							}
							else if(attempt == 5)
							{
								System.out.println("\nYour attempt limit is complete.\nPlease try again...");
								System.out.println("Your Score : 0/100");
								System.out.println("------------------------------------------------------------------------------");
								break;
							}
							else if(numRandom>numUser)
							{
								System.out.println("To low! Try again.");
							}
							else if(numRandom<numUser)
							{
								System.out.println("To high! Try again.");
							}
							attempt++;
						}
			}
			else if(level==3)
			{
						System.out.println("Round 2 Started...");
						int numRandom = random.nextInt(0, 100);
						
						int attempt = 1;
						while(attempt<=2)
						{
							System.out.print("Enter attempt "+attempt+" : ");
							int numUser = sc.nextInt();
							if(numUser == numRandom)
							{
								System.out.println("Congratulations! You guessed the number "+numUser+" correctly.\n");
								System.out.println("Your Score "+(3-attempt)*50+"/100");
								System.out.println("Your Score : 0/100");
								System.out.println("------------------------------------------------------------------------------");
								break;
							}
							else if(attempt == 2)
							{
								System.out.println("\nYour attempt limit is complete.\nPlease try again...");
								System.out.println("------------------------------------------------------------------------------");
								break;
							}
							else if(numRandom>numUser)
							{
								System.out.println("To low! Try again.");
							}
							else if(numRandom<numUser)
							{
								System.out.println("To high! Try again");
							}
							attempt++;
						}
			}
			else
			{
					System.out.println("------------------------------------------------------------------------------");
					System.out.println("Thank You for Playing./nHope you enjoy it...");
					break;
			}
		}
	}
	public static void main(String[] args) 
	{
		Task1 t = new Task1();
		t.numberGame();
	}
}
