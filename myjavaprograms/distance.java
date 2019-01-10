package myjavaprograms;
import bridgeit.utility;
public class distance
{
	public double calculate(int x,int y)
	{
		double a=Math.sqrt((x*x)+(y*y));
		return a;
	}
public static void main(String[] args)
{
	System.out.println("enter a number");
int a=utility.getint();
System.out.println("enter a number");
int b=utility.getint();
distance obj=new distance();
double k=obj.calculate(a,b);
System.out.println("the distance betwwen origin and point is"+k);
}
}
