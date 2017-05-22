package test;

import junit.framework.TestCase;
import org.fogbeam.example.opennlp.AuxTokenizer;

public class AuxTokenizerTestCase extends TestCase {

    public void testNullInput() {
        String[] tokens = AuxTokenizer.tokenize(null);

        assertEquals(0, tokens.length);
    }

    public void testEmptyInput() {
        final String emptyString = "";
        String[] tokens = AuxTokenizer.tokenize(emptyString);

        assertEquals(0, tokens.length);
    }

    public void testText() {
        final String inputText = "How careful was I when I took my way,\n" +
                "Each trifle under truest bars to thrust,\n" +
                "That to my use it might unused stay\n" +
                "From hands of falsehood, in sure wards of trust!\n" +
                "But thou, to whom my jewels trifles are,\n" +
                "Most worthy comfort, now my greatest grief,\n" +
                "Thou best of dearest, and mine only care,\n" +
                "Art left the prey of every vulgar thief.\n" +
                "Thee have I not locked up in any chest,\n" +
                "Save where thou art not, though I feel thou art,\n" +
                "Within the gentle closure of my breast,\n" +
                "From whence at pleasure thou mayst come and part,\n" +
                "And even thence thou wilt be stol'n I fear,\n" +
                "For truth proves thievish for a prize so dear.";
        String[] tokens = AuxTokenizer.tokenize(inputText);

        assertEquals(135, tokens.length);
    }
}