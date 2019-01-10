package algorithms;
public class selectionsort
{
public static void main(String[] args)
{
	int[] arr= {12,8,90,2,7,10,4};
	for(int i=0;i<arr.length-1;i++)
	{
		int min=i;
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[j]<arr[min])
			{
				min=j;
			}
		}
		int temp=arr[i];
		arr[i]=arr[min];
		arr[min]=temp;
	}
for(int k=0;k<arr.length;k++)
{
	System.out.println(arr[k]);
}
}
}
