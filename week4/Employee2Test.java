package week4;

public class Employee2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.printf("Employees before instantiation: %d%n", Employee2.getCount());
		
		
		//Create Employees
		Employee2 e1 = new Employee2("Shruti", "Kaushal");
		Employee2 e2 = new Employee2("Madhu", "Kaushal");
		
		System.out.printf("%nEMployees after instantiation: %n");
		System.out.printf("via e1.getCount(): %d%n", e1.getCount());
		System.out.printf("via e2.getCount(): %d%n", e2.getCount());
		System.out.printf("via Employee2.getCount(): %d%n", Employee2.getCount());
	}

}
