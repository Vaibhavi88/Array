package Array21;

public class arraylocalvarialble {
	int[]a= {11,22,33,45,56};  // with declaration
	public static void m1(int[]a) {
		for(int i = 0;i<a.length; i++)
System.out.println(a[i]);
		
	}
	public static void m2() {
		arraylocalvarialble ob = new arraylocalvarialble();
		m1(ob.a);
	}
public static void main(String[]args) {
	
	m2();	
}

}
