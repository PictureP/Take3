package Media;
public class Print extends Media {
	private static String author;
	private int pages;
	private static int count;
	
	Print(String str) {
		super(str);
		count++;
	}
	
	public String toString() {
		return this.getTitle();
	}
}