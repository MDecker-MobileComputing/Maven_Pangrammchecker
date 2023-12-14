package de.eldecker.dhbw.pangrammchecker;

import static de.eldecker.dhbw.pangrammchecker.engine.PangrammChecker.istPangramm;


public class App  {

    public static void main( String[] args ) {

        final String text = "The quick brown fox jumps over the lazy dog";

        System.out.println("Ist '" + text + "' ein Pangramm? " + istPangramm(text));
    }

}
