package programs.com;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] students= {"ram","rasanth","vamsi"};
		
		ArrayList<String> arraylst=new ArrayList<>(Arrays.asList(students));
		arraylst.add("rajaa");
		System.out.println(arraylst);
		arraylst.remove(1);
		System.out.println(arraylst);
	}

}
