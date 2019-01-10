package datastructures;
import java.util.ArrayList;
import bridgeit.utility;
public class primenumbers
{
public static void main(String[] args)
{
ArrayList<Integer> al=new ArrayList<Integer>();
for(int i=1;i<100;i++)
{
	int count=0;
	for(int j=i;j>=1;j--)
	{
	if(i%j==0)
	{
		count=count+1;
	}
	}
	if(count==2)
	{
		al.add(i);
	}
}
Integer[] arr=al.toArray(new Integer[al.size()]);
for(int i=0;i<=arr.length-1;i++)
{
	System.out.print(arr[i]);
}
int[][] todi= new int[1][100];
for(int k=0;k<1;k++)
{
	int x=0;
	for(int l=0;l<todi.length-1;l++)
	{
		todi[k][l]=arr[x];
		x++;
	}
}
System.out.println();
for(int m=0;m<=todi.length-1;m++)
{
	for(int n=0;n<=todi.length-1;n++)
	{
		System.out.println(todi[m][n]);
	}
	}
}
}







