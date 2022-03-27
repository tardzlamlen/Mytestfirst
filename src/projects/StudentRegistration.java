package projects;

import java.util.Scanner;

/**
 * **
 * @author Emile Esapa
 *Pro-Tech Alliance is giving scholarships to student from Africa with 40% off the original cost.
 *Anyone living in other continent will pay the full school fees. 
 * The cost of school fees is $3500. Create a program that tells students how much they will 
 *pay depending on where they live. The user should enter their continent and the program would
 *display the name of the student, their continent and how much they will have to pay.
 */

public class StudentRegistration {
//Global variable
	static String studentName, studentLocation,discountStatus;
	static double schoolFees=3500, discount=0.4, calculatedFees=0, calculatedDiscount=0;//40% converted to decimal=0.4;
	
	
	public static void main(String[] args) {
		getStudentInformation();
		calculateSchoolFees();
		displayInformation();
	}
	
	
	public static void getStudentInformation() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your Name ?");//ask user to enter student name
		studentName=scan.nextLine();//recieve name and assign to variable studentName
		
		System.out.println("Where do you live ? e.g Europe or enter name of continent");//ask user to enter location
		studentLocation=scan.nextLine();//recieve user input and assign to variable studentLocation
		
	}
	
	public static void calculateSchoolFees() {
				
			if(studentLocation.equalsIgnoreCase("Africa")){
				calculatedDiscount = schoolFees * discount;
				calculatedFees = schoolFees - calculatedDiscount;
				discountStatus = "Yes";
			}else {
				calculatedFees = schoolFees;
				discountStatus = "No";
			}
		
	}
	
	
	public static void displayInformation() {
		System.out.println("PRO-TECH ALLIANCE STUDENT REGISTRATION");
		System.out.println("Student Name.........:"+studentName.toUpperCase());
		System.out.println("Student Location.....:"+studentLocation.toUpperCase());
		System.out.println("Student Fees.........:$"+calculatedFees);
		
	}
	
	


}
