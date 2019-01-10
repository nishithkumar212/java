package datastructures;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import bridgeit.utility;
public class linkedlist
{
Node head;
class Node
{
int data;
Node next;
Node(int d)
{
	this.data=d;
	this.next=null;
}
}
public void add(int a)
{
	Node new_node=new Node(a);
	if(head==null)
	{
		head=new Node(a);
		return;
	}
	else
	{
		Node n=head;
		while(n.next!=null)
		{
			n=n.next;
		}
		n.next=new_node;
	}
}
public void deletefirstnode(int a)
{
	Node temp=head;
	head=head.next;
	temp.next=null;
}
public  void addfirst(int a)
{
Node n=new Node(a);
n.next=head;
head=n;
}
public void insertafter(int index,int a)
{
	Node new_node=new Node(a);
	Node n=head;
	if(index==0)
	{
		addfirst(a);
		return;
	}
	for(int i=0;i<index-1;i++)
	{
	  n=n.next;	
	}
  new_node.next=n.next;
        n.next=new_node;  
}
public int search(int a)
{
	if(head==null)
	{
		return 0;
	}
	Node n=head;
	while(n!=null)
	{
		if(n.data==a)
		{
			return  1;
		}
	 n=n.next;
	}
	return -1;
}
public void deletenode(int key)
{
	Node temp=head;
	Node previous=null;
	if(temp!=null && temp.data==key)
	{
		head=temp.next;
		return;
	}
	while(temp!=null&&temp.data!=key)
	{
		previous=temp;
		temp=temp.next;
	}
	if(temp==null)
	{
		return;
	}
	previous.next=temp.next;
}
public void show()
{
	Node n=head;
	while(n.next!=null)
	{
		System.out.println(n.data);
		n=n.next;
	}
	System.out.println(n.data);
}
public static void main(String[] args) throws IOException
{
/*String line=null;
	String[] arr = null;
FileInputStream fis=new FileInputStream("link.txt");
InputStreamReader is=new InputStreamReader(fis);
BufferedReader br=new BufferedReader(is);
while((line = br.readLine())!=null) 
{
arr=line.split("");
}
int arr1[] = new int[arr.length];
for(int i=0;i<=arr.length-1;i++)
{
arr1[i]=Integer.parseInt(arr[i]);
}
for(Integer sdaf:arr1) {
	System.out.println(sdaf);
}*/
System.out.println();
linkedlist obj=new linkedlist();
obj.add(13);
obj.add(67);
obj.add(6);
obj.add(23);
obj.add(7);
obj.add(90);
obj.deletefirstnode(13);
obj.show();
System.out.println();
obj.insertafter(3, 97);
obj.show();
System.out.println("enter the element from above reference");
int a=utility.getint();
int res=obj.search(a);
if(res==1)
{
	obj.deletenode(a);
}
else if(res==-1)
{
	obj.add(a);
}
else
{
	System.out.println("there are no elements in linkedlist");
}
System.out.println("after performing operation");
obj.show();
}
}
