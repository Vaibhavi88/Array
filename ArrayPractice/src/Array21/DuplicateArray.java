package Array21;

public class DuplicateArray {
	public static void main (String[]args) {
		int[]a= {1,2,44,11,22,55,1,2,55};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[j]);
				}
			}
		}
	}
}