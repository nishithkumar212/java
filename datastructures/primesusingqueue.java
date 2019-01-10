package datastructures;
import java.util.ArrayList;
import java.util.List;
public class primesusingqueue
{
public static void main(String[] args)
{
	queue obj=new queue();
primesusingstack object=new primesusingstack();
ArrayList<Integer> al=new ArrayList();
List<Integer> al1=new ArrayList<Integer>();
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
		al.add(i);	
	}
}
al1=object.isprimeAnagram(al);
System.out.println("the anagrams are:");
for(Integer anagram:al1) 
{
	obj.enque(anagram);
}
obj.print();
}
}
