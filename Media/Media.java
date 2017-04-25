package Media;
public class Media  implements Comparable<Media> {
	private String title;
	private static int count;
	private int copies;
	private static String[] mediaTypes = {"Media", "Print", "Book", "Journal", "Magazine", "Periodical", "Photo", "Map", "Microfiche", "Audio", "CD", "Video", "Blu-Ray", "DVD", "VHS"};
	
	public Media() {}
	
	public Media(String str) {
		title = str;
		count++;
		this.copies = 1;
	}
	
	public Media(String str, int copies) {
		title = str;
		this.copies = copies;
		count+= copies;
	}
	
	public String getTitle() {
		return title;
	}
	
	public static int getCount() {
		return count;
	}
	
	public int getCopies() {
		return this.copies;
	}
	
	public static String[] getMediaTypes() {
		return mediaTypes;
	}
	
	public String toString() {
		return title;
	}

	@Override
	public int compareTo(Media o) {
		return this.toString().compareTo(o.toString());
	}
}