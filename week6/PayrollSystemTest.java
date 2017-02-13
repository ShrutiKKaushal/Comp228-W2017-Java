package week6;

public class PayrollSystemTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SalariedEmployee salariedEmployee = new SalariedEmployee("Shruti", "Kaushal","111-111-111", 800.00);
		HourlyEmployee hourlyEmployee = new HourlyEmployee("Shruti", "Kaushal","222-222-222",17.00, 40);
		CommissionEmployeePolymorphism commissionEmployee = new CommissionEmployeePolymorphism("Sh","Ka","333-333-333", 10000,0.06);
		BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("John","Cena","444-444-444",5000,0.04,300);
		
		System.out.println("Employees processes individually");
		
		System.out.printf("%n%s%n%s: $%.2f%n%n", salariedEmployee, "earned", salariedEmployee.earnings());
		System.out.printf("%n%s%n%s: $%.2f%n%n", hourlyEmployee, "earned", hourlyEmployee.earnings());
		System.out.printf("%n%s%n%s: $%.2f%n%n", commissionEmployee, "earned", commissionEmployee.earnings());
		System.out.printf("%n%s%n%s: $%.2f%n%n", basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());
		
		
		Employee[] employee = new Employee[4];
		// Add all employees to the array
		employee[0] = salariedEmployee;
		employee[1] = hourlyEmployee;
		employee[2] = commissionEmployee;
		employee[3] = basePlusCommissionEmployee;
		
		System.out.println("Employees processed polymorphically");
		
		for(Employee currentEmployee : employee) {
			System.out.println(currentEmployee);
			
			// Check if current employee is of type BasePlusCommissionEmployee
			if(currentEmployee instanceof BasePlusCommissionEmployee) {
				// Creating BasePlusCommissionEmployee from generic employee objects
				BasePlusCommissionEmployee employee2 = (BasePlusCommissionEmployee)currentEmployee;
				
				// Set salary
				employee2.setBaseSalary(1.10 * employee2.getBaseSalary());
				
				System.out.printf("new base salary with 10%% increase is: $%.2f%n", employee2.getBaseSalary());
			}
			
			System.out.printf("earned $%.2f%n%n", currentEmployee.earnings());
		}
		
		for(int j = 0; j < employee.length; j++) {
			System.out.printf("Employee %d is a %s%n", j, employee[j].getClass().getName());
		}
	}
	}
