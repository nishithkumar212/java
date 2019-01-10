package algorithms;

import bridgeit.utility;

public class monthlypayment 
{
	public static void main(String[] args)
	{
	System.out.println("enter the principle(amount)");
	int amount=utility.getint();
	System.out.println("enter how many years");
	int year=utility.getint();
	System.out.println("enter the rate of interest");
	int rate=utility.getint();
	double k=utility.monthlypayment(amount,year,rate);
	System.out.println("the amount per month is:"+k);
}
}
