package de.eldecker.dhbw.pangrammchecker;

import static de.eldecker.dhbw.pangrammchecker.engine.PangrammChecker.istPangramm;

public class App  {

    public static void main( String[] args ) {

        final String text1 = "The quick brown fox jumps over the lazy dog";
        System.out.println("\nIst '" + text1 + "' ein Pangramm? " + istPangramm(text1) + "\n");

        final String text2 = "Falsches Üben von Xylophonmusik quält jeden größeren Zwerg.";
        System.out.println("\nIst '" + text2 + "' ein Pangramm? " + istPangramm(text1) + "\n");
    }

}
