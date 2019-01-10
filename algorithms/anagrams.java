package algorithms;
import java.util.Arrays;
public class anagrams
{
	static String str1="madam";
	static String str2="adamm";
public static void main(String[] args)
{
char[] a=	str1.toCharArray();
	         char[] b =str2.toCharArray();
	     System.out.println(a);
	     System.out.println(b);
	     Arrays.sort(a);
	     Arrays.sort(b);
	    Boolean status=Arrays.equals(a, b);
	    if(status==true)
	    {
	    	System.out.println("given are anagrams");
	    }
	    else
	    {
	    	System.out.println("given are not anagrams");
	    }
}
}
