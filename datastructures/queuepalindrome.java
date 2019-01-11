package datastructures;
import datastructures.queue.Node;
public class queuepalindrome 
{
	Node front;
	Node rear;
	int length;
	queuepalindrome()
	{
		this.front =null;
		this.rear=null;
	}
class Node
{
	char data;
	Node next;
	Node(char data)
	{
		this.data=data;
		this.next=null;
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
public void enque(char data)
{
Node temp=new Node(data);
	if(isempty())
	{
		front=temp;	
	}
	else
	{
      rear.next=temp;		
	}
	rear=temp;
	length++;
}
public void print()
{
	try {
	if(isempty())
	{
	}
	}
	catch(Exception e)
	{
		System.out.println("queue is already empty");
	}
	Node current=front;
	while(current!=null)
	{
		System.out.println(current.data);
		current=current.next;
	}

}
public char deque()
{
	if(isempty())
	{
		
	}
	char result=front.data;
	front=front.next;
	if(front==null)
	{
		rear=null;
	}
	length--;
	return result;
	
}
} 
