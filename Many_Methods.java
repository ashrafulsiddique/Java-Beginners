import java.util.Scanner;

class Many_Methods {
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		Instance InstanceObject = new Instance();
		System.out.println("Enter name of first gf here :");
		String temp = input.nextLine();
		InstanceObject.setName(temp);
		InstanceObject.saying();
		
	}

}
