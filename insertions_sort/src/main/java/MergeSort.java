import java.util.Arrays;

public class MergeSort {
    public static int[] sort(int[] unsorted){
        // return if there is only one element in unsorted (end of recursion)
        if(unsorted.length<=1){
            return unsorted;
        }
        int m = unsorted.length/2;
        int[] left = sort(Arrays.copyOfRange(unsorted, 0, m));
        int[] right = sort(Arrays.copyOfRange(unsorted, m, unsorted.length));
        int[] sorted = new int[unsorted.length];
        int l = 0;
        int r = 0;
        for(int i=0; i<unsorted.length; i++){
            /*
                1. Check if end of left or right are reached. If yes, take element of other list
                2. If both lists have not reached end, then
             */
            if(l==left.length){
                sorted[i] = right[r];
                r++;
            }else if(r==right.length){
                sorted[i] = left[l];
                l++;
            }else {
                if (left[l] <= right[r]) {
                    sorted[i] = left[l];
                    l++;
                } else {
                    sorted[i] = right[r];
                    r++;
                }
            }
        }

        return sorted;
    }
}
