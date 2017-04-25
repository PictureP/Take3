package Media;
public class Book extends Print {
	private String author;
	
	public Book(String str, String auth) {
		super(str);
		author = auth;
	}
	
	public String toString() {
		return "\"" + getTitle() + "\"" + " by " + author;
	}
}