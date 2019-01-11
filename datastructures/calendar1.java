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
}
public  static void datecalculate(int m,int d,int y)
{
	int y0;
	int x;
	int m0;
	int d0;
	y0 = y - (14 - m) / 12;
			x = y0 + (y0/4 )-( y0/100 )+ y0/400;
			m0 = m + 12 * ((14 - m) / 12) -2;
			d0 = (d + x + 31*m0/ 12)%7;
}
}
