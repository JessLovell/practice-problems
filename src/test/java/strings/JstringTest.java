package strings;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class JstringTest {

    @Test
    public void testReverse() {
        assertEquals(Jstring.reverse("Hello"), "olleH");
        assertEquals(Jstring.reverse("Jessica"), "acisseJ");
        assertEquals(Jstring.reverse("ABCDEFGHIJKLMNOPQRSTUVWXYZ"), "ZYXWVUTSRQPONMLKJIHGFEDCBA");
        assertEquals(Jstring.reverse("o"), "o");
        assertEquals(Jstring.reverse(""), "");
    }

    @Test
    public void testFirstNonRepeatedChar() {
        assertEquals(Jstring.firstNonRepeatedChar("Hello"), "H");
        assertEquals(Jstring.firstNonRepeatedChar("lleellloop"), "p");
        assertEquals(Jstring.firstNonRepeatedChar("lollipop"), "i");
        assertEquals(Jstring.firstNonRepeatedChar("l"), "l");
        assertEquals(Jstring.firstNonRepeatedChar(""), "");
    }

    @Test
    public void testPrintDups() {
        assertEquals(Jstring.printDups("Hello"), "l");
        assertEquals(Jstring.printDups("lleellloop"), "leo");
        assertEquals(Jstring.printDups("lollipop"), "lop");
        assertEquals(Jstring.printDups("aaaaaaaaaaAAaaaaaaaaaa"), "aA");
        assertEquals(Jstring.printDups(""), "");
        assertEquals(Jstring.printDups("q"), "");
        assertEquals(Jstring.printDups("qq"), "q");
    }

    @Test
    public void testTwoWordsAnagrams() {
        assertTrue(Jstring.twoWordsAnagrams("Hello", "Hello"));
        assertTrue(Jstring.twoWordsAnagrams("Hello", "Heoll"));
        assertTrue(Jstring.twoWordsAnagrams("Hello", "leHlo"));
        assertTrue(Jstring.twoWordsAnagrams("jessica", "esicajs"));


        assertFalse(Jstring.twoWordsAnagrams("Hello", "Hellop"));
        assertFalse(Jstring.twoWordsAnagrams("Hello", "HelLo"));
        assertFalse(Jstring.twoWordsAnagrams("Hello", "Helll"));
        assertFalse(Jstring.twoWordsAnagrams("Hello", "tulip"));
    }

    @Test
    public void testCountVowels() {
        assertEquals(Jstring.countVowels("Jessica"), "vowels: 3, consonants: 4");
        assertEquals(Jstring.countVowels("Hello"), "vowels: 2, consonants: 3");
        assertEquals(Jstring.countVowels("eia"), "vowels: 3, consonants: 0");
        assertEquals(Jstring.countVowels("Jssc"), "vowels: 0, consonants: 4");
        assertEquals(Jstring.countVowels("eiaeiaJssc"), "vowels: 6, consonants: 4");
        assertEquals(Jstring.countVowels(""), "vowels: 0, consonants: 0");
        assertEquals(Jstring.countVowels("i"), "vowels: 1, consonants: 0");
        assertEquals(Jstring.countVowels("j"), "vowels: 0, consonants: 1");

    }

    @Test
    public void testCountChar() {
        assertEquals(Jstring.countChar("Jessica", 's'), 2);
        assertEquals(Jstring.countChar("Jessica", 'J'), 1);
        assertEquals(Jstring.countChar("Jessica", 'e'), 1);
        assertEquals(Jstring.countChar("essssssssssiciicicicicsiisiscisi", 'J'), 0);
        assertEquals(Jstring.countChar("essssssssssiciicicicicsiisiscisi", 'e'), 1);
        assertEquals(Jstring.countChar("essssssssssiciicicicicsiisiscisi", 's'), 14);
        assertEquals(Jstring.countChar("essssssssssiciicicicicsiisiscisi", 'i'), 11);
        assertEquals(Jstring.countChar("", 'J'), 0);
    }
}