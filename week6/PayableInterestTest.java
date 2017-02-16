package week6;

public class PayableInterestTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payable[] payableObjects = new Payable[4];
		
		//Assign array with payableObjects
		payableObjects[0] = new Invoice("01234", "Seat",2,375.00);
		payableObjects[1] = new Invoice("56789","Tire", 4, 79.50);
		payableObjects[2] = new SalariedEmployee("Shruti", "Kaushal", "111-111-111",800.00);
		payableObjects[3] = new SalariedEmployee("Wallace", "Balanuic", "222-222-222", 500.00);
		
		System.out.println("Invoices and employees processed polymorphically");
		
		for(Payable currentPayable: payableObjects) {
			System.out.printf("%n%s %n%s: %.2f%n", currentPayable.toString(),
					"Payment Due", currentPayable.getPaymentAmount());
		}
	}

}
