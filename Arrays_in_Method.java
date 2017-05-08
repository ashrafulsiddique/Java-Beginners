class Arrays_in_Method {
	public static void main(String[] args){
		int ashra[]={3,4,5,6,7};
		change(ashra);
		
		for(int y:ashra)
			System.out.println(y);
		
	}
	
	public static void change(int x[]){
		for(int counter=0;counter<x.length;counter++)
			x[counter]+=5;
	}
}
