package myjavaprograms;

import java.util.Scanner;

import bridgeit.utility;
public class leapyear 
{
	public static void main(String[] args) 
	{
		Boolean status;
    
    System.out.println("enter the year to know leap year or not");
    int a=utility.getint();
    if((a%400==0|| a%100==0)&&(a%4==0))
    {
    	System.out.println("its a leap year");
    }
    else
    {
    	System.out.println("given year is not a leap year");
    }
	}
}
