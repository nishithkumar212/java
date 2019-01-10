package myjavaprograms;
import bridgeit.utility;
public class harmonic 
{
	static double count;
	public static void main(String[] args) {
System.out.println("enter a number");	
int a=utility.getint();
count=0;
for(int i=1;i<=a;i++)
{
	 
	count=count+(1.0/i);
}
System.out.println(count);
	}
}
