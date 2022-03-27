package examples;
/**
 * A String is any value in double quote
 * */
public class Example_StringVariable {

	//Declare 2 global strings variable
	static String myName, mySchoolName;
	
	
	public static void main(String[] args) {//the brain
		
		myName="Prof Milo";//assigning a string to a the myName variable
		mySchoolName="Pro-Tech Alliance"; //assigning a string to the mySchoolName variable
		
		System.out.println("Welcome to the Software QA Engineer class");//printing a sentence (string)
		System.out.println(myName);//instead of typing a string, we type the name of the variable
		System.out.println(mySchoolName);//a variable should not be in any quotes else it will be a normal sentence
		
		
		System.out.println("String concatenation : "+myName);
		System.out.println("Concatenate :"+myName+mySchoolName);
		System.out.println("Concatenate :"+myName+" "+mySchoolName);
		
		
	}

}
