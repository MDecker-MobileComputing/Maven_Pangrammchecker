package de.eldecker.dhbw.pangrammchecker;

public class PangrammChecker  {

    /**
     * Ein Pangramm ist ein Satz, der alle Buchstaben des Alphabets enthält.
     *
     * @param text String, der auf Pangramm-Eigenschaft zu prüfen ist
     */
    public boolean istPangramm(String text) {

        final String textNormalisiert = text.toLowerCase().trim();

        // Exception werfen, wenn Argument "text" null oder leer ist
        if (text == null || textNormalisiert.isEmpty()) {

            throw new IllegalArgumentException("Argument 'text' darf nicht null oder leer sein!");
        }

        return true;
    }

}
