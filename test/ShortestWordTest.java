import Functions.ShortestWord;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShortestWordTest {

    @Test
    public void testThatTheSentenceReturnsShortestWord() {
        String sentence = "Java is a very interesting language";
        String actualValue = ShortestWord.findShortestWord(sentence);
        String expectedValue = "a";
        assertEquals(expectedValue, actualValue);sentence
    }
    @Test
    public void testThatSingleWordSentenceReturnsTheOnlyWord() {
        String sentence = "Nma";
        String actualValue = ShortestWord.findShortestWord(sentence);
        String expectedValue = "Nma";
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void testThatSentenceWithExtraSpacesReturnsShortestWord() {
        String sentence = "  Java   is   a   language  ";
        String actualValue = ShortestWord.findShortestWord(sentence);
        String expectedValue = "a";
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void testThatWhenANullSentenceIsWrittenItThrowsAnException() {
        String sentence = null;
        assertThrows(IllegalArgumentException.class, () ->
                ShortestWord.findShortestWord(sentence));
    }
    @Test
    public void testThatWhenAnEmptySentenceIsWrittenItThrowsAnException() {
        String sentence = "";
        assertThrows(IllegalArgumentException.class, () ->
                ShortestWord.findShortestWord(sentence));
    }

    @Test
    public void testThatWhenASentenceWithOnlySpacesItThrowsAnException() {
        String sentence = "   ";
        assertThrows(IllegalArgumentException.class, () ->
                ShortestWord.findShortestWord(sentence));
    }
}