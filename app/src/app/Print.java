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

/**
 * 
 * Create the class that contains the method
 */
public class Print {

	public Print() {
	}

	/**
	 * Method that receives an arraylist as a parameter which will be traversed to
	 * concatenate in a string which is then printed to display the records of the
	 * desired arraylist.
	 *
	 * @return string containing all records
	 */
	public String printArrayList(ArrayList<Song> songs) {
		String library = "";

		for (int i = 0; i < songs.size(); i++) {
			library += (i + 1) + ". " + songs.get(i).toString() + " \n";
		}

		return library;
	}

}