
package org.fogbeam.example.opennlp;

import org.fogbeam.example.opennlp.AuxTokenizer;
import java.io.*;

public class TokenizerMain {
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
