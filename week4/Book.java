package week4;

public enum Book {
	//Declare Constants
	JHTP("Java How To Program", "2015"),
	CHTP("C How To Program", "2013"),
	IW3HTP("Internet & World Wide Web How To Program", "2012"),
	CPPHTP("C++ How To Program", "2014"),
	VBHTP("Visual Basic How To Program", "2014"),
	CSHARPHTP("Visual C# How To Program", "2014");
	
	////////////////////////////////////////////////////////////////
	//Declare instance fields
	private final String title;
	private final String copyrightYear;
	
	//Declare  constructor
	Book(String title, String copyrightYear) {
		this.title = title;
		this.copyrightYear = copyrightYear;
	}

	//getMethods
	public String getTitle() {
		return title;
	}

	public String getCopyrightYear() {
		return copyrightYear;
	}
	
}
