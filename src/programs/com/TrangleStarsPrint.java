package programs.com;

import java.util.Scanner;

public class TrangleStarsPrint {
	
	static int input,i,j,k;
	static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  Scanner sc = new Scanner(System.in);
	        int size = 0;
	        //Character c;
	        System.out.println("Enter height of the triangle : ");
	        size = sc.nextInt();
	        int i, j, k;
	        for (i = 1; i <= size; i++) 
	        { 
	        	for (j = size; j >= i; j--) 
	        	{
	                System.out.print(" ");
	            }
	            for (k = 1; k <= (2 * i - 1); k++) 
	            {
	            	//System.out.println("i value "+i);
	      
	            	
	                System.out.print("*");
	            	
	            }
	            System.out.println();
	        }

	}

}
