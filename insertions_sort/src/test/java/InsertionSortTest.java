import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class InsertionSortTest {
    @Test
    public void testInsertSort(){
        int[] actualArray = InsertionSort.insertionSort(new int[]{4,3,2,1});
        int[] expectedArray = {1,2,3,4};
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testInsertSortSameNumber(){
        int[] actualArray = InsertionSort.insertionSort(new int[]{4,4,3,3,2,1});
        int[] expectedArray = {1,2,3,3,4,4};
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testInsertSortAlreadySorted(){
        int[] actualArray = InsertionSort.insertionSort(new int[]{1,2,3,4});
        int[] expectedArray = {1,2,3,4};
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testInsertSortJustOneWrong(){
        int[] actualArray = InsertionSort.insertionSort(new int[]{2,3,4,1});
        int[] expectedArray = {1,2,3,4};
        assertArrayEquals(expectedArray, actualArray);
    }
}
