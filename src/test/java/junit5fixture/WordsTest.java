package junit5fixture;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class WordsTest {

    @BeforeEach
            public void init(){
    Words words = new Words();

       words.addWord("akos");
        words.addWord("bkos");
        words.addWord("bao4s");}

    @Test
    public void testGetWordsStartWith(){
        List<String> testList = Arrays.asList("akos");
        Words words = new Words();

        words.addWord("akos");
        words.addWord("bkos");
        words.addWord("bao4s");

        words.getWordsStartWith("ak");

        assertEquals(testList, words.getWords());
    }
@Test
    public void testGetWordsWithLength(){
        List<String> testList = Arrays.asList("akos", "bkos");
        Words words = new Words();

        words.addWord("akos");
        words.addWord("bkos");
        words.addWord("bao4s");

        words.getWordsWithLength(4);

        assertEquals(testList, words.getWords());
    }

}
