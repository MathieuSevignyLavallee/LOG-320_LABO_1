package src;

import src.AlgoBinaire;
import src.AlgoBinaireModif;

public class RechercheTableau {
    public int RechercheLineaire(int[] tab, int n, int x) {
        return new AlgoLineaire().algo(tab, n, x);
    }

    public int RechercheBinaire(int[] tab, int n, int val) {
        return new AlgoBinaire().algo(tab, n, val);
    }

    public int RechercheBinaireModifie(int[] tab, int n, int val) {
        return new AlgoBinaireModif().algo(tab, n, val);
    }

}