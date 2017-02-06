package week5;

public class CommissionEmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommissionEmployee employee = new CommissionEmployee("Shruti","Kaushal","123-456-789",10000,0.06);
		
		//Print Employee info
		System.out.printf("Employee Information obtained by get methods: ");
		
		
		System.out.printf("%n%s %s%n", "First Name is: ", employee.getFirstName());
		System.out.printf("%n%s %s%n", "Last Name is: ", employee.getLastName());
		System.out.printf("%n%s %s%n", "Social Security Number is: ", employee.getSocialSecurityNumber());
		System.out.printf("%n%s %.2f%n", "Gross Sale is: ", employee.getGrossSale());
		System.out.printf("%n%s %.2f%n", "Commission Rate is: ", employee.getCommissionRate());
		
		 employee.setGrossSale(5000); 
	     employee.setCommissionRate(.1);
	     
	     System.out.printf("%n%s:%n%n%s%n",                                
	             "Updated employee information obtained by toString", employee);
	}

}
