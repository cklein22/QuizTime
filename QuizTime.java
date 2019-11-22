import java.util.Scanner;

public class QuizTime
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, q12, q13, q14, q15, q16, q17, q18, correct = 0;

// question 1
		System.out.println( "Q1) What is the capital of Conneticut?" );
		System.out.print( "\t1) Manchester\n\t2) Hartford\n\t3) Tampa\n> " );
		q1 = keyboard.nextInt();
		if ( q1 == 2 )
		{
			System.out.println( "\nThat's right!\n" );
			correct++;
		}
		else
			System.out.println( "\nSorry, the capital of CT is Hartford.\n" );

//  Mr. Ross question 2
   System.out.println( "Q2) What river is closest to MPS?" );
   System.out.print( "\t1) Hudson\n\t2) Farmington\n\t3) Connecticut\n> " );
   q2 = keyboard.nextInt();
   if ( q2 == 2 )
   {
	   System.out.println( "\nThat's right!\n" );
	   correct++;
   }
     else
	   System.out.println( "\nIt's number two and you can row on it!\n" );

// Cece question 3
		System.out.println( "\n Q3) How many days are in December?");
		System.out.print ("\t1) 30\n\t2) 29\n\t3 31\n>");
		q3 = keyboard.nextInt();
		if ( q3 == 3 )
		{
			System.out.println("\nCorrect!\n");
			correct++;
		}
			else
			System.out.println("\nIt is number 3! There are 31 days in December!\n" );

// Emma question 4
   System.out.println( "Q4) What year was Starbucks founded?" );
   System.out.print( "\t1) 1999\n\t2) 1985\n\t3) 1971\n\t4) 1980\n> " );
   q4 = keyboard.nextInt();
   if ( q4 == 3 )
   {
	   System.out.println( "\noooooo good job! That's correct!\n" );
	   correct++;
   }
   else
	   System.out.println( "\nSorry, it was founded in 1971.\n" );

// Rishitha question 5
   System.out.println( "Q5) For what did the chicken cross the street?" );
   System.out.print( "\t1) Seeds\n\t2) Playground\n\t3) OtherSide\n> " );
   q5 = keyboard.nextInt();
   if ( q5 == 3 )
   {
     System.out.println( "\nThat's right! Very smart!\n" );
     correct++;
   }
   else
     System.out.println( "\nNo you are wrong! To get to the other side is the correct answer! Study your jokes!\n" );

// Elizabeth question 6
  System.out.println( "Q6) Who is Sansa Stark's first fiance?" );
	System.out.print( "\t1) Tyrion Lannister \n\t2) Joffrey Baratheon \n\t3) Loras Tyrell \n\t4) Tommen Baratheon\n> " );
  q6 = keyboard.nextInt();
  if ( q6 == 2 )
  {
    System.out.println( "\nThat's right!\n" );
	  correct++;
  }
  else
	  System.out.println( "\nSorry, the right answer is Joffrey Baratheon.\n" );

// question 7
  System.out.println( "Q7) What is Dwight's Sensei's name?" );
  System.out.print( "\t1) Ira \n\t2) George\n\t3) Stuart \n\t4) Mr. Miyagi\n> " );
  q7 = keyboard.nextInt();
  if ( q7 == 1 )
  {
	  System.out.println( "\nThat's right!\n" );
	  correct++;
  }
  else
	  System.out.println( "\nSorry, it's Ira!\n" );

	// Annabel question 8
		// first question about capital of NJ
		System.out.println( "Q8) What is the capital of New Jersey?" );
		System.out.print( "\t1) Newark \n\t2) Trenton \n\t3) Elizabeth \n> " );
		q8 = keyboard.nextInt();
		if ( q8 == 2 )
		{
			System.out.println( "\nThat's right!\n" );
			correct++;
		}
		else
			System.out.println( "\nSorry, the capital of NJ is Trenton.\n" );

		// Annabel question 9
			System.out.println( "Q9) How many people are in Wyoming?" );
			System.out.print( "\t1) 577,737 \n\t2)323,097  \n\t3) 0 \n> " );
			q9 = keyboard.nextInt();
			if ( q9 == 1 )
			{
				System.out.println( "\nThat's right!\n" );
				correct++;
			}
				else
					System.out.println( "\nSorry, Wyoming actually has 577,737 people.\n" );

