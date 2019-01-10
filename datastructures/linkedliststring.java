package datastructures;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import bridgeit.utility;
public class linkedliststring
{
	Node head;
class Node
{
  String data;
  Node next;
 Node(String data)
 {
	 this.data=data;
	this.next=null;
 }
}
public void add(String s)
{
	Node new_node=new Node(s);;
	if(head==null)
	{
		head=new_node;
	}
	Node n=head;
	while(n.next!=null)
	{
		n=n.next;
	}
	n.next=new_node;
}
public void delete(String s)
{
	Node n=head;
	Node previous = null;
	while((n.data.equals(s)) && n.next!=null)
	{
		head=n.next;
		return;
	}
	while(!(n.data.equals(s)) && n.next!=null)
	{
		previous=n;
		n=n.next;
	}
	previous.next=n.next;
}
public void addfirst(String s)
{
	Node new_node=new Node(s);
new_node.next=head;
head=new_node;
}
public boolean search(String s)
{
	Node n=head;
	
	while(!(n.equals(null)))
	{
		if(n.data.equals(s))
		{
			return true;
		}
		n=n.next;
	}
	return false;
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
	String line;
	String[] sr = null;
	linkedliststring obj=new linkedliststring();
	obj.addfirst("z");
	obj.add("a");
	obj.add("b");
	obj.add("c");
	obj.add("j");
	obj.add("k");
	obj.add("l");
	obj.add("n");
	obj.add("p");
	obj.add("o");
	/*FileInputStream fis=new FileInputStream("strings.txt");
	InputStreamReader is=new InputStreamReader(fis);
	BufferedReader br=new BufferedReader(is);
	while((line = br.readLine())!=null) 
	{
		sr=line.split("");
	}
	for(int i=0;i<sr.length-1;i++)
	{
		System.out.print(sr[i]);
	}*/
	obj.show();
	System.out.println();
	System.out.println("enter the string from above reference");
          String a= utility.getstring();
          boolean b=obj.search(a);
          if(b==true)
          {
        	  obj.delete(a);
          }
          else
          {
        	  obj.add(a);
          }
obj.show();
}
}












