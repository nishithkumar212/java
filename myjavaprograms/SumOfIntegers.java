package myjavaprograms;
import bridgeit.utility;
public class SumOfIntegers
{
public static void main(String[] args)
{
System.out.println("enter the size of an array");
int a=utility.getint();
int[] arr=new int[a];
System.out.println("enter the array elements");
for(int l=0;l<arr.length;l++)
{
	arr[l]=utility.getint();
}
for(int i=0;i<arr.length;i++) {
	for(int j=i+1;j<arr.length;j++) {
		for(int k=j+1;k<arr.length;k++) {
			if((arr[i]+arr[j]+arr[k])==0) {
				System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
			}
		}
	}
}
}
}
