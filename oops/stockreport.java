 package oops;
import bridgeit.utility;
public class stockreport
 	{
public static void main(String[] args) {
	System.out.println("enter the number of stocks");	
		int number=utility.getint();
		int[] array=new int[number];
		String[]array1=new String[number];
		int k=0;
		for(int i=1;i<=number;i++) {
			System.out.println("enter the share name");
			array1[k] =utility.getstring();
			System.out.println("enter the number of shares");
			int shares=utility.getint();
			System.out.println("enter the share price");
			int price=utility.getint();
			int  total=shares*price;
			array[k]=shares*price;
			k++;
		}
		for(int i=0;i<number;i++){
			System.out.println("The " + array1[i] + " total value of stock is "
					+ array[i]);
}
stockportfolia.stockReport(array);
}
}

