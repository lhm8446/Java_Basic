package chapter03;

public class WrapperClassTest2 {

	public static void main(String[] args) {
		int i = Integer.parseInt("12345");
		Integer i2 = Integer.parseInt("12345");
		String s2 = String.valueOf(i2);
		
		double d = Double.parseDouble("3.14");
		int num = Character.getNumericValue('A');
		
		System.out.println(i);
		System.out.println(i2);
		System.out.println(num);
		
		
		int i3 = Integer.parseInt("f",16);   //  f 를 16진수로
		System.out.println(i3);
		
		String s= Integer.toBinaryString(15);
		System.out.println(s);
		
		int countBit = Integer.bitCount(15);
		System.out.println(countBit);
		
		String hexStr = Integer.toHexString(255);
		System.out.println(hexStr);
		
	}

}
