package app;

/**
 *  
 * @author Gustavo Molina <gusmol37@gmail.com>
 * @version 1.0.0 2022-06-09
 */

/**
 * Import class
 */

import java.util.Comparator;

public class CompareDate implements Comparator<Song> {

    @Override
    public int compare(Song o1, Song o2) {
        if (o1.getYear() > o2.getYear()) {
            return -1;
        }else if (o1.getYear() == o2.getYear()){
            return 0;
        }else{
            return 1;
        }
    }
}