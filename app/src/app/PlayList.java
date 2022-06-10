package app;

/**
 * 
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @version 1.0.0 2022-06-09
 */

/**
 * Import librarie ArrayList for handling arrays
 */

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class PlayList {
	/**
	 * Class instantiation
	 */

	Print print = new Print();

	/**
	 * Class attributes
	 * 
	 * name: song name // playList: selected songs on the list // filter: search criteria
	 */
	ArrayList<Song> container = new ArrayList<Song>();
	private String name;

	ArrayList<Song> playList = new ArrayList<Song>();
	ArrayList<Song> filter = new ArrayList<Song>();

	/**
	 * Constructor method
	 */
	public PlayList() {
	}

	/**
	 * Method that captures the name of the song.
	 * 
	 * @return returns the name of the song.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Method that assigns initial value to the name attribute.
	 * 
	 * @return stores the name of the song
	 */

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Receives as parameter the arraylist that will be assigned to the arraylist
	 * called container
	 * 
	 * @param songs arraylist containing the songs created by the user
	 */
	public void toAssign(ArrayList<Song> songs) {
		this.container = songs;
	}

	/**
	 * Method which adds the selected songs to belong to the user's playlist
	 * receives as a parameter the position of the song to save in the playlist, if
	 * it is already added it does not allow to add it again otherwise it adds it to
	 * the arraylist called playlist
	 * 
	 * @param number which identifies the number of the song
	 */
	public void createList(int number) {

		if (number > container.size()) {
			JOptionPane.showMessageDialog(null, "the number of the selected song does not exist");
		} else {
			if (playList.size() == 0) {
				playList.add(container.get(number - 1));
			} else {
				for (int i = 0; i < playList.size();) {

					if (playList.get(i) == container.get(number - 1)) {
						JOptionPane.showMessageDialog(null, "The song is already on the playlist");
						break;
					} else {
						playList.add(container.get(number - 1));
						break;
					}

				}
			}
		}

	}

	/**
	 * The method performs the search for the songs in the arraylist that
	 * corresponds to the user's playlist through the gender parameter, a match is
	 * searched for in the playlist, when a match is found, it adds the song to the
	 * arraylist filter to then print the total of the results
	 * 
	 * @param gender is the genre by which a match will be searched for in the
	 *               playlist and the songs will be filtered
	 */
	public void filterGender(String gender) {
		filter.clear();
		for (Song song : playList) {
			String value = song.getGender();
			if (value.equals(gender)) {
				filter.add(song);
			}
		}

		if (filter.isEmpty()) {
			JOptionPane.showMessageDialog(null, "No songs of the entered genre are found");
		} else {
			String result = filter();
			JOptionPane.showMessageDialog(null, result);
		}

	}

	/**
	 * Method that performs the process of requesting the name of the playlist
	 * 
	 * @return getname which is a String containing the name of the playlist
	 */
	public String nameList() {
		setName(JOptionPane.showInputDialog(null, "Enter the name of the playlist"));
		return getName();
	}

	/**
	 * Sort the arraylist with the duration attribute
	 */
	public void order() {
		Collections.sort(playList);
		String values = songs();
		JOptionPane.showMessageDialog(null, values);
	}

	/**
	 * Sort the arraylist with the date attribute
	 */
	public void orderDate() {
		Collections.sort(playList, new CompareDate());
		String values = songs();
		JOptionPane.showMessageDialog(null, values);
	}

	/**
	 * Print the data of the arraylist
	 * 
	 * @return returns the string that contains the records of the arraylist
	 */

	public String songs() {
		return print.printArrayList(playList);
	}

	public String filter() {
		return print.printArrayList(filter);
	}
}