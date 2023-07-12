package day2Squad;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		List l1=new ArrayList<>();
		
		l1.add(100);
		l1.add("Akil");
		l1.add(34.89);
		l1.add('V');
		System.out.println(l1);
		l1.remove(2);
		System.out.println(l1);

	}

}
