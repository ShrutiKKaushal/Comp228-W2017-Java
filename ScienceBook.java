
public class ScienceBook extends Book {

	public ScienceBook(String t, String i, String pu, double pr, int yr) {
		super(t, i, pu, pr, yr);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setPrice(double price) {
		// TODO Auto-generated method stub
		this.price = price * 0.9;
	}

	@Override
	public String getGenre() {
		// TODO Auto-generated method stub
		return "Science";
	}

}
