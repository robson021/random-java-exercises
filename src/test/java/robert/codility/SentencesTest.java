package robert.codility;

import org.junit.Assert;
import org.junit.Test;

public class SentencesTest {

    @Test
    public void longestSentenceInText() {
        int result1 = Sentences.longestSentenceInText("We test coders. Give us a try?");
        Assert.assertEquals(4, result1);

        int result2 = Sentences.longestSentenceInText("Forget CVs..Save time . x x");
        Assert.assertEquals(2, result2);

        int result3 = Sentences.longestSentenceInText("Where is my mind? I don't know that yet! What to do? abc.qwerty!!!");
        Assert.assertEquals(5, result3);
    }

}