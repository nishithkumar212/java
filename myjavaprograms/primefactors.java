package myjavaprograms;
import bridgeit.utility;
public class primefactors 
{
	public void primenumber(int n)
	{
		while(n%2==0)
		{
			System.out.print(2+" ,");
			n=n/2;
		}
		for(int i=3;i<=i*i;i+=2)
		{
			while(n%i==0)
			{
				System.out.print(i+",");
				n=n/i;
			}	
		}
	}
	public static void main(String[] args)
	{
             primefactors obj=new primefactors();
             System.out.println("enter a number");
             int a=utility.getint();
             obj.primenumber(a);
	}
}
