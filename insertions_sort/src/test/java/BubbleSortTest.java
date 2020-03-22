import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class BubbleSortTest {
    @Test
    public void testBubbleSort(){
        int[] actualArray = BubbleSort.sort(new int[]{4,3,2,1});
        int[] expectedArray = {1,2,3,4};
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testBubbleSortSameNumber(){
        int[] actualArray = BubbleSort.sort(new int[]{4,4,3,3,2,1});
        int[] expectedArray = {1,2,3,3,4,4};
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testBubbleSortAlreadySorted(){
        int[] actualArray = BubbleSort.sort(new int[]{1,2,3,4});
        int[] expectedArray = {1,2,3,4};
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void testBubbleSortJustOneWrong(){
        int[] actualArray = BubbleSort.sort(new int[]{2,3,4,1});
        int[] expectedArray = {1,2,3,4};
        assertArrayEquals(expectedArray, actualArray);
    }
}
