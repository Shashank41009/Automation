package selenium;

import java.util.Scanner;

public class newrepeat {
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string");
	String words = sc.nextLine();
	String result= "";
	int l = words.length();
	
	for(int i=0;i<l;i++)
	{
		for(int j=1;i<l;j++)
		{
			char ch1=words.charAt(i);
			char ch2=words.charAt(j);
			
			if(ch1!=ch2)
			{
				result=result+ch1;
				break;
			}
		}
	}
	System.out.println("output "+result);
}

}
