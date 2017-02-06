package week5;

public class CommissionEmployee {
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	private double grossSale;
	private double commissionRate;
	
	//Constructor
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSale, double commissionRate){
		
		//Validate grossSale number
		if(grossSale < 0.0)
		{
			throw new IllegalArgumentException("Gross Sales must be >=0.0");
		}
		
		//Validate commissionRate
		if(commissionRate <= 0.0 || commissionRate >= 1.0)
		{
			throw new IllegalArgumentException("commissionRate must be > 0.0 and < 1.0");
		}
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.grossSale = grossSale;
		this.commissionRate = commissionRate;
	}

	public double getGrossSale() {
		return grossSale;
	}

	public void setGrossSale(double grossSale) {
		//Validate Gross Sales
		if(grossSale < 0.0)
		{
			throw new IllegalArgumentException("Gross Sales must be >=0.0");
		}
		this.grossSale = grossSale;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		//Validate commissionRate
		if(commissionRate <= 0.0 || commissionRate >= 1.0)
		{
			throw new IllegalArgumentException("commissionRate must be > 0.0 and < 1.0");
		}
		this.commissionRate = commissionRate;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
	//Calculate Earnings
	public double earnings(){
		return getCommissionRate() * getGrossSale();
	}
	
	public String toString(){
		 return String.format(
		         "%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%", 
		         "base-salaried commission employee", getFirstName(), getLastName(), 
		         "social security number",getSocialSecurityNumber(), 
		         "gross sales", getGrossSale(), "commission rate", getCommissionRate());
	}
}















