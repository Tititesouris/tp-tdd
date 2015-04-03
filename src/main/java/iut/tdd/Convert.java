package iut.tdd;

import java.util.HashMap;
import java.util.Map;

public class Convert {
	public static String num2text(String input) {
        Map<Integer, String> numbers = new HashMap<Integer, String>() {
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
            }
        };

        try {
            int number = Integer.parseInt(input);
            if (number <= 16 || number % 10 == 0) {
                return numbers.get(number);
            }
            else if (number <= 61 && number % 10 == 1) {
                return numbers.get(number / 10 * 10) + "-et-un";
            }
            else {
                return numbers.get(number / 10 * 10) + "-" + numbers.get(number % 10);
            }
        }
        catch (Exception e) {
            return null;
        }
	}
	public static String text2num(String input) {
		return null;
	}
}