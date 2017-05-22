
package org.fogbeam.example.opennlp;

import org.fogbeam.example.opennlp.AuxTokenizer;

public class TokenizerMain
{
	public static void main( String[] args ) throws Exception
	{

		AuxTokenizer.tokenize
				(  "A ranger journeying with Oglethorpe, founder of the Georgia Colony, "
						+ " mentions \"three Mounts raised by the Indians over three of their Great Kings"
						+ " who were killed in the Wars.\"" );
	}
}
