package junit5fixture;

import java.util.List;
import java.util.ArrayList;



public class Words {
    public static List<String> words = new ArrayList<>();

    public List<String> getWords() {
        return words;
    }

    public void addWord(String word) {
        words.add(word);
    }

    public void getWordsStartWith(String prefix) {
        List<String> wordsToRemove = new ArrayList<>();
        for (String s : words) {
            if (!s.startsWith(prefix)) {
                wordsToRemove.add(s);
            }
        }
        words.removeAll(wordsToRemove);
    }
    public void getWordsWithLength(int length) {
        List<String> wordsToRemove = new ArrayList<>();
        for (String s : words) {
            if (s.length()!=length) {
                wordsToRemove.add(s);
            }
        }
        words.removeAll(wordsToRemove);
    }





    /*public static void main(String[] args) {
        System.out.println(words);
        Words words = new Words();
        words.addWord("akos");
        words.addWord("bkos");
        words.addWord("bao4s");
        System.out.println(words.getWords());
        words.getWordsStartWith("ak");
        System.out.println(words.getWords());
        words.addWord("bkos");
        words.addWord("bao4s");
        words.getWordsWithLength(4);
        System.out.println(words.getWords());


    } */
    }


