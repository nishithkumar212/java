package algorithms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class PrimeAnagramandPalindrome 
{
public static void main(String[] args)
{
	ArrayList<Integer> al=new ArrayList();
	List<Integer> al1=new ArrayList<Integer>();
 List<Integer>	paly =new ArrayList();
	for(int i=1;i<=1000;i++)
	{
		int count=0;
		for(int num=i;num>=1;num--)
		{
			if(i%num==0)
			{
				count=count+1;
			}
		}
		if(count==2)
		{
			al.add(i);	
		}
	}
	System.out.println(al);
	al1=isprimeAnagram(al);
System.out.println("the anagrams are:");
	for(Integer anagram:al1) {
		System.out.println(anagram);
	}
	System.out.println("the palindromes are");
paly =ispalindrome(al);

}
	public static List<Integer> isprimeAnagram(ArrayList<Integer> arr)
	{
	Integer array[] =arr.toArray(new Integer[arr.size()]);
	ArrayList<Integer> bl=new ArrayList();
	for(int j=0;j<array.length-1;j++)
	{
		for(int k=j+1;k<array.length-1;k++)
		{
			if(isPrime(array[j]+"",array[k]+"")) 
			{
				bl.add(array[j]);
				bl.add(array[k]);
			}
		}
	}
	return bl;
	}
	public static boolean isPrime(String string, String string2) 
	{
		char[] a=string.toCharArray();
		char[] b=string2.toCharArray();
          Arrays.sort(a);
          Arrays.sort(b);
          String srr=new String(a);
          String sr1=new String(b);
          if(srr.equals(sr1))
          {
        	  return true;
          }
		return false;
	}
	public  static List<Integer>ispalindrome(ArrayList<Integer> arr)
	{
		ArrayList paly =new ArrayList();
		Integer[] brr=arr.toArray(new Integer[arr.size()]);
		 for(int i=0;i<brr.length-1;i++)
		 {
			 
				 if(ispaly(brr[i]))
				 {
					 paly.add(i);
					 
				 }
			 }
		return paly;
	}
	public static boolean  ispaly(int s1)
	{
		int rem=0;
		int rev=0;
		int temp=s1;
		while(s1>0)
		{
			 rem=s1%10;
			 rev=rev*10+rem;
			 s1=s1/10;
		}
		if(temp==rev)
		{
			System.out.println(rev);
			return true;
		}
		return false;		
	}
}




