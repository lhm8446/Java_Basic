package chapter03;

public class ObjectTest3 {

	public static void main(String[] args) {	// equals
		Point p1 = new Point(10,20);
		Point p2 = new Point(10,20);
		Point p3 = p2;
		
		// ==    -> 두 객체의 동일성 
		System.out.println(p1==p2);
		System.out.println(p2==p3);
		System.out.println("--------------------------------------");

		// equals() -> 두객체의 동등성 (*내용*비교)
		System.out.println(p1.equals("hello"));
		System.out.println(p1.equals(p3));
		System.out.println(p2.equals(p3));
		System.out.println("--------------------------------------");

		String s1 = new String("ABC");
		String s2 = new String("ABC");
		
		System.out.println(s1 == s2);       
		System.out.println(s1.equals(s2));
		System.out.println("--------------------------------------");

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());   // 내용으로 객체의 해쉬코드 생성(해쉬코드 오버라이드 된상태)
		System.out.println("--------------------------------------");

		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2)); // 주소기반의 해쉬코드 생성
		System.out.println("--------------------------------------");

		String s3 = "ABC";
		String s4 = "ABC";

		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
	}
}
