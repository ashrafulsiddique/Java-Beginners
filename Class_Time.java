
public class Class_Time {
	public static void main(String[] args){
		Time_Class Time_ClassObject = new Time_Class();
		System.out.println(Time_ClassObject.toMilitary());
		Time_ClassObject.setTime(13, 27, 6);
		System.out.println(Time_ClassObject.toMilitary());
		
	}
}
