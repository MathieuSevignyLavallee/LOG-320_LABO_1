package src;

import src.RechercheTableau;

public class main {

    public static void main(String[] args)  //static method
    {
        // RechercheTableau
        RechercheTableau recherche = new RechercheTableau();

        // tableau
        int tab0[] = {37, 1, 6, 8, 2, 0, 3, 4, 8, 10, 88, 32, 54, 16};
        int tab1[]= new int[9999999];
        for (int i = 0; i < 9999999; i++) {
            tab1[i] = i+8;
        }

        // Lineaire
        long startTime = System.nanoTime();
        int rep = recherche.RechercheLineaire(tab0, tab0.length, 88);
        long endTime = System.nanoTime();
        System.out.println("trouver: 88 -> " + rep  + " temps : " + (endTime - startTime));


        // Binaire (avec tableau trier)
        startTime = System.nanoTime();
        rep = recherche.RechercheBinaire(tab1, tab1.length, 3017);
        endTime = System.nanoTime();
        System.out.println("trouver: 77777 -> " + rep  + " temps : " + (endTime - startTime));


        // Binaire Modifier
    }
}

