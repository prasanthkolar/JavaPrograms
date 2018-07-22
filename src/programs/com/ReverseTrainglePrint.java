package programs.com;

import java.util.Scanner;

public class ReverseTrainglePrint {

	static int i,j,k,input_size;
	static Scanner sc;
	
	public static void main(String[] args) {
		
		
		sc=new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		input_size=sc.nextInt();
		//no of rows
		for(i=input_size;i>=1;i--)
		{
			//no of spaces
			for(j=input_size;j>=i;j--)
			{
				System.out.print(" ");
			}
			
			for(k=1;k<=(2*i)-1;k++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
