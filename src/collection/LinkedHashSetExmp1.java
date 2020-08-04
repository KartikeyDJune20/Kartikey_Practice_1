package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetExmp1 {
	public static void main(String[] args) {
		LinkedHashSet<String> employee1=new<String> LinkedHashSet();
		employee1.add("maulik1");
		employee1.add("maulik2");
		employee1.add("Kartikey");
		employee1.add("maulik3");
		employee1.add("maulik4");
		employee1.add("Maulik5");
		System.out.println(employee1);
		int count=1;
		
		
		for(String employee:employee1){
			System.out.println();
			
			
		}
		TreeSet<String> employee2=new<String> TreeSet();
		employee2.add("1maulik1");
		employee2.add("maulik2");
		employee2.add("Kartikey");
		employee2.add("maulik3");
		employee2.add("maulik4");
		employee2.add("Maulik5");
		System.out.println(employee2);
	}
}
