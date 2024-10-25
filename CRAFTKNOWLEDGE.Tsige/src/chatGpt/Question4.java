package chatGpt;

public class Question4 {
	
	public static void main (JavaOverLoad[] args) {
		 
		int score=50;
		char grade;
		
		switch (score) {
		
		case 90:
			grade='A';
			break;
		case 80:
			grade='B';
			break;
		case 70:
			grade ='C';
			break;
		case 60:
			grade = 'D';
			break;
		default:
			grade ='F';
			break;
		
		}
		System.out.print("grade:"+grade);
	}

}
