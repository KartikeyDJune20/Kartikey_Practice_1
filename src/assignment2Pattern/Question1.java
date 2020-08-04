package assignment2Pattern;

public class Question1 {
	void ques1(){
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(j%2==0){
					System.out.print("#");
				}
				else
					System.out.print("*");
			}
		}System.out.println();
	}

	void star(){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Question1 question1=new Question1();
question1.ques1();

	}

}
