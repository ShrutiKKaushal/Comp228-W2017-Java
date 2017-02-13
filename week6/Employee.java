package week6;

public abstract class Employee {
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	
	public Employee(String firstName, String lastName, String socialSecurityNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	//Getter Methods
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%s %s %n Social Security Number: %s", getFirstName(), getLastName(), getSocialSecurityNumber());
	}
	
	//Abstrat Earnings Method
	public abstract double earnings();
	
	
}
