package collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTebleTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new Hashtable<String, Integer>();
		
		map.put("one", new Integer(1));
		map.put("two", 2);		//outo boxing
		map.put("three", 3);
		
		
		Integer i = map.get("two");
		System.out.println(i);
		
		map.remove("two");
		System.out.println(map.get("two"));
		
		// 중복테스트 , 키가 중복되면 value로 바꾼다.
		map.put("one", 10);
		System.out.println(map.get("one"));

	}

}
