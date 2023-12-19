import java.util.Scanner;

public class Conditionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("I like to write my own stories. Y/N");
		String q1=in.nextLine().toUpperCase();
		
		
		//Calculations
		int wordCount=0;
		if (q1.startsWith("Y")) {
			wordCount++;
		}
	}

}
