package projects;
import java.util.Scanner;
//scanner library imported to enable the program use the scanner class fucntionality

public class MilkReciept1 {//the class name should be the same as the name of the Receipt1.java
	
	//declaring global variables so we can use it in entire class
	static int milkQuantity;
	static double Tax=0.05,cSubTotal=0,cTotal=0,cTax=0,milkPrice=3.50;//we initialize all variables to zero such that if user does not enter any input, the answers will calculate with the default values

	public static void main(String[] args) {
	//Main Method inside the Receipt1 class
		//You need to call all the methods in the main method which is the brain for the program to work
		myInputMethod();
		myCalculationMethod();
		myOutputMethod();
		
	}
	
	//METHOD1
	public static void myInputMethod() {//myInputMethod inside Receipt1 class
		
		//creating an object from the scanner class so we can access the methods and properties of the class
		Scanner scannerObject = new Scanner(System.in);
				   
				   //System.out.println help print message to the console
				   System.out.println("Please enter the Quantity of Milk");
				   
				   //The scanner object used a method in the Scanner class called nextInt()
				   //The nextInt() method is used because the variable milQuantity is an Interger
				   //As such we made use of the scannerObject to access a method called nextInt() whose function is to accept user
				   //input and store it in an integer variable called milkQuantity
				   milkQuantity=scannerObject.nextInt();
	}//myInputMethod() ENDS----------------------------------------
	
	
	//METHOD2
	public static void myCalculationMethod() {//myCalculationMethod inside Receipt1 class
		cSubTotal=milkQuantity*milkPrice;
		cTax=cSubTotal*Tax;
		cTotal=cSubTotal+cTax;
	
	}//myCalculationMethod() ENDS-----------------------------------
	
	//METHOD3
	public static void myOutputMethod() {//Remember System.out.println is used to display value or info on the console
		System.out.println("Milk Quantity............:"+milkQuantity);
		System.out.println("Subtotal.................:"+cSubTotal);
		System.out.println("Tax......................:"+cTax);
		System.out.println("Total....................:"+cTotal);
	}//myOutputMethod() ENDS----------------------------------------
	
	
	

}//Receipt class Ends-----------------------------------------------
