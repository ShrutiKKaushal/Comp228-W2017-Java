import javax.swing.JOptionPane;

public class BookTest {
	public static void main(String[] args) {
		Book[] book = new Book[4];
		
		book[0] = new ScienceBook("Science 101", "1234567", "The Pub", 20.99, 2016);
		book[1] = new ScienceBook("Science 102", "234567", "The Pub", 2.99, 2015);
		book[2] = new ChildrenBook("Children 101", "567", "The Pub", 20.50, 2013);
		book[3] = new ChildrenBook("Children 101", "1234", "The Pub", 0.99, 2006);
		
		for(Book b : book) {
			String s = String.format("BOOKS %n%n%s%n%s%n%n", b, b.getGenre());
			
			JOptionPane.showMessageDialog(null, s);
		}
	}
}
