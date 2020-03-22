public class InsertionSort {

    static int[] sort(int[] unsorted){
        int[] sorted = new int[unsorted.length];
        sorted[0] = unsorted[0];
        for(int i=1; i<unsorted.length; i++){
            int insertValue = unsorted[i];
            int j = i;
            while(j>0 && sorted[j-1]>insertValue){
                sorted[j] = sorted[j-1];
                j--;
            }
            sorted[j] = insertValue;
        }

        return sorted;
    }


}
