package algorithms;
import bridgeit.utility;
public class binaryrepresentation 
{
public static void main(String[] args)
{
	int j=0;
	double sum=0.0;
	System.out.println("enter a number");
	int b=utility.getint();
	String result="";
	String result1="";
   while(b>=1)
   {
	int remainder=b%2;
	result=result+remainder;
	b=b/2;
   }
   for(int i=result.length()-1;i>=0;i--)
   {
	   char a=result.charAt(i);
	   result1=result1+a;
   }
   System.out.println(result1);
String[] s= result1.split("");
for(int i=s.length-1;i>=0;i--)
{
	double power=Math.pow(2, j);
    int k= Integer.parseInt(s[i]);
    sum=sum+(power*k);
j++;
}
System.out.println(sum);
}
}