package algorithms;
import bridgeit.utility;
public class findnumber
{
public static void main(String[] args)
{
	System.out.println("enter a number");
	int a=utility.getint();
	int count=0;
double  value=	 Math.pow(2, a);
int values=(int)value;
int[] arr=new int[values];
for(int i=0;i<=values-1;i++)
{
	arr[i]=i;
}
int number=utility.findNumber(arr, 0, arr.length-1);
if(number==-1)
{
	System.out.println("the guess umber is not present in a given array");
}
else
	{
	System.out.println("the guess number is"+number);
	}
}
}