package collection;

import java.util.HashSet;

public class HashSetEmp3 {
public static void main(String[] args) {
	HashSet<String> employee1=new<String> HashSet();
	employee1.add("maulik1");
	employee1.add("maulik2");
	employee1.add("Kartikey");
	employee1.add("maulik3");
	employee1.add("maulik4");
	employee1.add("maulik5");
	for(String temp: employee1){//enhanced for loop can be used for others also
		System.out.println(temp);
	}
	
}
}
