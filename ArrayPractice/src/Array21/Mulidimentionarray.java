package Array21;

public class Mulidimentionarray {
	public static void main (String[]args) {
 int a[] = {11,22,33,44,55};
for(int i=0;i<a.length;i++) 
	System.out.println(a[i]);

System.out.println(" ");

int b[][]= {{11,22,33},{55,66,77},{99,11,45}};
for(int i=0;i<3;i++) { // 0,1,2
	for(int j = 0;j<3;j++) {
		System.out.print(b[i][j]+" ");
	}
	System.out.println();
}

}
}