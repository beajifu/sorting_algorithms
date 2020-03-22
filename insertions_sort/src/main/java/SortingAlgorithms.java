public class SortingAlgorithms {
    public static void main(String[] args) {
        int[] randomArray = RandomGenerator.getRandomList(100000);

        long timeStart = System.currentTimeMillis();
        int[] sortedList = InsertionSort.sort(randomArray);
        long timeEnd = System.currentTimeMillis();
        System.out.println(String.format("InsertionSort: %d ms", (timeEnd-timeStart)));

        timeStart = System.currentTimeMillis();
        sortedList = MergeSort.sort(randomArray);
        timeEnd = System.currentTimeMillis();
        System.out.println(String.format("MergeSort: %d ms", (timeEnd-timeStart)));

        timeStart = System.currentTimeMillis();
        sortedList = BubbleSort.sort(randomArray);
        timeEnd = System.currentTimeMillis();
        System.out.println(String.format("BubbleSort: %d ms", (timeEnd-timeStart)));


    }
}
