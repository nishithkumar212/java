package datastructures;
import bridgeit.utility;
public class cashcounter
{
	Node front;
	Node rear;
	int length;
	int amount=0;
	public void queue()
	{
		this.front =null;
		this.rear=null;
	}
class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		this.next=next;
	}
}
public int length()
{
	return length;
}
public boolean isempty()
{
	return length==0;
}
public void enque(int data)
{
Node temp=new Node(data);
	if(isempty())
	{
		
		front=temp;	
		amount=amount+front.data;
	}
	else
	{
      rear.next=temp;
      amount=amount+front.data;
	}
	rear=temp;
	length++;
}
public int deque()
{
try {
	if(isempty())
	{
        		
	}
}
catch(Exception e)
{
	System.out.println("insufficient balance");
}
	int result=front.data;
	front=front.next;
	if(front==null)
	{
		rear=null;
	}
	amount=amount-result;
	length--;
	return amount;
}	
public void print()
{
	System.out.println("your balance is"+amount);
}
public  void deposit()
{
	System.out.println("enter the amount");
	int amount=utility.getint();
	enque(amount);
	print();
	System.out.println("enter 1. deposit  2. withdrawal 3. display balance");
	int choice1= utility.getint();
	choice(choice1);
}
public void withdrawal() 
{
	System.out.println("enter the amount");
	int amount=utility.getint();
	deque();
	print();
	System.out.println("enter 1. deposit  2. withdrawal 3. display balance");
	int choice1= utility.getint();
	choice(choice1);
}
public void choice(int a)
{
	switch(a)
	{
	case 1:
			deposit();
		    break;
	case 2:
			withdrawal();
		   break;
	case 3:print();
}
}
	

	public static void main(String[] args)
	{		
cashcounter obj=new cashcounter();
System.out.println("1 .deposit");
System.out.println("2.withdraw");
System.out.println("3.balance");
int choice = utility.getint();
obj.choice(choice);

}
	}



