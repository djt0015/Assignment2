import org.junit.*;

import static org.junit.Assert.assertEquals;

public class JUnitTest {
    int[] intArrayTest = new int[]{7,3,9,2,1};
    int[] intArrayEmpty;
    int[] intArrayNull = null;

    @Test
    public void test_findMax() {
        Finder find = new Finder();
        int expectedResult = 9;
        int actualResult = find.findMax(intArrayTest);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test_findMin() {
        Finder find = new Finder();
        int expectedResult = 1;
        int actualResult = find.findMin(intArrayTest);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void test_null_findMax() {
        Finder find = new Finder();
        Integer actualResult = find.findMax(intArrayNull);
        assertEquals(actualResult, null);
    }

    @Test
    public void test_null_findMin() {
        Finder find = new Finder();
        Integer actualResult = find.findMin(intArrayNull);
        assertEquals(actualResult, null);
    }

    @Test
    public void test_empty_findMax() {
        Finder find = new Finder();
        Integer actualResult = find.findMax(intArrayEmpty);
        assertEquals(actualResult, null);
    }

    @Test
    public void test_empty_findMin() {
        Finder find = new Finder();
        Integer actualResult = find.findMin(intArrayEmpty);
        assertEquals(actualResult, null);
    }



}
