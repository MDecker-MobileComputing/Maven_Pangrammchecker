package de.eldecker.dhbw.pangrammchecker.test;

import static de.eldecker.dhbw.pangrammchecker.engine.AlphabetEnum.ALPHABET_DEUTSCH_UMLAUTE_UND_ESZETT;
import static de.eldecker.dhbw.pangrammchecker.engine.AlphabetEnum.ALPHABET_DEUTSCH_UMLAUTE;
import static de.eldecker.dhbw.pangrammchecker.engine.AlphabetEnum.ALPHABET_ENGLISCH;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse ;
import static de.eldecker.dhbw.pangrammchecker.engine.PangrammChecker.istPangramm;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class ParameterTest {
	
	/** 
	 * Tests mit Pangrammen ohne Umlaut und Scharf-s.
	 */
    @ParameterizedTest
    @ValueSource( strings = {
    	"Franz jagt im komplett verwahrlosten Taxi quer durch Bayern.",
        "Sylvia wagt quick den Jux bei Pforzheim.",
    	"Prall vom Whisky flog Quax den Jet zu Bruch.",
        "Stanleys Expeditionszug quer durch Afrika wird von jedermann bewundert."        
    })
    void pangrammeOhneUmlautUndScharfS( String text ) {
    	
    	final boolean check1 = istPangramm( text, ALPHABET_ENGLISCH );
    	assertTrue( check1 );
    	
    	final boolean check2 = istPangramm( text, ALPHABET_DEUTSCH_UMLAUTE );
    	assertFalse( check2 );
    	
    	final boolean check3 = istPangramm( text, ALPHABET_DEUTSCH_UMLAUTE_UND_ESZETT );
    	assertFalse( check3 );
    }

}
