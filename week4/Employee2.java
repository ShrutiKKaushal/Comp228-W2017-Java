package week4;

public class Employee2 {
	//Static Variable
	private static int count = 0;
	
	//instance variables
	private String firstName;
	private String lastName;
	
	public Employee2(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		
		++count;
		System.out.printf("Employee Constructor: %s %s; %d%n", firstName, lastName, count);
	}

	//getMethods
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Employee2.count = count;
	}

	public String getFirstName() {
		return firstName;
	}
}
