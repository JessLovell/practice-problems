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
}