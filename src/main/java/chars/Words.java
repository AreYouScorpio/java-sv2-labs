package chars;

import java.util.Arrays;
import java.util.Scanner;

public class Words {

    public String pushWord(String word){
        int length = word.length();
        char[] charList = word.toCharArray();
        for (int i=0; i<length; i++) {
            charList[i]++;

        }
        String newWord= new String(charList);
        return newWord;
    }

    public static void main(String[] args) {
        Words words = new Words();
        System.out.println(words.pushWord("hello"));

    }

}
