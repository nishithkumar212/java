package oops;
import java.util.Date;
import bridgeit.utility;
public class regularexpression
{
	public static void main(String[] args)
	{	
String str="Hello <<name>>, We have your full name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx. Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016. Use Regex to replace name, full name, Mobile#, and Date with proper value.\n";
String[] patterns= {"<{2}\\w+>{2}","<{2}\\w+\\s\\w+>{2}","x{10}","\\d+[/]\\d+[/]\\d+"};
System.out.println("enter your name");
String name=utility.getstring();
System.out.println("enter full name");
String fname=utility.getstring();
System.out.println("enter your contact number");
String contactno=utility.getstring();
System.out.println("enter the date");
String date=utility.getstring();
String name1=str.replaceAll(patterns[0], name);
String fname1=name1.replaceAll(patterns[1], fname);
String contact1=fname1.replaceAll(patterns[2],contactno);
String date1=contact1.replaceAll(patterns[3], date);
System.out.println(date1);
	}
}