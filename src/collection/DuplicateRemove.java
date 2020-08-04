package collection;

import java.util.ArrayList;

public class DuplicateRemove {

	public static void main(String[] args) {
		DuplicateRemove d1=new DuplicateRemove();
		ArrayList al1=new ArrayList();
		al1.add("maulik");
		al1.add("techno");
		al1.add("harsh");
		al1.add("techno");
		ArrayList al2=new ArrayList();
		al2.add("harsh");
		al2.add("poonam");
		al2.add("nikhil");
		al2.add("kartikey");
		al2.add("harsh");
		
		for(int i=0;i<al1.size();i++){
			for(int j=i+1;j<al1.size();j++){
			if(al1.get(i)==al1.get(j)){
				al1.remove(i);
				
			}	
			
			}
			
		}
		System.out.println(al1);
		for(int i=0;i<al2.size();i++){
			for(int j=i+1;j<al2.size();j++){
			if(al2.get(i)==al2.get(j)){
				al2.remove(i);
				
			}	
			
			}
			
		}
		System.out.println(al2);
		al2.removeAll(al1);
		System.out.println(al2);
		al2.addAll(al1);
		System.out.println(al1);
		
		
		
		
		
		

	}

}
