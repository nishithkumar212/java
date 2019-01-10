package algorithms;
import bridgeit.utility;
public class vendingmachine {
	public static void main(String[] args)
	{
		int[] srr= {1000,500,100,50,20,10,5,1};
		System.out.println("enter the amount value");
		int money=utility.getint();
	int total=utility.vendingcalculate(money,srr);
	if(total==-1)
	{
		System.out.println("enter the positve amount");
	}
	System.out.println("the total notes are:"+total);
		}
	}


