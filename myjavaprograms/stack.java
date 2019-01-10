package myjavaprograms;
public class stack 
{
	char[] stacks=new char[100];
	int top=-1;
	int len=stacks.length;
	 static char c;
public void push(char ele)
{
	if(isfull1())
	{
	System.out.println("stack is full");	
	}
	else
	{
		top++;
		stacks[top]=ele;
	}
}
	public boolean isfull1()
	{
		if(top==stacks.length-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void  pop()
	{
		if(isempty())
		{
			System.out.println("stack underflow");
		}
		else
		{
		int  c=stacks[top--];    
		}
	}
public boolean isempty()
{

	if(top==-1)
	{
		return true;
	}
	return false;
}
	}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
















