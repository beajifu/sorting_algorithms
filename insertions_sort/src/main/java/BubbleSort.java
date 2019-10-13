class BubbleSort {
    static int[] bubbleSort(int[] unsorted){
        int changeCount = 1;
        while(changeCount>0) {
            changeCount = 0;
            for (int i = 1; i < unsorted.length; i++) {
                int elementBefore = unsorted[i - 1];
                int actualElement = unsorted[i];
                if (elementBefore > actualElement) {
                    unsorted[i - 1] = actualElement;
                    unsorted[i] = elementBefore;
                    changeCount++;
                }
            }
        }

        return unsorted;
    }
}
