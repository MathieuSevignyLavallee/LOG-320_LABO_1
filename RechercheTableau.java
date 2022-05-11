public class RechercheTableau {
    public int RechercheLineaire(int[] tab, int n, int x) {
        return new AlgoLineaire(tab, n, x).algo();
    }

    public int RechercheBinaire(int[] tab, int n, int val) {
        return new AlgoBinaire(tab, n, val).algo();
    }

    public int RechercheBinaireModifie(int[] tab, int n, int val) {
        return new AlgoBinaireModif(tab, n, val).algo();
    }

}