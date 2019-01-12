package datastructures;
import java.util.ArrayList;
import java.util.List;
import algorithms.PrimeAnagramandPalindrome;
import bridgeit.utility;
public class primenumbers2darray
{
public static void main(String[] args)
{
ArrayList<Integer> al=new ArrayList<Integer>();
for(int i=1;i<1000;i++)
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
Integer[] in=al.toArray(new Integer[al.size()]);
int[][] arr=new int[10][18];
int x=0;
for(int i=0;i<arr.length-1;i++) {
	for(int j=0;j<arr[0].length-1;j++) {
		arr[i][j] = in[x];
		x++;
	}
}
for(int i =0;i<10;i++) {
	for(int j=0;j<18;j++) {
		System.out.print(arr[i][j]+" ");
	}
	System.out.println();
}
}
}






