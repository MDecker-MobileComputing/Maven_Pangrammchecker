package de.eldecker.dhbw.pangrammchecker.engine;

import static de.eldecker.dhbw.pangrammchecker.engine.AlphabetEnum.ALPHABET_DEUTSCH_UMLAUTE;
import static de.eldecker.dhbw.pangrammchecker.engine.AlphabetEnum.ALPHABET_DEUTSCH_UMLAUTE_UND_ESZETT;


/**
 * Die Klasse enthält eine Methode zum Prüfen, ob ein Text ein Pangramm ist.
 */
public class PangrammChecker  {

    /**
     * Prüft, ob der übergebene Text ein Pangramm ist. Ein Pangramm ist ein Satz, der
     * alle Buchstaben eines bestimmten Alphabets enthält.
     *
     * @param text String, der auf Pangramm-Eigenschaft zu prüfen ist
     * 
     * @param alphabet Alphabet, das für die Prüfung verwendet werden soll
     */
    public static boolean istPangramm( String text, AlphabetEnum alphabet ) {

        // Exception werfen, wenn Argument "text" null oder leer ist
        if ( text == null || text.isBlank() ) {

            throw new IllegalArgumentException( "Argument 'text' darf nicht null oder leer sein!" );
        }

        final String textNormalisiert = text.toLowerCase().trim();

        // über alle Zeichen von text iterieren
        for ( char zeichen = 'a'; zeichen <= 'z'; zeichen++ ) {

            // wenn das Zeichen nicht im Text vorkommt, ist es kein Pangramm
            if ( textNormalisiert.indexOf( zeichen ) < 0 ) {

                return false;
            }
        }

        // wenn ALPHABET_DEUTSCH_UMLAUTE, dann prüfe, ob ä, ö, ü im Text vorkommen
        if ( alphabet == ALPHABET_DEUTSCH_UMLAUTE ) {

            if ( textNormalisiert.indexOf( 'ä' ) < 0 || 
            	 textNormalisiert.indexOf( 'ö' ) < 0 || 
            	 textNormalisiert.indexOf( 'ü' ) < 0 ) {

                return false;
            }
        }

        // wenn ALPHABET_DEUTSCH_UMLAUTE_UND_ESZETT, dann prüfe, ob ß im Text vorkommt
        if ( alphabet == ALPHABET_DEUTSCH_UMLAUTE_UND_ESZETT ) {

            if ( textNormalisiert.indexOf( 'ß' ) < 0 ) {

                return false;
            }
        }

        return true;
    }

}
