package src;

// Itératif
public class AlgoLineaire {

    public int algo(int[] tab, int n, int val){
        for (int i = 0; i < n; i++) {
            if(tab[i] == val){
                return i;
            }
        }
        return -1;
    }
}
