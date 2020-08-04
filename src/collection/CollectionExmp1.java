package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionExmp1 {
	
	
	public static void main(String[] args) {
		CollectionExmp1 temp= new CollectionExmp1();
		ArrayList al=new ArrayList();
		al.add("maulik1");
		al.add("maulik2");
		al.add("maulik3");
		al.add("maulik4");
		al.add("maulik5");
		System.out.println(al.size());
		//while(al.indexOf("maulik") !=-1){
			
		//	al.remove("maulik");
			
		//}
		//System.out.println(al);
		ArrayList al1=new ArrayList();
		al1.add("maulik1");
		al1.add("maulik2");
		al1.add("maulik12");
		al1.add("maulik112");
		al1.add("maulik11311");
		for(Object element: al1){
			String temp1= (String)element;
			System.out.println(temp1.toUpperCase());
			
		}
		
		//al.removeAll(al1);
		//al.retainAll(al1);
		al.addAll(al1);
		
		System.out.println(al.get(al.size()-1));
		
		
		
			
		}		
	}


