// This program generates a QB rating

import java.util.Scanner;

public class QBrating
{
	public static void main(String[] args){
		
		double completions; // passes completed
		double yards;	// yards passed
		double attempts; // attempted passes
		double touchdowns; // passes to score
		double interceptions; // passes intercepted
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter stats below");
		System.out.println("Number of completions:");
		completions = input.nextDouble();
		System.out.println("Number of passing yards:");
		yards = input.nextDouble();
		System.out.println("Number of passes attempted:");
		attempts = input.nextDouble();
		System.out.println("Number of touchdowns");
		touchdowns = input.nextDouble();
		System.out.println("Number of interceptions:");
		interceptions = input.nextDouble();
		
		double stat = rating(a(completions,attempts),b(yards,attempts),c(touchdowns,attempts),d(interceptions, attempts)); // sets a,b,c, and d to two things to give plug in easy to formulas
		double result = Math.round(stat*100.0)/100.0;
		
		System.out.println("The Quarterback Rating is " + result);	
			
	}
	public static double a(double x, double y) // x/y refers to completions divided by attempts 
	{
		return ((x/y) -.3)*5;
	}
	public static double b(double x, double y) // x/y refers to yards divided by attempts
	{
		return ((x/y) -3)*.25;
	}
	public static double c(double x, double y) // x/y refers to touchdowns divided by attempts
	{
		return((x/y)*20);
	}
	public static double d(double x, double y) // x/y refers to interceptions divided by attempts
	{
		return (2.375 - ((x/y)*25));
	}
	public static double rating(double a, double b, double c, double d)
	{
		return(((a+b+c+d)/6)*100);
	}
	
	
		
	
	
	
	
	
	
	
	
	
	
	
}


