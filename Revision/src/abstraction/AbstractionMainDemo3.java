package abstraction;

abstract class MotorBike{
	
	abstract void brake();
	
}
     
     class SportBike extends MotorBike{

		@Override
		void brake() {
			// TODO Auto-generated method stub
			
			System.out.println("SportBike Brake");
			
		}
    
    }
     
     class MountainBike extends MotorBike{

		@Override
		void brake() {
			// TODO Auto-generated method stub
			System.out.println("MountainBike Brake");
		}
    	 
     }


public class AbstractionMainDemo3 {
	
	public static void main(String[]args) {
		
		MotorBike SB = new SportBike();
		MotorBike MB = new MountainBike();
		
		SB.brake();
		MB.brake();
		
	}

}
