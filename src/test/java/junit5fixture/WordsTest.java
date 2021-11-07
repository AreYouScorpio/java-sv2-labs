package junit5fixture;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class WordsTest {

    Words words;

    @Before
            public void init(){
     words = new Words();

       words.addWord("akos");
        words.addWord("bkos");
        words.addWord("bao4s");}

    @Test
    public void testGetWordsStartWith(){
        List<String> testList = Arrays.asList("akos");
        /*Words words = new Words();

        words.addWord("akos");
        words.addWord("bkos");
        words.addWord("bao4s");
*/
        words.getWordsStartWith("ak");

        assertEquals(testList, words.getWords());
    }
@Test
    public void testGetWordsWithLength(){
        List<String> testList = Arrays.asList("akos", "akos", "bkos"); // ha mind2 teszt lefut, ha nem külön csináljuk, 2x lesz az akos benne, az előző tesztből.. ha csak egyik tesztet futtatom, akkor 1x kell bele !!!
  /*      Words words = new Words();

        words.addWord("akos");
        words.addWord("bkos");
        words.addWord("bao4s");
*/
        words.getWordsWithLength(4);

        assertEquals(testList, words.getWords());
    }

}
