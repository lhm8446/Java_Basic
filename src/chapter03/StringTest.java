package chapter03;

public class StringTest {

	public static void main(String[] args) {
		// String s = "c:\temp";		>> c:	emp
		String s = "c:\\temp";                   //    \\ = 역슬래쉬를 출력하기 위한 이스케이프
		
		//String s1=""hello"";	
		String s1="\"hello\"";					 // 	\" \"  = " 출력하기 위한 이스케이프
		
		// \t = tab
		// \n = new line
		// \r = carriage return
		
		System.out.println(s);
		System.out.println(s1);
		System.out.print("hello\tworld \n");   //유닉스에서 \r (라인맨앞으로 ) 같이써줘야
		System.out.print("============");
	}
}
