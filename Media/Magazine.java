package Media;
public class Magazine extends Print {
	private int issueNumber;
	
	public Magazine(String str, int num) {
		super(str);
		issueNumber = num;
	}
	
	public String toString() {
		return getTitle() + " #" + issueNumber;
	}
	
	public int compareTo(Magazine o) {
		return this.toString().compareTo(o.toString());
	}
}