package app;

/**
* @author Gustavo Molina <gusmol37@gmail.com>
* @version 1.0.0 2022-06-09
*/

/**
 * Import class
 */

import java.util.Date;

/**
 * 
 * Song class and its attributes
 *
 */
public class Song implements Comparable<Song> {
	
	/**
	 * The title attribute stores the title of the song.
	 * The identifier attribute stores the record identifier number.
	 * The date attribute stores the song's release date.
	 * The duration attribute stores the time in seconds that the song lasts.
	 * The gender attribute stores the genre type of the song.
	 * The cover attribute stores the cover of the song.
	 * The description attribute stores a brief description of the song.
	 * The year attribute stores the year the song was released.
	 */
	private String title;
	private int identifier;
	private Date date;
	private int duration;
	private String gender;
	private String cover;
	private String description;
	private int year;

	/**
	 * Method that captures the year in which the song was published.
	 * @return returns the release year number
	 */
	public int getYear() {
		return year;
	}

	/**
	 * Method that assigns an initial value to the year attribute.
	 * @param stores the year of publication of the song
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * Method that captures the title of the song.
	 * @return returns the title of the song.
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * Method that assigns initial value to the title attribute.
	 * @param stores the title of publication of the song
	 */

	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Method that captures the identifier of the song. 
	 * @return returns the identifier of the song.
	 */
	public int getIdentifier() {
		return identifier;
	}
	
	/**
	 * Method that assigns initial value to the identifier attribute. 
	 * @return stores the identifier of publication of the song
	 */

	public void setIdentifier(int identifier) {
		this.identifier = identifier;
	}

	/**
	 * Method that captures the publication date of the song. 
	 * @return returns the publication date of the song.
	 */
	public Date getDate() {
		return date;
	}
	
	/**
	 * Method that assigns an initial value to the date attribute. 
	 * @return stores the date of publication of the song
	 */

	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * Method that captures the length of the song. 
	 * @return returns the length of the song.
	 */
	public int getDuration() {
		return duration;
	}
	
	/**
	 * Method that assigns an initial value to the duration attribute. 
	 * @return stores the duration of publication of the song
	 */

	public void setDuration(int duration) {
		this.duration = duration;
	}

	/**
	 * Method that captures the genre of the song. 
	 * @return returns the genre of the song.
	 */
	public String getGender() {
		return gender;
	}

	
	/**
	 * Method that assigns an initial value to the gender attribute.
	 * @return stores the gender of publication of the song
	 */
	
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * Method that captures the cover of the music production. 
	 * @return returns the cover of the music production.
	 */
	public String getCover() {
		return cover;
	}
	
	/**
	 * Method that assigns an initial value to the cover attribute.
	 * @return stores the cover of publication of the song
	 */

	public void setCover(String cover) {
		this.cover = cover;
	}

	/**
	 * Method that captures the description of the song. 
	 * @return returns the description of the song.
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * Method that assigns initial value to the description attribute. 
	 * @return stores the description of the song
	 */

	public void setDescription(String description) {
		this.description = description;
	}

	public Song(String title, int identifier, Date date, int duration, String gender, String cover, String description,
			int year) {
		this.title = title;
		this.identifier = identifier;
		this.date = date;
		this.duration = duration;
		this.gender = gender;
		this.cover = cover;
		this.description = description;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Song [cover=" + cover + ", date=" + date + ", description=" + description + ", duration=" + duration
				+ ", gender=" + gender + ", identifier=" + identifier + ", title=" + title + ", year=" + year + "]";
	}

	/**
	 * The method allows to classify the records according to their duration.
	 * 
	 * @param t record (song) then selects the getDuration attribute which allows
	 *          the comparison
	 * @return records according to their duration.
	 */
	@Override
	public int compareTo(Song t) {
		if (t.getDuration() > duration) {
			return -1;
		} else if (t.getDuration() == duration) {
			return 0;
		} else {
			return 1;
		}
	}

}