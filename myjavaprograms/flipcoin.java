package myjavaprograms;
import java.util.Random;
import bridgeit.utility;
public class flipcoin 
{
	static int num;
	static float heads;
	static float tails;
	
public static void main(String[] args)
{
	flipcoin obj=new flipcoin();
	System.out.println("enter the number to how many times flip the coin");
	 num=utility.getint();
for(int i=1;i<=num;i++)
{
	Double a= Math.random();
	System.out.println(a);
	if(a>0.5)
	{
		heads++;
	}
	else if(a<0.5)
	{
		tails++;
		}
}
System.out.println(heads);
System.out.println(tails);
	float headpercentage=(heads/num)*100;
	float tailpercentage=(tails/num)*100;
	System.out.println(headpercentage);
	System.out.println(tailpercentage);
}
}
