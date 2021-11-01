package chars;

import java.sql.Array;

public class Whitespace {

    public String makeWhitespaceToStar(String word) {
        int length = word.length();
        char[] wordInArray = word.toCharArray();
        for (int i = 0; i < length; i++) {
            if (Character.isWhitespace(wordInArray[i])) {
                wordInArray[i] = '*';
            }
            ;
        }
        String result = new String(wordInArray);
        return result;
    }

    public static void main(String[] args) {
        Whitespace whitespace = new Whitespace();
        System.out.println(whitespace.makeWhitespaceToStar("sziaa helloo hogy vaaagy"));
    }
}
