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

    //Check if two strings are annagrams
    public static boolean twoWordsAnagrams(String str1, String str2){
        //check if lengths ==
        if (str1.length() != str2.length()){
            return false;
        }
        //Hashmap str1
        HashMap<Character, Integer> map = mapIt(str1);

        //forloop str 2
        for (int i = 0; i < str2.length(); i++) {
            //char is not in map, or the count is already 0
            if (!map.containsKey(str2.charAt(i))) {
                return false;
            }
            int update = map.get(str2.charAt(i));
            if (update < 2) {
                map.remove(str2.charAt(i));
            } else {
                //subrtact count from map1
                map.put(str2.charAt(i), update - 1);
            }
        }
        //if the map has stuff --> false
        if (map.keySet().size() > 0){
            return false;
        }
        return true;
    }

    //count the vowels and consonants in a String
    //I am making an assumption that a,e,i,o,u are vowels and providing one count
    //I am assuming that there are no special characters, spaces, or numbers in my string
    public static String countVowels(String str){

        //vowel count
        int vowel = 0;
        //consonant count
        int consonant = 0;
        //Loop thru string
        for (int i = 0 ; i < str.length(); i++){
            //if aieou --> increment vowel
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                vowel++;
            }
            //else --> increment consonant
            else {
                consonant++;
            }
        }

        return "vowels: " + vowel + ", consonants: " + consonant;
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


