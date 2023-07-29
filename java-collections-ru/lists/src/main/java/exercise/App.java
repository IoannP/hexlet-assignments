package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String letters, String word) {
        String[] lettersArray = letters.toLowerCase().split("");
        String[] lettersWord = word.toLowerCase().split("");

        List<String> lettersList = new ArrayList<String>(Arrays.asList(lettersArray));
        List<String> wordLettresList = new ArrayList<String>(Arrays.asList(lettersWord));


        for (String letter : wordLettresList) {
            int index = lettersList.indexOf(letter);
            if (index < 0) {
                return false;
            }
            lettersList.remove(index);
        }
        return true;
    }
}
//END
