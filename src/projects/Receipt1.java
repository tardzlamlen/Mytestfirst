package projects;
import java.util.Scanner;

//imported the scanner object from the JRE System Repository to use the functionality in the class


public class Receipt1 {
	
	//declare the variables in the class so you can use in the entire class
	
	static int cachnkyQty, gv195ozQty, oreoQty;
	
	static double cachnkyprice=4.84,gv195ozprice=2.64,oreoprice=4.68,cSubtotal=0,cTotal=0; 
	
	
	
public static void main(String[] args){ 
	//this is like the brain and you need to call all you methods here so it can acknowledge them later when it finds it in the class.
	
	myInputMethod();
	myCalculationMethod();
	myOutputMethod();
	
	
	}//MAIN ENDS


//METHOD1
public static void myInputMethod() { //myInputMethod is within the public class so as it's not limited to just the main.
	
	
	//creating an object from the scanner class so we can access the methods and properties of the class
	Scanner scannerObject = new Scanner(System.in);
	
	
	System.out.println("Please enter the quantity of cachnky");
	cachnkyQty=scannerObject.nextInt();
	
	System.out.println("Please enter the quantity of gv195oz"); 
	gv195ozQty=scannerObject.nextInt();
	
	System.out.println("Please enter the quantity of oreo");
	oreoQty=scannerObject.nextInt();
	
}// myInputMethod() ENDS


//METHOD2
public static void myCalculationMethod() {
	cSubtotal= (cachnkyQty*cachnkyprice)+(gv195ozQty*gv195ozprice)+(oreoQty*oreoprice);
	cTotal= cSubtotal;

}// myCalculationMethod() ENDS


//METHOD3

public static void myOutputMethod() { // Note: 'System.out.println' is used to display value or info on the console
	
	System.out.println("Quantity of cachnky............:"+cachnkyQty);
	System.out.println("Quantity of gv195oz............:"+gv195ozQty);
	System.out.println("Quantity of oreo...............:"+oreoQty);
	System.out.println("Subtotal.......................:"+cSubtotal);
	System.out.println("Total..........................:"+cTotal);
	
}// myOutputMethod ENDS










}// PUBLIC CLASS ENDS
