package Main;
import java.util.Set;
import java.util.TreeSet;

import Media.Media;

public class Shelf implements Comparable<Shelf> {
	private String name;
	private Set<Media> shelf;
	
	public Shelf(String str) {
		name = str.toUpperCase();
		shelf = new TreeSet<Media>();
	}
	
	public void addMedia(String str) {
		shelf.add(new Media(str));
	}
	
	public Set<Media> getShelf() {return shelf;}
	
	public String getName() {return name;}
	
	public String getContents() {
		Set<String> contents = new TreeSet<String>();
		for (Media m : shelf) {
			contents.add(m.getTitle());
		}
		return contents.toString();
	}

	@Override
	public int compareTo(Shelf arg0) {
		return name.compareTo(arg0.name);
	}
	
	public String toString() {
		return name;
	}
}