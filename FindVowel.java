package Java_Basic_Problem_Solving;

public class FindVowel {

	public static void main(String[] args) {
		String input ="Software QA";
		int count = 0;
		
		for(char c :input.toLowerCase().toCharArray() ) {
			
			if("aeiou".indexOf(c) != -1) {
				count ++;
			}
		}
		
		System.out.println("Number of vowels: " + count);
	}
	

}
