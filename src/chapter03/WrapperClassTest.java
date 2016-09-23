package chapter03;

public class WrapperClassTest {

	public static void main(String[] args) {
		Integer a = new Integer(10);
		Character c = new Character('c');
		Boolean b = new Boolean (true);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		Integer a2 =new Integer(10);
		System.out.println(a2);

		
		//auto boxing 
		
		Integer i = 20;
		
		//auto unboxing
		
	//  int i2 = i.intValue();
		int i2 = i;
		
		System.out.println(i2);
	}
}
