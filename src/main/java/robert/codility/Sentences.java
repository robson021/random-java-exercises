package robert.codility;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * see resources dir
 */
public class Sentences {

    public static int longestSentenceInText(String text) {
        String[] splitted = text.split("[?.!]");

        System.out.println("splitted: " + Arrays.toString(splitted));

        List<String> sentences = Stream.of(splitted)
                .map(String::trim)
                .filter(s -> !s.isBlank())
                .collect(Collectors.toList());

        int wordsInLongestSentence = sentences.stream()
                .mapToInt(s -> s.split(" ").length)
                .max()
                .orElseThrow();

        System.out.println("longest sentence in text '" + text + "' contains " + wordsInLongestSentence + " words");

        return wordsInLongestSentence;
    }

}
