package week4;

public class Time2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time2 t1 = new Time2(12, 25, 42);
		
		displayTime("t1: hour, minute and second specified", t1);
	}

	public static void displayTime(String header, Time2 t) {
		System.out.printf("%s%n %s%n %s%n", header, t.toUniversalString(), t.toString());
	}
}
