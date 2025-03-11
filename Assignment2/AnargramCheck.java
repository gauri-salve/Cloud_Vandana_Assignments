package Assingment;

import java.util.Arrays;
import java.util.Scanner;

public class AnargramCheck {
	
static boolean areAnagram(char[] s1,char[] s2)
  {
	int n1 =  s1.length;
    int n2 =  s2.length;
    if(n1!=n2)
    	
    {
       return false;
        
    }
	
	Arrays.sort(s1);
	Arrays.sort(s2);
	
	for(int i=0;i<n1;i++)
	{
		if(s1[i]!=s2[i])
			
		{
			return false;
			
			
		}
	}
	
   return true;
   }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first  String");
		String s1=sc.nextLine();
		System.out.println("Enter Second String");
		String s2=sc.nextLine();
		
		System.out.println(areAnagram(s1.toCharArray(),s2.toCharArray()));
	}       
}