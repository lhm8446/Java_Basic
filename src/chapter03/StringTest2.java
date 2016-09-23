package chapter03;

public class StringTest2 {

	public static void main(String[] args) {
		String s1 ="abc";
		String s2 ="def";
		String s3 = s2;
		
		s2 = s1.toUpperCase();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("-----------------");
		
		s2 = s1.toUpperCase();
		String s4 = s2.concat("??");
		String s5 = "!".concat(s2).concat("@");              //  change ,   ! 객체생성 , s2의 ABC생성, @생성

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("--------------");
		System.out.println(s4);
		System.out.println(s5);
		
		// if(s.equals("Hello")           s가 null 값이면 익셉션
		// if("Hello".equals(s)			  Hello 객체가 생성되면서 익셉션 오류 절대 x , 빠져나가면서 객체 삭제 
	}
}
