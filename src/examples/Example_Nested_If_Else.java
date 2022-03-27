package examples;

public class Example_Nested_If_Else {

	public static void main(String[] args) {
		int yourAge =20;
		
		if(yourAge<10) {//if block start
			
			System.out.println(yourAge+" years old. You are are a child. You can only drink milk.");
			
		}else if (yourAge<=20) {
			
			System.out.println(yourAge+" years old. You are an adolescent. No Alcohol ");
			
		}else if(yourAge>20){
			
			System.out.println(yourAge+" years old. You are an adult...you can drink Alcohol");
			
		}//if else block ends

		
		
		
		
	}

}
