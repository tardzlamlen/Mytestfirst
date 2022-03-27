package examples;
/**
 * Concatenation in the Java programming language 
 * is the operation of joining two strings together. 
 * You can join strings using either the addition (+) operator or 
 * the String's concat() method.**/

public class Example_Concatenation {
	
	//Declaring global variable
 static String Name1,Name2;
 static int age1=20,age2=10,theAgeAnswer=0;
 static double salary1=25000.32,salary2=15000.2,theSalaryAnswer=0;

	public static void main(String[] args) {//main method
		//you must call the methods in the MAIN else nothing will work
		additionMethod();
		subtrationMethod();
		joiningTwoStrings();
		
		
	}

	
	public static void additionMethod() {
		theAgeAnswer =age1+age2;//adding two integers with thier default values
		System.out.println("Your age is "+theAgeAnswer);//concatenate string and answer
	}
	
	
	public static void subtrationMethod() {
		theAgeAnswer =age1-age2;//subtracting two variables with thier defaullt values
		System.out.println("Your answer is: "+theAgeAnswer);//concatenate string and answer
	}
	
	public static void joiningTwoStrings() {
		Name1="Hello";
		Name2="World";
		
	System.out.println(Name1+Name2);//joining two string without a space
		
	}
	
	
	
}
