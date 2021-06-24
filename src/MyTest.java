import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {
    Solutions s = new Solutions();

    @Test
    public void testIsPalindrome() {
        assertEquals(true, s.isPalindrome("asdsa"));
        assertEquals(false, s.isPalindrome("asdcsa"));
        assertEquals(true, s.isPalindrome("a"));
        assertEquals(false, s.isPalindrome("ab"));
        assertEquals(false, s.isPalindrome("abb"));
        assertEquals(true, s.isPalindrome(""));
    }

    @Test
    public void testMinSplit() {
        assertEquals(1, s.minSplit(50));
        assertEquals(1, s.minSplit(20));
        assertEquals(1, s.minSplit(10));
        assertEquals(1, s.minSplit(5));
        assertEquals(1, s.minSplit(1));
        assertEquals(5, s.minSplit(86));
        assertEquals(6, s.minSplit(87));
        assertEquals(0, s.minSplit(0));
    }

    @Test
    public void testNotContains() {
        int[] arr1 = {-1, 3, 1, 5, 7, 4, 8, 2};
        assertEquals(6, s.notContains(arr1));
        int[] arr2 = {-17, 2, 0, 4, 5, 8, -1};
        assertEquals(1, s.notContains(arr2));
        int[] arr3 = {1, 2, -3, 4, 0, 8, -1};
        assertEquals(3, s.notContains(arr3));
        int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8, 10, -1};
        assertEquals(9, s.notContains(arr4));
    }

    @Test
    public void testIsProperly() {
        assertEquals(true, s.isProperly("(())"));
        assertEquals(true, s.isProperly("()"));
        assertEquals(false, s.isProperly("("));
        assertEquals(false, s.isProperly(")"));
        assertEquals(false, s.isProperly("))(("));
        assertEquals(false, s.isProperly("(()))"));
    }

    @Test
    public void testCountVariants() {
        assertEquals(1, s.countVariants(1));
        assertEquals(2, s.countVariants(2));
        assertEquals(3, s.countVariants(3));
        assertEquals(5, s.countVariants(4));
        assertEquals(8, s.countVariants(5));
        assertEquals(21, s.countVariants(7));
        assertEquals(89, s.countVariants(10));
    }

    @Test
    public void testDataStruction() {
        myDataStructure mds = new myDataStructure();
        mds.add(10);
        assertEquals(true, mds.find(10));
        assertEquals(false, mds.find(15));
        mds.add(20);
        mds.add(30);
        mds.add(40);
        assertEquals(true, mds.find(30));
        assertEquals(false, mds.find(25));
        assertEquals(true, mds.find(20));
        mds.remove(20);
        assertEquals(false, mds.find(20));
        mds.add(25);
        assertEquals(true, mds.find(25));
        assertEquals(30, mds.getElem(2));
        assertEquals(3, mds.getIndex(25));
        assertEquals(0, mds.getIndex(10));
    }

    @Test
    public void testExchangeRate() {
        web cur = new web();
    }
}
