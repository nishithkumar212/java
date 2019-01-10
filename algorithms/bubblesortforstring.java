package algorithms;
import java.util.Arrays;
public class bubblesortforstring
{
public static void main(String[] args) 
{
String[] srr= {"abhi","kanna","chinna","nishu"};
int len=srr.length;
for(int i=0;i<len-1;i++)
{
	for(int j=0;j<len-1;j++)
	{
        int res=srr[j].compareTo(srr[j+1]);
        if(res>0)
        {
        	String temp=srr[j];
        	srr[j]=srr[j+1];
        	srr[j+1]=temp;
        }
	}
}
for(int k=0;k<=srr.length-1;k++)
{
	System.out.print(srr[k]+" ");
}
}
}
