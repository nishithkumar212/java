package myjavaprograms;

import bridgeit.utility;

public class roots 
{
public static void main(String[] args)
{
	System.out.println("enter a value");
	int a=utility.getint();
	System.out.println("enter b value");
	int b=utility.getint();
	System.out.println("enter c value");
	int c=utility.getint();
	int delta=(b*b)-(4*a*c);
	System.out.println(delta);
	double root1=(-b+Math.sqrt(delta))/(2*a);
	double root2=(-b-Math.sqrt(delta))/(2*a);
	System.out.println("the first root is"+root1);
	System.out.println("the second root is"+root2);
}
}
