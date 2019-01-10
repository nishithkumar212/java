package myjavaprograms;
import bridgeit.utility;
public class arrays 
{	
public static void main(String[] args)
{
	System.out.println("enter number of rows");
	int a=utility.getint();
System.out.println("enter number of columns");
int b=utility.getint();
	int[][] arr=new int[a][b];
	System.out.println(arr.length);
	System.out.println("enter the elements for an array");
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=0;j<=arr.length-1;j++)
		{
			arr[i][j]=utility.getint();
		}
	}
	for(int k=0;k<=arr.length-1;k++)
	{
		for(int l=0;l<=arr.length-1;l++)
		{
			System.out.print(arr[k][l]+" ");
		}
		System.out.println();
	}
}
}


