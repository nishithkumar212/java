package datastructures;
import bridgeit.utility;
public class calendar1
{
public static void main(String[] args)
{
System.out.println("enter the month");
int month=utility.getint();
System.out.println("enter the year");
int year=utility.getint();
utility.printcalender(month, year);
}
}