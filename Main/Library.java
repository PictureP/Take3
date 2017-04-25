package Main;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import Media.Media;

public class Library {
	private Map<String, Shelf> libMap = new HashMap<String, Shelf>();

	public Library() {}
	
	public void newShelf(String str) {
		libMap.put(str, new Shelf(str));
	}

	public void addShelf(Shelf sh) {
		libMap.put(sh.getName(), sh);
	}

	public Map<String, Shelf> getLibraryMap() {
		return libMap;
	}
	
	public Map<Shelf, Set<Media>> search(String str) {
		Map<Shelf, Set<Media>> query = new HashMap<Shelf, Set<Media>>();
		for (String s : libMap.keySet()) {
			query.put(libMap.get(s), new TreeSet<Media>());
			for (Media m : libMap.get(s).getShelf()) {
				if (m.getTitle().contains(str)) {
					query.get(libMap.get(s)).add(m);
				}
			}
		}
		return query;
	}

	public String toString() {
		Map<Shelf, Set<Media>> minimap = new HashMap<Shelf, Set<Media>>();
		for (String str: libMap.keySet()) {
			minimap.put(libMap.get(str), new TreeSet<Media>());
			for (Media m : libMap.get(str).getShelf()) {
				minimap.get(libMap.get(str)).add(m);
			}
		}
		return minimap.toString();
	}
}