package algorithms;
import bridgeit.utility;
public class swapoftwonumbers
{
public static void main(String[] args)
{
	int count=0;
int count1=0;
	String s1="";
	String s5="";
	String s6="";
	System.out.println("enter a number");
	int a=utility.getint();
	while(a>=1)
	{
		int rem=a%2;
		s1=s1+rem;
		a=a/2;
	}
	String s3=s1.substring(0, 4);
	String s4=s1.substring(4);
	for(int i=0;i<=s3.length()-1;i++)
	{
		count=count+1;
	}
	while(count<4)
	{
	     s3=s3+0;
	     count=count+1;
	}
	for(int i=0;i<=s4.length()-1;i++)
	{
		count1=count1+1;
	}
	while(count1<4)
	{
	     s4=s4+0;
	     count1=count1+1;
	}
	for(int i=s3.length()-1;i>=0;i--)
	{
		s5=s5+s3.charAt(i);
	}
	for(int i=s4.length()-1;i>=0;i--)
	{
		s6=s6+s4.charAt(i);
	}
	String temp=s5;
	s5=s6;
	s6=temp;
	String[] srr=s5.split("");
	int j=0;
	double  sum1=0.0;
	for(int i=srr.length-1;i>=0;i--)
	{
		double power=Math.pow(2, j);
	    int k= Integer.parseInt(srr[i]);
	    sum1=sum1+(power*k);
	j++;
	}
	String[] srk=s6.split("");
	int l=0;
	double sum2=0.0;
	for(int i=srk.length-1;i>=0;i--)
	{
		double power=Math.pow(2, j);
	    l= Integer.parseInt(srk[i]);
	    sum2=sum2+(power*l);
	l++;
	}
	double sum=sum1+sum2;
	System.out.println("the resultant decimal after swapping of two binary conversions is"+sum);
	if(sum==1||sum==2)
	{
		System.out.println("it is a power of 2");
	}
while(sum>=4)
{
	double  rem1=sum%2;
	if(rem1==0)
	{
	sum=sum/2;	
	}
	if(rem1==1)
	{
		System.out.println("it is not a power of 2");
		break;
	}
	else
	{
		System.out.println("its a power of 2");
	}
}
}
}
























