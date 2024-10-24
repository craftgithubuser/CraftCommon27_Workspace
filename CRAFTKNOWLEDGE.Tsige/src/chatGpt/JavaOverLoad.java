package chatGpt;

public class JavaOverLoad {
	
	class Adder {
		static int add (int a) {
			return a+a;
		}
		static int add(int a, int b) {
			return a+b;
		}
		static double add(double a, int b) {
			return a+b;
		}
		static double add(double a, double b) {
			return a+b;
		}
	}
	
	public static void main(String [] args) {
		
		System.out.print(Adder.add(10));
		
	}

}
