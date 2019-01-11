package datastructures;
import bridgeit.utility;
public class palindromechecker
{
public static void main(String[] args)
{
	queuepalindrome obj=new queuepalindrome();
System.out.println("enter a string");
String str=utility.getstring();
char[] a=str.toCharArray();
for(int i=0;i<=a.length-1;i++)
{
	obj.enque(a[i]);
}
char[] reverse=new char[a.length];
int j=0;
for(int i=a.length-1;i>=0;i--)
{
	reverse[j]=obj.deque();
	j++;
}
String r=new String(reverse);
String actual="";
for(int i=r.length()-1;i>=0;i--)
{
	char b=r.charAt(i);
	actual=actual+b;
}
System.out.println(actual);
if(str.equals(actual))
{
	System.out.println("given string is palindrome");
}
else
{
	System.out.println("given string is not palindrome");
}
}
}




