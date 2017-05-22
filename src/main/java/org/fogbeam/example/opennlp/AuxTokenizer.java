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

    public static void tokenize(final String s) {
        InputStream modelIn = null;
        try {
            modelIn = new FileInputStream(AuxTokenizer.ENGLISH_MODEL_PATH);
            TokenizerModel model = new TokenizerModel(modelIn);
            Tokenizer tokenizer = new TokenizerME(model);

            String[] tokens = tokenizer.tokenize(s);
            for (String token : tokens) {
                System.out.println(token);
            }
        } catch (final FileNotFoundException e) {
            e.printStackTrace();
        } catch (final IOException ioe) {
            ioe.printStackTrace();
        } finally {
            if (modelIn != null) {
                try {
                    modelIn.close();
                } catch (final IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("\n-----\ndone");
        }
    }
}

