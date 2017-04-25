package Media;
public class Periodical extends Print {
	private String date; // YYYY/MM/DD
	
	public Periodical(String str1, String str2) {
		super(str1);
		date = str2;
	}
	
	public String toString() {
		return getTitle() + " " + date;
	}
}