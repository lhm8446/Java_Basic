package chapter03;

public class StringTest4 {

	public static void main(String[] args) {
		String s = "aBcAbCabcABC";
		
		System.out.println(s.length());
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf("a"));
		System.out.println(s.replace('a', 'R'));
		System.out.println(s.replaceAll("abc", "123"));
		System.out.println(s.substring(3)); 	// 인덱스 3부터 끝까지 출력
		System.out.println(s.substring(3, 6));  // 출력 인덱스 다음까지 기재
		
		String a = "abcd";
		String b = ",efg";
		String c = a.concat(b);
		
		System.out.println(c);
		
		String d = "      abc   ";
		System.out.println(d.trim());   			//양쪽 옆에 공백만 제거
		System.out.println(d.replaceAll(" ", ""));  // 모든 공백 제거
		
		String e = "fff,fff,fff";
		
		String[] t = e.split(",");
		for(String value : t){
			System.out.println(value);
		}
		
		// + 연산자
		
		String[] arr = {"Hello", "world", "java"};
		
//		StringBuffer sb = new StringBuffer("Hello");
//		sb.append("world");
//		sb.append("java");
		
		String str2 = new StringBuffer("Hello").append("World").append("java").toString();  // toString 없으면 스트링 버퍼만 리턴, 
		
		System.out.println(str2);   // StringBuffer = 스트링 배열에 새로운 배열 하나를 붙여줌(자기 버퍼를 늘려줌), append로 추가 
		
	}
}
