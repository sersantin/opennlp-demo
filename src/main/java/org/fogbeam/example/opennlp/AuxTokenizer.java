package org.fogbeam.example.opennlp;

import opennlp.tools.tokenize.Tokenizer;
import opennlp.tools.tokenize.TokenizerME;
import opennlp.tools.tokenize.TokenizerModel;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public final class AuxTokenizer {

    private static final String ENGLISH_MODEL_PATH = "models/en-token.model";

    private AuxTokenizer() { }

    public static String[] tokenize(final String s) {

     InputStream modelIn = null;
     String[] tokens = new String[0];
     String inputString = s;
     if (inputString == null) {
        inputString = "";
     }
     try {
        modelIn = new FileInputStream(AuxTokenizer.ENGLISH_MODEL_PATH);
        TokenizerModel model = new TokenizerModel( modelIn );
        Tokenizer tokenizer = new TokenizerME(model);
        tokens = tokenizer.tokenize(inputString);
        } catch (final FileNotFoundException e) {
            e.printStackTrace();
        } catch (final IOException ioe) {
            ioe.printStackTrace();
        }

        return tokens;

    }
}

