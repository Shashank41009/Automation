package selenium;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text");
		String input = sc.nextLine();
		
		String[] result = dicword(input);
		for(int i=0; i<result.length;i++)
		{
			if(result[i]!=null)
			System.out.print(result[i]+" ");
		}

	}

	private static String[] dicword(String s1) {
		
		String[] answer = new String[100];
		String[] s = s1.split(" ");
		
		for (int i = 0; i < s.length; i++) {
			
		}
		
		HashSet<String> h = new HashSet<String>();
		for(String i: s)
		{
			h.add(i);
		}
		int i=0;
		for(String e:h)
		{
			answer[i++]=e;
		}
			
		return answer;
		
	}

}
