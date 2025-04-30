package Java_Basic_Problem_Solving;

public class ReverseWord {

	public static void main(String[] args) {
		
	String input ="SQA" ;
	String reverse = "";
	

 for(int i = input.length()-1; i>=0;i--) {
	reverse+=input.charAt(i);
 }
 System.out.println("Reversed: " + reverse);
	}

}
