package chapter03;

public class ObjectTest {

	public static void main(String[] args) {
		Point p = new Point();

		System.out.println(p.getClass().getName());
		
		System.out.println(p.hashCode());
		
		System.out.println(System.identityHashCode(p));
		
		System.out.println(p.toString());
		
		System.out.println(p); 
		
	}

}
