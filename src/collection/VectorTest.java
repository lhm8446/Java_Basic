package collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>();

		vector.addElement("둘리");
		vector.addElement("희동");
		vector.addElement("도우넛");
		
		
		//순회 1
		int count = vector.size();
		for(int i = 0; i < count; i++){
			String s = vector.elementAt(i);
			System.out.println(s);
		}
		System.out.println("===========================");
		
		vector.remove(1);
		
		//순회2
		Enumeration<String> enumeration = vector.elements();
		while(enumeration.hasMoreElements()){
			String s = enumeration.nextElement();
			System.out.println(s);
		}
		System.out.println("===========================");
		
		
		
	}
}
