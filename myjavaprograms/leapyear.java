package myjavaprograms;

import java.util.Scanner;

import bridgeit.utility;
public class leapyear 
{
	public static void main(String[] args) 
	{
		Boolean status;
    
    System.out.println("enter the number to know leap year or not");
    int a=utility.getint();
    if(a%400==0)
    {
    	status=true;
    }
    else if(a%100==0)
    {
       status =false;
    }
    else if(a%4==0)
	{
		status=true;
	}
    if(status=true)
    {
    	System.out.println("given number is a leap year");
    }
    else
    {
    	System.out.println("given number is not a leap year");
    }
	}
}
