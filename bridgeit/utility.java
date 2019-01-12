package bridgeit;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
public class utility 
	{
	static Scanner sc=new Scanner(System.in);
	public static int getint()
	{
		 return sc.nextInt();
	}
	public static String getstring()
	{
		 return sc.next();
	}
	public static  String getstringwords()
	{
		 return sc.nextLine();
	}
	public static  float getfloat()
	{
		 return sc.nextLong();
	}
	public static double getdouble()
	{
		return sc.nextDouble();
	}
	public static long start()
	{
		return System.currentTimeMillis();
	}
	public  static long stop()
	{
		return System.currentTimeMillis();
	}
	public static boolean getboolean()
	{
		boolean a=sc.nextBoolean();
		return a;
	}
public static int  binarysearch(int[] arr,int key)
{
	int start=0;
	int end=arr.length-1;
	int mid=start+(end-start)/2;
	while(start<=end)
	{
	if(key==arr[mid])
	{
  return mid;
	}
	else if(key<arr[mid])
	{
		end=mid--;
	}
	else if(key>arr[mid])
	{
		start=mid++;
	}
}
	return -1;
}
public  static int binaryserchstring(String[] arr,String x)
{
	 int l = 0, r = arr.length - 1; 
	    while (l <= r) { 
	        int m = l + (r - l) / 2; 
	        int res = x.compareTo(arr[m]); 
	        if (res == 0) 
	        {
	            return m;
	        }
	        if (res > 0) 
	        {
	            l = m + 1;
	        }
	        else
	        {
	            r = m - 1; 
	    }
	    }
		return -1;
	} 
public static void bubblesortinteger(int[] arr)
{
	int n=arr.length;
	for(int i=0;i<n-1;i++)
	{
		for(int j=0;j<n-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
			int temp=arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp;
		}
		}
}
	for(int k=0;k<=arr.length-1;k++)
	{
		System.out.print(arr[k]+" ");
	}
}
	public  static void bubblesortstring(String[] srr)
	{
		int len=srr.length;
		for(int i=0;i<len-1;i++)
		{
			for(int j=0;j<len-1;j++)
			{
		        int res=srr[j].compareTo(srr[j+1]);
		        if(res>0)
		        {
		        	String temp=srr[j];
		        	srr[j]=srr[j+1];
		        	srr[j+1]=temp;
		        }
			}
		}
		for(int k=0;k<=srr.length-1;k++)
		{
			System.out.print(srr[k]+" ");
		}
		}
	public static void insertionsortinteger(int[] arr)
	{
		int len=arr.length;
		for(int i=1;i<len;i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>key)
			{
			 arr[j+1]=arr[j];
			 j=j-1;
			}
			arr[j+1]=key;
		}
		for(int k=0;k<=arr.length-1;k++)
		{
			System.out.print(arr[k]+"  ");
			System.out.println();
		}
	}
	public static void insertionsortString(String[] arr)
	{
		int n=arr.length;
		System.out.println(Arrays.toString(arr));
		System.out.println("elements");
		for(int i=1;i<arr.length;i++) {
			String key = arr[i];
			int j = i-1;
			while(j>=0) {
				if(key.compareTo(arr[j])>0) {
					break;
				}
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] =key;
			System.out.println(Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
	}
	public static  void readstring(String path,String divide) {
		String line = null;
		String[] words = null;
		try {
		InputStream is =new FileInputStream(path);
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		while((line = br.readLine())!=null) 
		{
			words = line.split(divide);
		}
	 for(int i=0;i<=words.length-1;i++)
	 {
		 System.out.print(words[i]+"  ");
	 }
	 System.out.println();
		System.out.println("enter the string");
		String k=utility.getstring();
		int result=utility.binaryserchstring(words, k);
		if (result == -1) 
		{
			System.out.println("Element not present"); 
		}
		else
		{
		    System.out.println("Element found at "
		                      + "index " + result);
			}
		}
		catch(Exception e)
		{			
		}
	}
	public static void readlist(String path,String divide) throws IOException
	{
		ArrayList<String> al=new ArrayList<>();
		String line;
		String[] words = null;
		FileInputStream fis=new FileInputStream(path);
		InputStreamReader is=new InputStreamReader(fis);
		BufferedReader br=new BufferedReader(is);
	   while((line=br.readLine())!=null)
	   {
		   words=line.split(divide);
	   }
		for(int i=0;i<words.length-1;i++)
		{
			al.add(words[i]);
		}
		String sr1[]= al.toArray(new String[al.size()]);
	int[] brr=new int[sr1.length-1];
	for(int i=0;i<brr.length-1;i++)
	{
		brr[i] = Integer.parseInt(sr1[i]);
	}
	utility.bubblesortinteger(brr);
	}
	public  static int  datecalculate(int m,int d,int y)
	{
		int y0;
		int x;
		int m0;
		int d0;
		y0 = y - (14 - m) / 12;
				x = y0 + (y0/4 )-( y0/100 )+ y0/400;
				m0 = m + 12 * ((14 - m) / 12) -2;
				d0 = (d + x + 31*m0/ 12)%7;
switch(d0)
{
case 0:System.out.println(" the day falls on:sunday");
break;
case 1:System.out.println("the day falls on:monday");
break;
case 2:System.out.println("the day falls on:tuesday");
break;
case 3:System.out.println("the day falls on:wednesday");
break;
case 4:System.out.println("the day falls on:thursday");
break;
case 5:System.out.println("the day falls on:friday");
break;
case 6:System.out.println("the day falls on:saturday");
break;
}
return d0;
}
public static void   temperatureconvert(double  temp)
{
	if(temp>=90.00)
	{
		double f=temp;
		double c=(f - 32) * 5/9;
	System.out.println("the converted fahrenheit to celcius is:"+c);
	}
	else
	{
		double c=temp;
	double  f=(c * 9/5)+ 32;
System.out.println("the converted celcius to fahrenheit is:"+f);
	}
}
static int i;
static int total;
public  static int  vendingcalculate(int money,int[] notes)
{
	int calnotes;
	int r;
	if(money==0)
	{
		return -1;
	}
	else
	{
		if(money>=notes[i])
		{
	 calnotes=money/notes[i];	
	r=money%notes[i];
	money=r;
	total=total+calnotes;
	System.out.println(notes[i]+"notes are:"+calnotes);
	}
	i++;
	vendingcalculate(money,notes);
}
	return total;
}
public static double monthlypayment(double p,double y,double r)
{
	double n=12*y;
	r=r/(12*100);
	double num=p*r;
double  power=(1-Math.pow(1+r, -n));
	double payment=num/power;
	return payment;
	}
public static void insertionstring(String path,String divide) throws IOException
{
	String line;
	String[] words = null;
FileInputStream fis=new FileInputStream(path);
InputStreamReader is=new InputStreamReader(fis);
BufferedReader br=new BufferedReader(is);
while((line=br.readLine())!=null)
{
	words=line.split(divide);
}
System.out.println(words);
utility.insertionsortString(words);
}
public static void squareroot(double c)
{
	double t=c;
	 double epsilon = 1e-15;
		while(Math.abs(t -c/t)>epsilon*t)
		{
			t=(c/t+t)/2;
		}
	System.out.println(t);
}
public static int findNumber(int arr[],int start,int end) 
{
while(start<=end)
{
	int mid=(start+end)/2;
	System.out.println("you number is "+arr[mid]+" if yes enter true,else false");
	Boolean  a=utility.getboolean();
	if(a==true)
	{
return mid;
	}
	System.out.println("your number is greater than "+arr[mid]+"if yes enter true,else false");
	boolean b=utility.getboolean();
	if(b==true)
	{
		start=mid++;
	}
	else
	{
		end=mid--;
	}
}
return -1;
}
public static int[][] printcalender(int month,int yr) {
	int d = datecalculate(1, month, yr);
	System.out.println(d);
	 int[][] calender = new int[6][7];
	 int length = calender[5].length;
	 System.out.println(length);
	 int months[] = {31,28,30,31,30,31,30,31,30,31,30,31};
	 String[] monthname = {"","January", "February", "March","April", "May", "June","July", "August", "September","October", "November", "December"	          };
		for(int i=0;i<calender.length;i++) {
			for(int j=0;j<calender[i].length;j++) {
				calender[i][j] = -1;
			}
}
		int dateinc=1;
		for(int i=d;i<calender[0].length;i++) {
			calender[0][i]=dateinc++;
		}
		for(int j=1;j<calender.length;j++) {
			for(int k=0;k<calender[j].length;k++) {
				calender[j][k] = dateinc++;
			}
		}
		System.out.println("\t\t\t"+monthname[month]+"  "+yr);
		System.out.println();
		System.out.println( "        S       M       Tu       W      Th      F      Sa  ");
		for(int i=0;i<calender.length;i++) {
			for(int j=0;j<calender[i].length;j++) {
				if(calender[i][j]<0||(calender[i][j]>months[month-1])) {
					System.out.print("\t");
				}else if(calender[i][j]>0) {
					System.out.print("\t"+calender[i][j]+" ");
				}
			}
			System.out.println("\t");
		}
return calender;
}
	}

