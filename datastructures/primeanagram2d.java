package datastructures;
import java.util.ArrayList;
import java.util.List;
import algorithms.PrimeAnagramandPalindrome;
public class primeanagram2d
{
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<Integer>();
	for(int i=1;i<1000;i++)
	{
		int count=0;
		for(int j=i;j>=1;j--)
		{
		if(i%j==0)
		{
			count=count+1;
		}
		}
		if(count==2)
		{
			al.add(i);
		}
	}
	PrimeAnagramandPalindrome obj=new PrimeAnagramandPalindrome();
List<Integer> anagrams=new ArrayList<>();
List<Integer> notanagrams=new ArrayList<>();
notanagrams.addAll(al);
	anagrams=obj.isprimeAnagram(al);
	for(int i=0;i<anagrams.size();i++) {
		if(notanagrams.contains(anagrams)) {
			notanagrams.remove(i);
		}
		}
	Integer notarr[] = notanagrams.toArray(new Integer[notanagrams.size()]);
	Integer anagram[] = anagrams.toArray(new Integer[anagrams.size()]);
int m = 2;
int n = 158;
int ana[][] = new int[m][n];
System.out.println(ana.length);
for(int i=0;i<ana.length;i++) {
	for(int j=0;j<ana[i].length;j++) {
		ana[i][j] = -1;
}
	}
for(int i=0;i<ana[0].length;i++) {
	ana[0][i]= anagram[i];
	if(i==0) {
	}
}
for(int i=0;i<ana[0].length;i++) {
	if(i==0) {
	
	}
	ana[1][i] = notarr[i];
}
for(int i=0;i<m;i++) {
	for(int j=0;j<n;j++) {
		System.out.print(ana[i][j]+" ");
	}
	System.out.println();
}
}
}







