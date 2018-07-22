package programs.com;

import java.util.Scanner;

public class Fibonacci {

	static int a=0,b=1,c,i,size;
	static Scanner sc;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sc=new Scanner(System.in);
		System.out.println("Enter the size: ");
		size=sc.nextInt();
		System.out.print(a+" "+b);
		for(i=1;i<=size-2;i++)
		{
			c= a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
		}

	}

}
