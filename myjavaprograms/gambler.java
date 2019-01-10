package myjavaprograms;
import bridgeit.utility;
public class gambler 
{
public static void main(String[] args)
{
	System.out.println("enter the stake value");
	int stake=utility.getint();
	System.out.println("enter the goal value");
	int goal=utility.getint();
	System.out.println("enter the no of trials");
	int trials=utility.getint();
	int wins=0;
	int bets=0;
	for(int i=1;i<=trials;i++)
	{
		int cash=stake;
		while(cash>0&&cash<goal)
		{
			bets++;
		if(Math.random()<0.5)
		{
			cash++;
		}
		else
		{
			cash--;
		}
		}
	if(cash==goal)
	{
		wins++;
	}
	}
System.out.println(wins+"wins of"+trials);
System.out.println("win percentage is" +100.0*wins/trials);
}
}
