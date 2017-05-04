
public class Nested_if_Statement {
	public static void main(String args[]){
		int age = 60;
		
		if (age< 30){
			System.out.println("You are young");
			
		}else{
			System.out.println("You are old");
			
			if (age > 75 ){
				System.out.println("You are REALLy old !");
			}else{
				System.out.println("dont worry you aren't really that old");
			}
		}
	}

}
