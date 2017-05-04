import java.util.Scanner;

public class Basic_Calculator {
	public static void main(String args[]){
		Scanner ash = new Scanner(System.in);
		double fnum, snum, answer;
		System.out.println("Enter First number: ");
		fnum = ash.nextDouble();
		System.out.println("Enter Second number: ");
		snum = ash.nextDouble();
		answer =fnum + snum;
		System.out.println(answer);
		
	}

}
