package algorithms;
import java.util.Arrays;
import bridgeit.utility;
public class mainfunctocallutility 
{
public static void main(String[] args)
{
	/*
	int[] arr= {10,20,30,40,50,60,70,80,90,100};      
 int k=utility.binarysearch(arr,50);
System.out.println(k);
*/
	System.out.println("abhi,nishu,chinna,kanna");
String[] rr= {"abhi","nishu","chinna","kanna"};
System.out.println("enter the string");
String l=utility.getstring();
int result=utility.binaryserchstring(rr, l);
if (result == -1) 
{
	System.out.println("string not present"); 
}
else
{
	
    System.out.println("string found at "
                      + "index " + result);
	}
/*
int[] brr= {60,20,50,55,11};
utility.bubblesortinteger(brr);
String[] srr= {"abhi","kanna","chinna","nishu"};
utility.bubblesortstring(srr);
System.out.println();
int[] krr= {90,10,34,56};
utility.insertionsortinteger(krr);
String[] x= {"a","y","c","b","l"};
utility.insertionsortString(x);
*/
}
}

