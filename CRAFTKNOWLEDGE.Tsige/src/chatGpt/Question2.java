package chatGpt;

public class Question2 {
	
	public static void main(JavaOverLoad[] args) {
		
		double n1=10.5;
		double n2=12.4;
		double n3=14.9;
		
		if(n1>n2&&n1>n3) {
			System.out.print("n1 is the largest number");
			
		}
		else if(n2>n1&&n2>n3) {
			System.out.print("n2 is the largest number");
			
			
		}
		else if(n3>n1&&n3>n2) {
			System.out.print("n3 is the largest number");
		}
		
		else {
			System.out.print(false);
		}
	
	}

}
