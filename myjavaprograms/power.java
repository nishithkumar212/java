package myjavaprograms;
import java.util.Scanner;
import bridgeit.utility;
public class power 
{
public static void main(String[] args) 
{
	System.out.println("enter the power value");
int num=utility.getint();
if(num<=0)
{
	System.out.println("enter only positive numbers");
}
else
{
	for(int i=1;i<=num;i++)
	{
	System.out.println(Math.pow(2, i));	
}
}
}
}
