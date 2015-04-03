
package iut.tdd;

import java.util.HashMap;
import java.util.Map;

/**
 * Convert provides a couple of methods to convert numbers into text and vice-versa.
 *
 * @author Tititesouris
 * @version 1.0.0
 * @since 2015-04-03
 */
public class Convert {

    /**
     * Contains all the fixed strings for unique numbers.
     */
    private static final Map<Integer, String> numbers = new HashMap<Integer, String>() {
        {
            put(0, "zéro");
            put(1, "un");
            put(2, "deux");
            put(3, "trois");
            put(4, "quatre");
            put(5, "cinq");
            put(6, "six");
            put(7, "sept");
            put(8, "huit");
            put(9, "neuf");
            put(10, "dix");
            put(11, "onze");
            put(12, "douze");
            put(13, "treize");
            put(14, "quatorze");
            put(15, "quinze");
            put(16, "seize");
            put(20, "vingt");
            put(30, "trente");
            put(40, "quarante");
            put(50, "cinquante");
            put(60, "soixante");
            put(80, "quatre-vingt");
        }
    };

    /**
     * Returns a text version of a number passed as input.
     *
     * @param input The number to convert to text.
     * @return      Text version of the number.
     */
	public static String num2text(String input) {

        try {
            int number = Integer.parseInt(input);

            if (number <= 16 || number % 10 == 0) {
                if (number >= 70 && number % 20 == 10) {
                    return numbers.get(number - 10) + "-" + numbers.get(number % 20);
                }
                if (number == 80) {
                    return numbers.get(number) + "s";
                }
                return numbers.get(number);
            }
            if (number % 10 == 1) {
                if (number >= 70 && number % 20 == 11) {
                    return getTens(number - 10) + "-et-onze";
                }
                if (number == 81) {
                    return getTens(number) + "-un";
                }
                return getTens(number) + "-et-un";
            }
            if (number < 70) {
                return getTens(number) + "-" + numbers.get(number % 10);
            }
            return getTens(number - 10) + "-" + numbers.get(number % 20);
        }
        catch (Exception e) {
            return null;
        }
	}

    /**
     * Returns a number version of a text passed as input.
     *
     * @param input The text to convert to number.
     * @return      Number version of the text.
     */
	public static String text2num(String input) {
		return null;
	}

    /**
     * Returns the text of the tens of a number passed as parameter.
     *
     * @param number    Number to get the tens of.
     * @return          Text version of the tens of the number.
     */
    public static String getTens(int number) {
        return numbers.get(number / 10 * 10);
    }

}