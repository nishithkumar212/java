package myjavaprograms;
import bridgeit.utility;
public class calendar 
{
public static void main(String[] args)
{
	System.out.println("enter the date format as month ,day year");
	String s1="january=1";
	String s2="february=2";
	String s3="march=3";
	String s4="april=4";
	String s5="may=5";
	String s6="june=6";
	String s7="july=7";
	String s8="august=8";
	String s9="september=9";
	String s10="october=10";
	String s11="november=11";
	String s12="december=12";
	for(int i=1;i<=1;i++)
	{
		System.out.println(s1+" "+s2+" "+s3+" "+s4+" "+s5+" "+s6+" "+s7+" "+s8+" "+s9+" "+s10+" "+s11+" "+s12);
	}
	System.out.println("enter the monthno as from 1 -12");
	int month=utility.getint();
	if(month==1||month==2||month==3||month==4||month==5||month==6||month==7||month==8||month==9||month==10||month==11||month==12)
	{
	}
	else
	{
		System.out.println("please enter a valid month which as given reference from the above index");
	}
	if(month==1||month==2||month==3||month==4||month==5||month==6||month==7||month==8||month==9||month==10||month==11||month==12)
	{
	System.out.println("enter the day from 1-31");
	int day=utility.getint();
	System.out.println("enter the year");
int year=utility.getint();
utility.datecalculate(month, day, year);
	}
	else
	{
		System.out.println("invalid data");
	}
}
}