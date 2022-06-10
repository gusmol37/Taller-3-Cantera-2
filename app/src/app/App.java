package app;

/**
 * This application allows you to store, consult and delete song information.
 * 
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @version 1.0.0 2022-06-09
 */

/**
 * Import librarie to handle Array
 */

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * 
 * Main class of the application application App
 */

public class App {
	
	/**
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		/**
		 * Class instantiation
		 */
		LibrarySongs library = new LibrarySongs();
		PlayList playList = new PlayList();

		/**
		 * Main class attributes
		 * option: It stores the option that the user chooses in the menu
		 * amount: It stores the amount of songs you want to save
		 * nameList: playlist's name
		 */
		String result = "";
		int option;
		int amount;
		String nameList = null;

		/**
		 * do-while loop containing the main menu
		 */

		do {

			option = Integer.parseInt(JOptionPane.showInputDialog(null,
					"    *******     Musical APP    ******* \n\n" + "Make your choice:\n\n" + "1. Add song \n"
							+ "2. List of songs \n" + "3. Add song to your playlist \n" + "4. Your playlist \n"
							+ "5. Search by genre \n" + "6. Search by year \n" + "7. Playlist by duration \n"
							+ "8. Playlist by date \n" + "9. Exit \n\n"));

			/**
			 * The switch selection control structure allows you to create a menu of options for the user to choose what they want to do
			 */
			switch (option) {
			case 1:
				amount = Integer
						.parseInt(JOptionPane.showInputDialog(null, "Indicate how many songs you want to register"));

				library.registerSongs(amount);
				break;
			case 2:
				result = library.songs();
				JOptionPane.showMessageDialog(null, result);
				break;
			case 3:
				int number = 0;
				try {
					result = library.songs();
					ArrayList<Song> container = library.sendArrayList();
					playList.toAssign(container);

					number = Integer.parseInt(
							JOptionPane.showInputDialog(null, "Select the song for your playlist \n\n" + result));
					if (number > 0) {
						playList.createList(number);
					}

				} catch (Exception e) {
					if (number == 0) {
						System.out.println("No registration");
					}
				}

				break;
			case 4:
				String result2 = playList.songs();
				if (nameList == null) {
					nameList = playList.nameList();
				}

				JOptionPane.showMessageDialog(null, nameList + "\n\n" + result2);
				break;

			case 5:
				String gender = JOptionPane.showInputDialog(null,
						"Search by genre the songs of your playlist \n\n" + " Enter the genre");
				playList.filterGender(gender);
				break;

			case 6:
				int year = Integer.parseInt(
						JOptionPane.showInputDialog(null, "Search by year in your playlist (year format 0000)"));
				library.filterYear(year);
				break;
			case 7:
				playList.order();
				break;
			case 8:
				playList.orderDate();
				break;
			case 9:
				System.exit(0);
				break;

			default:
				JOptionPane.showMessageDialog(null, "Wrong option");

			}
		} while (option <= 9);

	}
}
