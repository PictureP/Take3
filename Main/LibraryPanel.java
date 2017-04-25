package Main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Set;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import Media.Media;

public class LibraryPanel extends JPanel {
	private JLabel addShelfLabel, addMediaLabel;
	private JTextField addShelf, addMedia, search;
	private JComboBox<Shelf> shelfCombo;
	private JComboBox<Media> mediaCombo;
	private JTextArea area;
	private Library library;

	public LibraryPanel() {
		library = new Library();
		int columns = 10;
		addShelfLabel = new JLabel("Add shelf");
		addShelf = new JTextField(columns);
		addMediaLabel = new JLabel("Add media");
		addMedia = new JTextField(columns);
		shelfCombo = new JComboBox();
		mediaCombo = new JComboBox(Media.getMediaTypes());
		area = new JTextArea(20, 15);
		search = new JTextField(columns);

		addShelf.addActionListener(new listener());
		addMedia.addActionListener(new listener());
		search.addActionListener(new listener());

		add(addShelfLabel);
		add(addShelf);
		add(addMediaLabel);
		add(addMedia);
		add(shelfCombo);
		add(mediaCombo);
		add(search);
		add(area);

		setPreferredSize(new Dimension(300, 500));
		setBackground(Color.pink);
	}
	
	public void populateShelfCombo() { // necessary?
		for (String s: library.getLibraryMap().keySet()) {
			shelfCombo.addItem(library.getLibraryMap().get(s));
		}
	}

	private class listener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent event) {
			if (event.getSource() == addShelf) {
				String text = addShelf.getText();
				Shelf s = new Shelf(text);
				library.addShelf(s);
				shelfCombo.addItem(s);
				addShelf.selectAll();
				area.setText(library.toString());
			} if (event.getSource() == addMedia) {
				String str = addMedia.getText();
				Shelf sh = (Shelf) shelfCombo.getSelectedItem();
				sh.addMedia(str);
				addMedia.selectAll();
				area.setText(library.toString());
			} if (event.getSource() == search) {
				String str = search.getText();
				area.setText(library.search(str).toString());
			}
						
		}
	}
}