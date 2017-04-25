package Media;
public class Audio extends Media {
	private String duration; // hh:mm:ss
	private static String format;
	private static int count;
	
	Audio(String str1, String str2) {
		super(str1);
		duration = str2;
		count++;
	}
	
	public static void setFormat(String str) {
		format = str;
	}
	
	public String toString() {
		return getTitle() + format + duration;
	}

}
