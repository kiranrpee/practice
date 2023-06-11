package demo;

import java.util.ArrayList;
import java.util.TreeSet;

public class demo1 
{
	static ArrayList<String> l=new ArrayList<>();
static int i =0;
	public static void main(String[] args) 
	{
		l.add("Kiran");
		l.add("banglore");
		l.add("belgaum");
		l.add("kiran");
		
		System.out.println(l);
		
		get(i);	
	}
	
	public static void get(int i)
	{
	TreeSet<String> t=new TreeSet<>();
//		
//		if(i<l.size()-1)
//		{
//			String x = l.get(i);
//			t.add(x);
//			i++;
//			get(i);
//		
//		}
		
		System.out.println(t);
	}
	
}
