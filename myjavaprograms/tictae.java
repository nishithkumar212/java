package myjavaprograms;
import java.util.Random;
import bridgeit.utility;
public class tictae 
{
	static int count=0;
	char a='x';
	char b='0';
	Random rd=new Random();
	char[][] arr=new char[3][3];
	public void display()
	{
      for(int i=0;i<=arr.length-1;i++)
      {
    	  for(int j=0;j<=arr.length-1;j++)
    	  {
    		  System.out.print(arr[i][j]= '-');

    		  }
    	  System.out.println();
    	  }
      }
	public void display1()
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr.length-1;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	public void  computer()
	{
		int crow=rd.nextInt(3);
		int ccol =rd.nextInt(3);
		if(arr[crow][ccol]=='-')
		{
	arr[crow][ccol]=a;
	return;
		}
		else
		{
			computer();
		}
		count++;
	}
	public void user()
	{
		System.out.println("enter the number of rows from 0-2");
int urow=utility.getint();
System.out.println("enter the number of columns from o-2");
int ucol=utility.getint();
		if(arr[urow][ucol]=='-')
		{
			arr[urow][ucol]= b;
		}
		else
		{
	user();	
		}
		count++;
	}
	public void cwin()
	{
if((arr[0][0]=='x'&&arr[0][1]=='x'&&arr[0][2]=='x')||(arr[1][0]=='x'&&arr[1][1]=='x'&&arr[1][2]=='x')||(arr[2][0]=='x'&&arr[2][1]=='x'&&arr[2][2]=='x')||(arr[0][0]=='x'&&arr[1][0]=='x'&&arr[2][0]=='x')||(arr[0][0]=='x'&&arr[1][0]=='x'&&arr[2][0]=='x')||(arr[0][1]=='x'&&arr[1][1]=='x'&&arr[2][1]=='x')||(arr[0][2]=='x'&&arr[1][2]=='x'&&arr[2][2]=='x')||(arr[0][0]=='x'&&arr[1][1]=='x'&&arr[2][2]=='x')||(arr[0][2]=='x'&&arr[1][1]=='x'&&arr[2][0]=='x'))
{
System.out.println("computer wins");
System.exit(0);
}
	}
public void uwin()
{
if((arr[0][0]=='0'&&arr[0][1]=='0'&&arr[0][2]=='0')||(arr[1][0]=='0'&&arr[1][1]=='0'&&arr[1][2]=='0')||(arr[2][0]=='0'&&arr[2][1]=='0'&&arr[2][2]=='0')||(arr[0][0]=='0'&&arr[1][0]=='0'&&arr[2][0]=='0')||(arr[0][0]=='0'&&arr[1][0]=='0'&&arr[2][0]=='0')||(arr[0][1]=='0'&&arr[1][1]=='0'&&arr[2][1]=='0')||(arr[0][2]=='0'&&arr[1][2]=='0'&&arr[2][2]=='0')||(arr[0][0]=='0'&&arr[1][1]=='0'&&arr[2][2]=='0')||(arr[0][2]=='0'&&arr[1][1]=='0'&&arr[2][0]=='0'))
{
	System.out.println("user wins");
	System.exit(0);
}
}
	public static void main(String[] args)
	{
tictae obj=new tictae();
obj.display();
while(count<9)
{
System.out.println("its computer turn");
obj.computer();
obj.display1();
obj.cwin();
System.out.println("its time for user");
obj.user();
obj.uwin();
	}
System.out.println("the game is draw");
System.exit(0);
}
}



