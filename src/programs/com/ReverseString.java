package programs.com;

public class ReverseString {

	static String str="Software testing";
	static  final int length=str.length();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int nextLength=str.length();
		
		//StringBuffer a=new StringBuffer(str);

		//System.out.println(a.reverse());
		
		for(int i=1;i<=length;i++)
		{
			//System.out.println(str.length());
			System.out.print(str.charAt(nextLength-1));
			nextLength--;
		}
	}

}
