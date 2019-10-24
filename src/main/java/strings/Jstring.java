package strings;

import java.util.HashMap;

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
        HashMap<Character, Integer> seen = new HashMap();
        for (int i = 0; i < str.length(); i++){
            if (seen.containsKey(str.charAt(i))){
                int update = seen.get(str.charAt(i));
                seen.put(str.charAt(i), update + 1);
            } else {
                seen.put(str.charAt(i), 1);
            }
        }

        //Loop thru string
        for (int i = 0; i < str.length(); i++){
            //if char has count of 1
            if (seen.get(str.charAt(i)) == 1){
                return str.charAt(i) + "";
            }
        }
        return "";
    }
}


