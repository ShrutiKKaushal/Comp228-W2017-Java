
public abstract class Book {
	private String title;
	private String ISBN;
	private String publisher;
	protected double price;
	private int year;
	
	public Book(String t, String i, String pu, double pr, int yr) {
		this.title = t;
		this.ISBN = i;
		this.publisher = pu;
		this.price = pr;
		this.year = yr;
	}
	
	public double getPrice() {
		return price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("Title: %s%nISBN: %s%nPublisher: %s%nPrice: %f%nYear: %s%n", 
				getTitle(), getISBN(), getPublisher(), getPrice(), getYear());
	}
	
	public abstract void setPrice(double price);
	public abstract String getGenre();
}
