package programs.com;

public class LargestNumber {

	static int arr[]= {45,21,1,48,78,12,45,865,1486,1,2};
	static int val;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		val=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>val)
			{
				val=arr[i];
			}
		}
		System.out.println("greatest number "+val);
	}

}
