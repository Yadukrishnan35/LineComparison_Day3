package com.linecomparison_Day3;

import java.util.Scanner;

public class LineComparison {
	
	public static void main(String[] args) 
	{
	
		length();
	}
		
		public static int length()
		{
		
			System.out.println("Welcome to Line Comparison Program");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter first co-ordinates (x,y) ");  
	        System.out.print("Enter x co-ordinate: ");  
	        int x1= sc.nextInt();  
	        System.out.print("Enter y co-ordinate: "); 
	        int y1= sc.nextInt(); 
	        System.out.println("Enter second co-ordinates (x,y) ");  
	        System.out.print("Enter x : ");  
	        int x2= sc.nextInt();  
	        System.out.print("Enter y : "); 
	        int y2= sc.nextInt(); 

	        // Calculate length
	        double length_of_firstline =  Math.sqrt( Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2) );
	        System.out.println(" Length of line : " + length_of_firstline);
            
	        // int length1=(int)length_of_firstline;
	        
            System.out.println("Read the cordinates to find the length of the line 2");
	        System.out.println("Enter first co-ordinates (x,y) ");  
	        System.out.print("Enter x co-ordinate: ");  
	        int a1= sc.nextInt();  
	        System.out.print("Enter y co-ordinate: "); 
	        int b1= sc.nextInt(); 
	        System.out.println("Enter second co-ordinates (x,y) ");  
	        System.out.print("Enter x : ");  
	        int a2= sc.nextInt();  
	        System.out.print("Enter y : "); 
	        int b2= sc.nextInt(); 
	        
	      //calculate length of second line
	        double length_of_secondline =  Math.sqrt( Math.pow(a2-a1, 2) + Math.pow(b2-b1, 2) );
	        System.out.println(" Length of second line : " + length_of_secondline);
		   
	        
	        //int length2=(int)length_of_secondline;
	        
	        
	        // check equality of length
	       if(length_of_firstline==length_of_secondline)
	       {
	          System.out.println(" Lines are equal ");
	       }
	       else{
	           System.out.println(" Lines are not equal ");
	       }
	        
	 return 1;
		
		}

}
