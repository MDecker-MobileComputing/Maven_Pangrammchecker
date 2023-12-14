package de.eldecker.dhbw.pangrammchecker.engine;


public class PangrammChecker  {

    /**
     * Ein Pangramm ist ein Satz, der alle Buchstaben des Alphabets enthält.
     *
     * @param text String, der auf Pangramm-Eigenschaft zu prüfen ist
     */
    public static boolean istPangramm(String text, AlphabetEnum alphabet) {

        // Exception werfen, wenn Argument "text" null oder leer ist
        if (text == null || text.isBlank()) {

            throw new IllegalArgumentException("Argument 'text' darf nicht null oder leer sein!");
        }

        final String textNormalisiert = text.toLowerCase().trim();

        // über alle Zeichen von text iterieren
        for (char zeichen = 'a'; zeichen <= 'z'; zeichen++) {

            // wenn das Zeichen nicht im Text vorkommt, ist es kein Pangramm
            if (textNormalisiert.indexOf(zeichen) < 0) {

                return false;
            }
        }

        // wenn deutsches Alphabet mit Umlauten und ß gewählt wurde, dann noch diese prüfen
        if (alphabet == AlphabetEnum.ALPHABET_DEUTSCH_UMLAUTE_UND_ESZETT) {

            // über alle Zeichen von text iterieren
            for (char zeichen : "äöüß".toCharArray()) {

                // wenn das Zeichen nicht im Text vorkommt, ist es kein Pangramm
                if (textNormalisiert.indexOf(zeichen) < 0) {

                    return false;
                }
            }
        }

        return true;
    }

}
