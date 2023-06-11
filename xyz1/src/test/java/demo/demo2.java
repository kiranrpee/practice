package demo;

import java.util.Scanner;

public class demo2
{
//	// Accept 10 strings from command line.
//	find out the length of each string and
//	generate 2 random values between 0 and length of the string-1 Swap the characters at the generated 2 numbers in each string.
//	Remove all Vowels from each string and print the new string in reverse order
	
	static String[] a=new String[10];
	public static void main(String[] args) 
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 10 Strings");
		for(int i=0;i<10;i++)
		{
			
			  a[i]=sc.nextLine();
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i].length());
			String s = a[i];
			char[] s1 = s.toCharArray();
			char temp=s1[0];
			s1[0]=s1[s1.length-1];
		s1[s1.length-1]=temp;
			for(int j=0;j<s1.length;j++)
			{
				 char ch = s1[j];
				 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				 {
					 s1[j]=0;
				 }
				
			}
			
		
			for(int k=0;k<s1.length;k++)
			{
				System.out.print(s1[k]);
			}
			
			System.out.println(" ");
			
		}
		
		
		
	}
	
}
