public class InsertionSort {
    public static void main(String[] args) {
        int[] sortedList = insertionSort(new int[]{9,1,3,2,4,2,1});
        for (int value : sortedList) {
            System.out.println(value);
        }
    }

    private static int[] insertionSort(int[] unsorted){
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
