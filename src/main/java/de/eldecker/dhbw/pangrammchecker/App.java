package de.eldecker.dhbw.pangrammchecker;

import static de.eldecker.dhbw.pangrammchecker.engine.AlphabetEnum.ALPHABET_ENGLISCH;
import static de.eldecker.dhbw.pangrammchecker.engine.AlphabetEnum.ALPHABET_DEUTSCH_UMLAUTE_UND_ESZETT;
import static de.eldecker.dhbw.pangrammchecker.engine.PangrammChecker.istPangramm;

import de.eldecker.dhbw.pangrammchecker.engine.AlphabetEnum;

public class App  {

    public static void pruefeObPangramm(String text, AlphabetEnum alphabet) {

        boolean ergebnis = istPangramm(text, alphabet);
        System.out.println("Ist '" + text + "' ein Pangramm? " + ergebnis + "\n");
    }

    public static void main( String[] args ) {

        System.out.println();

        String satz = "";

        // Beispiel von https://de.wikipedia.org/wiki/Pangramm#Englisch
        satz = "The quick brown fox jumps over the lazy dog";
        pruefeObPangramm(satz, ALPHABET_ENGLISCH);


        // Deutsche Beispiele von https://de.wikipedia.org/wiki/Pangramm#Liste_deutscher_Pangramme

        satz = "Franz jagt im komplett verwahrlosten Taxi quer durch Bayern";
        pruefeObPangramm(satz, ALPHABET_ENGLISCH);


        satz = "Falsches Üben von Xylophonmusik quält jeden größeren Zwerg";
        pruefeObPangramm(satz, ALPHABET_DEUTSCH_UMLAUTE_UND_ESZETT);

        System.out.println();
    }

}
