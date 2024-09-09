package utils;

import java.util.ArrayList;
import java.util.List;

public class AnagramGenerator {

    public static List<String> generateAnagram(String s){
        List<String> result = new ArrayList<>();
        generateAnagram("", s, result);
        System.out.println(result);
        return result;
    }

    private static void generateAnagram(String str, String remaining, List<String> result){
        if(remaining.isEmpty()){
            result.add(str);
        }

        char[] charArr = remaining.toCharArray();

        for(char ch: charArr) {
            StringBuffer sbAnagram = new StringBuffer(str).append(ch);
            StringBuffer sbRemaining = new StringBuffer(remaining).deleteCharAt(remaining.indexOf(ch));

            generateAnagram(sbAnagram.toString(), sbRemaining.toString(), result);
        }
    }
}
