
package org.fogbeam.example.opennlp;

import org.fogbeam.example.opennlp.AuxTokenizer;
import java.io.*;

public class TokenizerMain {
    /**
     * Main Method of the project, Read a Input text file, and split all of words on it.
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        if (args.length > 0) {
            for (final String filePath : args) {
                //Read From File ==> RFF
                AuxTokenizer.tokenize(RFF(filePath));
            }
        } else {
            AuxTokenizer.tokenize("A ranger journeying with Oglethorpe, founder of the Georgia Colony, "
                    + " mentions \"three Mounts raised by the Indians over three of their Great Kings"
                    + " who were killed in the Wars.\"");
        }
    }

    /**
     * Read a TextFile in the filePath or launch a demo mode if you don't pass any arguments
     * @param filePath
     * @return
     */
    private static String RFF(final String filePath) {

        String Content = "";
        try {
                final InputStream input = new FileInputStream(filePath);
                final BufferedReader buff = new BufferedReader(new InputStreamReader(input));

                String line = buff.readLine();
                final StringBuilder stringBuilder = new StringBuilder();
                    while (line != null) {
                        stringBuilder.append(line).append("\n");
                        line = buff.readLine();
                    }
                Content = stringBuilder.toString();
            } catch (final FileNotFoundException e) {
                e.printStackTrace();
            } catch (final IOException ioe) {
                ioe.printStackTrace();
            }

        return Content;
    }

}
