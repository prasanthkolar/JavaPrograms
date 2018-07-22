package programs.com;

import java.util.Scanner;

public class PrintingNumbers {

	static int i,j,size,num=1;
	static Scanner sc;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sc=new Scanner(System.in);
		System.out.println("Enter the size: ");
		size=sc.nextInt();
				
		for(i=1;i<=size;i++)
		{
			num=1;
			for(j=1;j<=i;j++)
			{
				System.out.print(num+" ");
				num++;
			}
		
			System.out.println();
		}
		

	}

}


