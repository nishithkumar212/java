package algorithms;
public class primes
{
public static void main(String[] args) 
{
	String primes="";
	for(int i=1;i<=1000;i++)
	{
		int count=0;
		for(int num=i;num>=1;num--)
		{
			if(i%num==0)
			{
				count=count+1;
			}
		}
		if(count==2)
		{
		 primes=primes+i+" ,";
		 }
	}
	System.out.println("primenumbers are"+primes);
     }
}
