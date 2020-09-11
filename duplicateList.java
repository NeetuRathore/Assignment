package udemy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;


public class duplicateList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(0);
		list.add(3);
		List<Integer> list1 = new ArrayList<>(new LinkedHashSet(list));
		System.out.println(list);
		System.out.println(list1);

	}

}
