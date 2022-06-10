package app;

/**
 * 
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @version 1.0.0 2022-06-09
 */

/**
 * Import class
 */

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Create class
 */

public class LibrarySongs<songs> {
	/**
	 * Class instantiation
	 */
	Print print = new Print();
	/**
	 * Class attributes
	 */
	ArrayList<Song> songs = new ArrayList<Song>();
	ArrayList<Song> filter = new ArrayList<>();

	/**
	 * Constructor method
	 */
	public LibrarySongs() {
	}

	/**
	 * Method that receives as a parameter the song that is added to the arraylist
	 * 
	 * @param song objeto(cancion) which will be added to the arraylist
	 */
	public void addSong(Song song) {
		songs.add(song);
	}

	/**
	 * Method that registers the songs and receives as a parameter the amount of
	 * registration to be made creates an object of type song and declares the
	 * addSong method which is passed as a parameter to the object song that will be
	 * added to the Songs arraylist
	 * 
	 * @param amount number of songs to register
	 */
	public void registerSongs(int amount) {

		for (int i = 0; i < amount; i++) {

			String title = JOptionPane.showInputDialog(null, "Enter the name of the song");
			int identifier = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the song id"));
			// Date date;
			int duration = Integer
					.parseInt(JOptionPane.showInputDialog(null, "Enter the duration of the song (In seconds)"));
			String gender = JOptionPane.showInputDialog(null, "Enter the musical genre of the song");
			String cover = JOptionPane.showInputDialog(null, "Enter the location of the cover");
			String description = JOptionPane.showInputDialog(null, "Enter a short description");
			int year = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the year of release"));
			Song song = new Song(title, identifier, null, duration, gender, cover, description, year);

			addSong(song);
		}
	}

	/**
	 * Method that allows filtering by year, receives as a parameter the year that
	 * the user types, validation is made if the year you enter exists in the entire
	 * playlist, since it does not exist, it is added to the arraylist filter, which
	 * will then be the search result by year
	 * 
	 * @param year receives the year which the user is looking for
	 */
	public void filterYear(int year) {
		filter.clear();
		for (Song song : songs) {
			int value = song.getYear();
			if (value == year) {
				filter.add(song);
			}
		}

		if (filter.isEmpty()) {
			JOptionPane.showMessageDialog(null, "There are no songs from that year");
		} else {
			String result = filter();
			JOptionPane.showMessageDialog(null, result);
		}

	}

	/**
	 * Method that returns the arraylist that contains the registered songs the
	 * arraylist will be used in the playList class
	 * 
	 * @return arraylist songs
	 */
	public ArrayList<Song> sendArrayList() {
		return songs;
	}

	/**
	 * Print the arraylist through the printArrayList method of the Print class
	 * 
	 * @return String with the records of the arraylist
	 */

	public String songs() {
		return print.printArrayList(songs);
	}

	public String filter() {
		return print.printArrayList(filter);
	}

}