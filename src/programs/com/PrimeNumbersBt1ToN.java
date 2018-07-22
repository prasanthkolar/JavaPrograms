package programs.com;

import java.util.Scanner;

public class PrimeNumbersBt1ToN {

	static int i,j,n;
	static Scanner s;
	static int counter=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		s=new Scanner(System.in);
		System.out.println(" Enter the number");
		n=s.nextInt();
		
		for(i=2;i<=n;i++)
		{
			counter=0;
			for(j=1;j<=n;j++)
			{
				if(i%j==0)
				{
					counter++;
				}
			}
			
			if(counter==2)
			{
				System.out.print(i+" ");
			}
			
			
		}	
		
	}

}
