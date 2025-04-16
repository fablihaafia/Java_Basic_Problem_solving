package Java_Basic_Problem_Solving;

import java.util.Scanner;

public class IfElseCondition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
				
   int number =sc.nextInt();
   System.out.println("enter number");
   int number2=sc.nextInt();
   int sum =number + number2;
   if(sum%2 == 0 && sum >=0) {
	   System.out.println("the result is even," + "the result is positive"); 
   }
	   
   
   else if (sum%2 != 0 && sum >=0){
   System.out.println("the result is odd, " + "the result is positive");
   }
   else if (sum%2 == 0 && sum <0){
	   System.out.println("the result is even, " + "the result is negative");
   }
   else if (sum%2 != 0 && sum <0){
	   System.out.println("the result is odd, " + "the result is negative");
   }
   else {
	   System.out.println("the result is ");
   }

	}

}
