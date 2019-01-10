package datastructures;
import java.util.List;
import datastructures.linkedlist.Node;
public class queue 
{
	Node front;
	Node rear;
	int length;
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
public void enque(int data)
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
	System.out.println("null");
}
public int deque()
{
	if(isempty())
	{
		
	}
	int result=front.data;
	front=front.next;
	if(front==null)
	{
		rear=null;
	}
	length--;
	return result;
	
}
public static void main(String[] args)
{
	queue obj=new queue();
	obj.enque(5);
	obj.enque(10);
	obj.enque(15);
	obj.enque(20);
	obj.print();
	obj.deque();
	obj.deque();
	obj.deque();
	
	System.out.println("the length of queue is"+obj.length());
}
}






