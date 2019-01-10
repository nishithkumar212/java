package myjavaprograms;
import java.util.ArrayList;
import java.util.Random;

import bridgeit.utility;
public class couponnumbers 
{
public static void main(String[] args)
{
	Random rd=new Random();
	int distinct=0;
	ArrayList<Integer> al=new ArrayList<Integer>();
	System.out.println("enter the couponnumbers");
	int coup=utility.getint();
       for(int i=0;i<coup;i++)
       {
    	   int randomno=rd.nextInt(coup);
    	   if(!al.contains(randomno))
    	   {
    		   al.add(randomno);
    		   distinct++;
    	   }
       }
       Integer[] arr=al.toArray(new Integer[al.size()]);
       System.out.println("the genearated coupons are");
       for( Integer coupons:arr)
       {
    	   System.out.println(coupons);
       }
       System.out.println("the distinct coupons are"+distinct);
}
}
