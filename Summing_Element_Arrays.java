
public class Summing_Element_Arrays {
	public static void main(String[] args){
		
		int ash[]={21,16,17,19};
		int sum=0;
		
		for(int counter=0;counter<ash.length;counter++){
			sum+=ash[counter];
		}
		
		System.out.println("The sum of these number is " + sum);
	}
}
