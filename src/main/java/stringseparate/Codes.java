package stringseparate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Codes
{
    List<String> originalList = new ArrayList<>();

    List<String> newList = new ArrayList<>();

    public String getCodesStartWithLetter(List<String> originalList){


        for (int i = 0; i< originalList.size(); i++){
            if (Character.isAlphabetic(originalList.get(i).charAt(0))) {
                newList.add(originalList.get(i));
            }
        }
        return newList.toString();

    }

    public static void main(String[] args) {
        Codes codes = new Codes();
        List<String> originalList = Arrays.asList("jdlasj", "8z897", "s122", "kkllk222");
        codes.getCodesStartWithLetter(originalList);
        System.out.println();

    }
}
