package package1;

public class Switch {

	public static void main(String[] args) {
		int day=8;
		String dayName;
		
		switch (day) {
		
		case 1:
		dayName ="Today is Monday";
		break;
		
		case 2:
			dayName ="Today is Tuesday";
			break;
			
		case 3:
			dayName = "Today is Wednesday";
			break;
			
		case 4:
			dayName ="Today is Thursday";
			break;
			
			
			default:
				dayName ="Unknown";
		
		}
		System.out.println(dayName);

	}

}
