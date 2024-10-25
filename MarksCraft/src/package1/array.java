package package1;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=33;
		int b=60;
		int c=6;
		
		String fName= "Mark";
		String LName= "Ay";
		
		Double M1=11.0;
		Double M2=22.0;
		
		int array [] = new int [5];
		// int [] array; works the same as the above as well.
		
		System.out.println("array length: = " +array.length);
		// print out the length of the array
		
		array[0]=1;
		array[1]=7;
		array[2]=3;
		array[3]=4;
		array[4]=77;
		
		//System.out.println(array[0]);
		//System.out.println(array[1]);
		//System.out.println(array[2]);
		//System.out.println(array[3]);
		//System.out.println(array[4]);
		
		for(int i=0; i<array.length; i++){
		System.out.println("amount at index " +i+ " is " +array[i]);
		}
		

		

	}

}
