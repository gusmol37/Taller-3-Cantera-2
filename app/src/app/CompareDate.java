package app;

/**
 *  
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @version 1.0.0 2022-06-09
 */

/**
 * Import librerie Comparator 
 */

import java.util.Comparator;

/**
 * This class allows you to compare the song's release date
 *
 */

public class CompareDate implements Comparator<Song> {

	/**
	 * Compare method override
	 */
	@Override
	public int compare(Song o1, Song o2) {
		if (o1.getYear() > o2.getYear()) {
			return -1;
		} else if (o1.getYear() == o2.getYear()) {
			return 0;
		} else {
			return 1;
		}
	}
}