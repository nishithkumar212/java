package datastructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class linkinteger
{
	public static void main(String[] args) throws IOException
	{
		String line=null;
		String[] arr = null;
FileInputStream fis=new FileInputStream("link.txt");
InputStreamReader is=new InputStreamReader(fis);
BufferedReader br=new BufferedReader(is);
while((line = br.readLine())!=null) 
{
  arr=line.split("");
}
for(int i=0;i<=arr.length-1;i++)
{
	System.out.print(arr[i]);
}
System.out.println("enter the element from above reference");

}
}