package Media;
public class Video extends Media {
	private String duration;
	private static String format;
	private static int count;
	
	public Video(String str1, String str2) {
		super(str1);
		duration = str2;
		count++;
	}
	
	public void setFormat(String str) {
		format = str;
	}
	
	public String toString() {
		return getTitle() + " " + duration + " " + format;
	}
}