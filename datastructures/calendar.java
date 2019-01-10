package datastructures;
import bridgeit.utility;
public class calendar 
{
	public static boolean  isleapyear(int year)
	{
		if(year%4==0 && year%100!=0)
		{
			return true;
		}
		else if(year%400==0)
		{
			return true;
		}
		return false;
	}
	
	public static int day(int month, int day, int year) {
        int y = year - (14 - month) / 12;
        int x = y + y/4 - y/100 + y/400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int d = (day + x + (31*m)/12) % 7;
        return d;
    }
	public static void main(String[] args)
	{
	String[] week= {"sun","mon","tue","wed","thu","fri","sat"};
	String[] month= {"jan","feb","mar","april","may","june","july","aug","sep","oct","nov","dec"};
	int[] days= {31,28,31,30,31,20,31,31,30,31,30,31};
	System.out.println("enter the month");
	int mon=utility.getint();
	System.out.println("enter the year");
	int year=utility.getint();
 if(mon==2&&isleapyear(year))
 {
	 days[mon]=29;
 }
int day=day(mon,1,year);
System.out.println(day);
System.out.println("     "+month[mon]+" "+year);
System.out.println("S M Tu W Th Fri Sat ");
 // print the calendar
for (int i = 0; i < day; i++)
    System.out.print("   ");
for (int i = 1; i <= days[mon]; i++) {
	System.out.printf("%2d ", i);
	if (((i + day) % 7 == 0) || (i == days[mon])) {
		 System.out.println();
	 }
}
	  String calender[][] = new String[6][7];
      for(int i=0;i<week.length;i++) {
      	for(int j=1;j<=days[mon];j++) {
      		calender[i][j] = j+"";
      		if (((j + day) % 7 == 0) || (j == days[mon])) {
         		 System.out.println();
         	 }
      	}
	 
}























}
}
