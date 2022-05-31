package src;

// 2 sections tableau
public class AlgoBinaire {
    public int algo(int[] tab, int n, int val){
        return helper(tab,0, tab.length, val);
    }

    public int helper(int[] tab, int low, int high, int val){
        if(tab.length == 1){
            if (tab[0] == val){
                return 0;
            }else{
                return -1;
            }
        }

        int mid = low + (high - low) / 2;

        if(tab[mid] == val){
            return mid;
        }
        if(tab[mid] > val){
            return new AlgoBinaire().helper(tab,0, mid-1, val);
        }
        return new AlgoBinaire().helper(tab,mid+1, high, val);
    }
}
