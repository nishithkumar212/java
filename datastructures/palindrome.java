package datastructures;
import java.util.List;
import bridgeit.utility;
import datastructures.linkedlist.Node;
public class palindrome
{
	String  str="";
	String  str1="";
listnode head;
static listnode  tail;
int length;
class listnode
{
	listnode previous;
	int data;
 listnode  next;
	listnode(int data)
	{
		this.data=data;
	}
}
public boolean  isempty()
{
	return length==0;
}
public void addfirst(char data)
{
	listnode new_node=new listnode(data);
	 if(isempty())
	 {
		 tail=new_node;
	 }
	 else
	 {
		 head.previous=new_node;
	 }
	 new_node.next=head;
	 head=new_node;
}
public void addlast(char data)
{
	listnode new_node=new listnode(data);
	if(isempty())
	{
		head=new_node;
	}
	else
	{
		tail.next=new_node;
		new_node.previous=tail;
	}
	tail=new_node;
}
public void displayforward()
{
	
	listnode temp=head;
	while(temp!=null)
	{
		System.out.println(temp.data+" ");
		temp=temp.next;
	}
}
public String tostring1()
{
	listnode temp=head;
	String op1="";
	while(temp!=null)
	{
		op1+=(char)temp.data;
		temp=temp.next;
	}
	return op1;
}
public void displaybackward()
{
	
   listnode temp=tail;
   while(temp!=null)
   {
	   System.out.print(temp.data);
	   temp=temp.previous;
   }
}
public static String tostring() {
	listnode temp = tail;
	String op ="";
	while(temp!=null) {
		op+=(char)temp.data;
		temp = temp.previous;
	}
	return op;
}
public static void main(String[] args)
{
	palindrome obj=new palindrome();
	System.out.println("enter string");
	String input = utility.getstring();
	for(int i=0;i<=input.length()-1;i++) {
		char exp = input.charAt(i);
		obj.addlast(exp);
		String backward=obj.tostring();
	System.out.print(backward);
	String forward=obj.tostring1();
	System.out.print(forward);
	
	}
}
}












