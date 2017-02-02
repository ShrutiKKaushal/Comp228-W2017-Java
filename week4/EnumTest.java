package week4;

import java.util.EnumSet;

public class EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("All Books: ");
		
		//Enhanced For-loop - for(Enum name object variable : Enum.values)
		for(Book book : Book.values()){
			System.out.printf("%-10s%-45s%s%n", book, book.getTitle(), book.getCopyrightYear());
		}
		
		System.out.printf("%n Display a range of enum constants: %n");
		
		for(Book book : EnumSet.range(Book.JHTP, Book.CPPHTP)){
			System.out.printf("%-10s%-45s%s%n", book, book.getTitle(), book.getCopyrightYear());
		}
	}

}
