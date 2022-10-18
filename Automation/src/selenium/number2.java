package selenium;

import java.util.Scanner;

public class number2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		//System.out.println("Enter digit wanted");
		//int k = sc.nextInt();
		/*
		while(n>99)
		{
			n =n/10;
		}
		System.out.println("2nd digit is:"+n%10);
		
		int d= 0;
		while(n>9)//45
		{
			d = n%10;//5
			n=n/10;//4
		}
		System.out.println(d);
		
		int temp =n;
		int count=0;
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		
		int y= count-1;
		int count1=0;
		int x=0;
		while(count1!=y)
		{
			x=temp%10;
			temp=temp/10;
			count1++;
		}
		System.out.println(x);
		
		int d=0; 
		int count=0;
		while(count!=k)
		{
		d= n%10;
		n=n/10;
		count++;
		}
		System.out.println(d);
		
		*/
		//2415 = 24+41+15
		//123 = 12+23
		int sum = 0;
		int p = n%10;//3
		n=n/10;//12
		while(n!=0)
		{
			int d= n%10;//2
			sum=sum+(d*10+p);//0+23
			n=n/10;//1
			p=d;//2
		}
		System.out.println(sum);
		
	
	}

}
