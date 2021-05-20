package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<Integer> num=new ArrayList<Integer>();
		num.add(25);
		num.add(56);
		num.add(95);
		num.add(45);
		num.add(12);
		System.out.println(num);
		num.set(1, 5);
		System.out.println(num);
		Collections.sort(num);
		System.out.println(num);
	}

}