// Louise 	question 10
  System.out.println( "Q10) What is the largest band??" );
  System.out.print( "\t1) Twice\n\t2) AKB48\n\t3) NCT\n> " );
  q10 = keyboard.nextInt();
  if ( q10 == 2 )
  {
	  System.out.println( "\nThat's right!\n" );
	  correct++;
  }
  else
  	System.out.println( "\nThe largest is AKB48\n" );

// Katherine question 11
	System.out.println("\nHow many days are in March?");
	System.out.print( "\t1) 30 \n\t2) 28 \n\t3) 30\n\t " );
	q11 = keyboard.nextInt();
	if ( q11 == 28  )
	{
		System.out.println( "\nThat's right!\n" );
		correct++;
	}
	else
		System.out.println( "\nNope, there are 30 days\n" );

// Katherine question 12
		System.out.println("\nWhich is a macromolecule?");
		System.out.print( "\t1) Lipids \n\t2)Water \n\t3) Solar Power\n\t " );
		q12 = keyboard.nextInt();
		if ( q12 == 1 )
		{
			System.out.println( "\nThat's right!\n" );
			correct++;
		}
		else
			System.out.println( "\nLipids,are a macromolecule.\n" );

// Cece question 13
		System.out.println( "\n Q13) Which is a wild animal?");
		System.out.print ("\t1) ferret\n\t2) jaguar\n\t3 husky\n>");
		q13 = keyboard.nextInt();
		if ( q13 == 2 )
		{
			System.out.println("\nCorrect!\n");
			correct++;
		}
			else
			System.out.println("\nThe correct answer number two! Jaguars are wild animals!\n" );

// Louise 	question 14
			System.out.println( "Q14) What is worse than the 200 fly??" );
			System.out.print( "\t1) nothing\n\t2) 1650Free\n\t3)400IM\n> " );
			q14 = keyboard.nextInt();
			if ( q14 == 1 )
			{
				System.out.println( "\nThat's right!\n" );
				correct++;
			}
			else
				System.out.println( "\n200 Fly is death. Nothing is worse\n" );

// Rishitha question 15
  System.out.println( "Q15) Who was the first first president?" );
  System.out.print( "\t1) Abraham Lincoln\n\t2) Joe\n\t3) George Washington\n> " );
  q15 = keyboard.nextInt();
  if ( q15 == 3 )
  {
	  System.out.println( "\nThat's right! Very smart!\n" );
	  correct++;
  }
  else
	  System.out.println( "\nNo you are wrong! It's George Washington\n" );

// Stella 16
	System.out.println( "Q16) How long does it take to do homework?" );
	System.out.print( "\t1) 1hour \n\t2)30minutes \n\t3)forever\n> " );
	q16 = keyboard.nextInt();
	if ( q16 ==3  )
	{
		System.out.println( "\nThat's right!\n" );
		correct++;
	}
	else
		System.out.println( "\nSorry, homework takes forever!\n" );

// Stella 17
	System.out.println( "Q17) What is the quickest moving continent?" );
	System.out.print( "\t1) Euroasia \n\t2)Australia \n\t3)North America\n> " );
	q17 = keyboard.nextInt();
	if ( q17 ==2  )
	{
		System.out.println( "\nThat's right!\n" );
	 correct++;
	}
	else
		System.out.println( "\nSorry, Australia is the fastest!\n" );

// Emma question 18
	System.out.println( "Q18) When was the internet actually born" );
	System.out.print( "\t1) October 29, 1969\n\t2) December 5, 1980\n\t3) August 4, 1972\n\t4) June 12, 1978\n> " );
	q18 = keyboard.nextInt();
	if ( q18 == 1 )
	{
		System.out.println( "\noooooo good job! That's correct!\n" );
		correct++;
	 }
	 else
		System.out.println( "\nSorry, It was October 29, 1969.\n" );

// End of quiz
System.out.println( "Overall, you got " + correct + " out of 18 correct." );
System.out.println( "Thanks for playing!");
}
}
