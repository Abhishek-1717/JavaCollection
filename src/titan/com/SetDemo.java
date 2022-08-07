package titan.com;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set s=new HashSet();
		s.add("Abhi");
		s.add(10);
		s.add(10);
		s.add(10.52);
		s.add("Ram");
		System.out.println(s);

	}

}
