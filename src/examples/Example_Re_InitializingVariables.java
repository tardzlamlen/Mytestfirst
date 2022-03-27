package examples;
/**
 * Initializing and re initializing a varible multiple time**/

public class Example_Re_InitializingVariables {
	
	//declaring global variable
		static int myVariable=1;

	public static void main(String[] args) {
		
		System.out.println(myVariable);//the value assigned is default 1 and print 1
		
		myVariable=2;//we reinitialize it to 2
		System.out.println(myVariable);//now printing 2
		
		myVariable=3;//we reinitialize it to 3
		System.out.println(myVariable);//now printing 3

	}

}
