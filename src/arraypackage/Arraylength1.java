package arraypackage;

public class Arraylength1 {
	void ex1() {
		String[] name = { "kartikey", "dev", "Suman", "sharma", "Technocredits" };
		String max = name[0];

		for (int i = 0; i <= name.length; i++) {
		//	if (name[i].length()>= max)
				System.out.println(name[i]);

		}

	}
public static void main(String[] args) {
	int[] num=new int[5];
	//int[]num={17,12,13,25,12};
	num[0]=12;
	num[1]=16;
	num[2]=13;
	num[3]=21;
	num[4]=99;
	int sum=0;
	
	for(int i=num.length-1;i>=0;i--){
		sum=sum+num[i];
		
		System.out.println(num[i]);
	}
}
}
