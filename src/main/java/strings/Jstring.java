package strings;

import java.util.HashMap;
import java.util.HashSet;

public class Jstring {

    //reverse a string recursively
    public static String reverse(String str){
        return reverseHelper(str);
    }

    private static String reverseHelper(String str){
        if (str.length() <= 1){
            return str;
        }
        String s = reverseHelper(str.substring(0, str.length() - 1));
        return   str.charAt(str.length()-1) + s;
    }

    //print the first non-repeated character in a string.
    public static String firstNonRepeatedChar(String str){
        //check length
        if (str.length() <= 1){
            return str;
        }

        //Make Map of char & count
        HashMap<Character, Integer> seen = mapIt(str);

        //Loop thru string
        for (int i = 0; i < str.length(); i++){
            //if char has count of 1
            if (seen.get(str.charAt(i)) == 1){
                return str.charAt(i) + "";
            }
        }
        return "";
    }

    //print the duplicate characters of a String
    public static String printDups(String str){

        //put chars in a map
        HashMap<Character, Integer> map = mapIt(str);

        HashSet<Character> seen = new HashSet<>();

        StringBuilder ans = new StringBuilder();
        //check map for counts > 1
        for (int i = 0; i < str.length(); i++){
            if (map.get(str.charAt(i)) > 1 && !seen.contains(str.charAt(i))){
                ans.append(str.charAt(i));
            }
            seen.add(str.charAt(i));
        }

        return ans + "";
    }


    //function to count the characters in a string
    private static HashMap<Character, Integer> mapIt(String str){

        HashMap<Character, Integer> seen = new HashMap<>();
        for (int i = 0; i < str.length(); i++){
            if (seen.containsKey(str.charAt(i))){
                int update = seen.get(str.charAt(i));
                seen.put(str.charAt(i), update + 1);
            } else {
                seen.put(str.charAt(i), 1);
            }
        }
        return seen;
    }
}


