package datastructures;
import myjavaprograms.stack;
public class balencedparenthesis
{
	public static void main(String[] args) 
	{	
		int count=0;
		stack sk=new stack();
String s="(5+6))";
for(int i=0;i<=s.length()-1;i++)
{
	char a=s.charAt(i);
	if(a=='(')
	{
		sk.push(a);
		count++;
	}
	else if(a==')')
	{
		sk.pop();
		count--;
	}
}
if(count==0)
{
	System.out.println("true");
}
else
{
	System.out.println("false");
}
}
}