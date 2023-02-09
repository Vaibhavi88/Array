package Array21;

import java.util.Arrays;

public class Comparearray {
	public static void main (String[]args) {
		int[]a= {1,2,3,4}; //literal
		int[]b= {1,2,5,4};
		int[]c= {1,2,3,4};
		System.out.println(Arrays.equals(a,b));
		System.out.println(Arrays.equals(a,c));
	}

}
