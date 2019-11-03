package ua.edu.ucu.collections.immutable;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ImmutableArrayListTest {

    @Test
    public void testAdd() {
        ImmutableList newLst = new ImmutableArrayList();
        newLst = newLst.add(1);
        newLst = newLst.add(2);
        newLst = newLst.add(3);
        ImmutableList actualResult = newLst;
        assertEquals("1 2 3 ", actualResult.toString());
    }

    @Test
    public void testAddIndex() {
        ImmutableList newLst = new ImmutableArrayList();
        newLst = newLst.add(0, 4);
        newLst = newLst.add(1, 9);
        newLst = newLst.add(2, 34);
        newLst = newLst.add(50);
        newLst = newLst.add(3, 6);

        ImmutableList actualResult = newLst;
        assertEquals("4 9 34 6 50 ", actualResult.toString());
    }


    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddIndex_Exception() {
        ImmutableList test = new ImmutableArrayList();
        test = test.add(1);
        test = test.add(2);
        test = test.add(3);
        test.add(4, 5);
    }

    @Test
    public void testAddAll() {
        ImmutableList newLst = new ImmutableArrayList();
        newLst = newLst.add(0, 1);
        newLst = newLst.addAll(new Integer[]{2, 3, 4, 5});
        ImmutableList actualResult = newLst;
        assertEquals("1 2 3 4 5 ", actualResult.toString());
    }

    @Test
    public void testAddAll2() {
        ImmutableList newLst = new ImmutableArrayList();
        newLst = newLst.addAll(new Integer[]{2, 3, 4, 5});
        ImmutableList actualResult = newLst;
        assertEquals("2 3 4 5 ", actualResult.toString());
    }

    @Test
    public void testAddAllIndex() {
        ImmutableList newLst = new ImmutableArrayList();
        newLst = newLst.add(1);
        newLst = newLst.add(2);
        newLst = newLst.add(3);
        newLst = newLst.addAll(0, new Integer[]{10, 20, 30});
        ImmutableList actualResult = newLst;
        assertEquals("10 20 30 1 2 3 ", actualResult.toString());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddAllIndex_Exception() {
        ImmutableList test = new ImmutableArrayList();
        test = test.add(1);
        test = test.add(2);
        test = test.add(3);
        test.addAll(4, new Integer[]{2, 4});
    }

    @Test
    public void testGet() {
        ImmutableList newLst = new ImmutableArrayList();
        newLst = newLst.add(0, 1);
        newLst = newLst.add(2);
        newLst = newLst.add(3);
        newLst = newLst.addAll(new Integer[]{10, 20, 30});
        Object actualResult = newLst.get(1);
        assertEquals(2, actualResult);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGet_Exception() {
        ImmutableList test = new ImmutableArrayList();
        test = test.add(1);
        test = test.add(2);
        test = test.add(3);
        test.get(3);
    }

    @Test
    public void testRemove() {
        ImmutableList newLst = new ImmutableArrayList();
        newLst = newLst.add(1);
        newLst = newLst.add(2);
        newLst = newLst.add(4);
        ImmutableList actualResult = newLst.remove(2);
        assertEquals("1 2 ", actualResult.toString());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemove_Exception() {
        ImmutableList newLst = new ImmutableArrayList();
        newLst = newLst.add(1);
        newLst = newLst.add(2);
        newLst = newLst.add(3);
        newLst.remove(3);
    }

    @Test
    public void testSet() {
        ImmutableList newLst = new ImmutableArrayList();
        newLst = newLst.add(0, 1);
        newLst = newLst.add(2);
        newLst = newLst.add(3);
        newLst = newLst.addAll(new Integer[]{10, 20, 30});
        ImmutableList actualResult = newLst.set(0, 100);
        assertEquals("100 2 3 10 20 30 ", actualResult.toString());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSet_Exception() {
        ImmutableList newLst = new ImmutableArrayList();
        newLst = newLst.add(1);
        newLst = newLst.add(2);
        newLst = newLst.add(3);
        newLst.set(3, 1000);
    }

    @Test
    public void testIndexOf() {
        ImmutableList newLst = new ImmutableArrayList();
        newLst = newLst.add(0, 1);
        newLst = newLst.add(2);
        newLst = newLst.add(3);
        newLst = newLst.addAll(new Integer[]{10, 20, 30});
        Object actualResult = newLst.indexOf(20);
        assertEquals(4, actualResult);
    }

    @Test
    public void testIndexOf2() {
        ImmutableList newLst = new ImmutableArrayList();
        newLst = newLst.add(0, 1);
        newLst = newLst.add(2);
        newLst = newLst.add(3);
        newLst = newLst.addAll(new Integer[]{10, 20, 30});
        Object actualResult = newLst.indexOf(100);
        assertEquals(-1, actualResult);
    }

    @Test
    public void testSize() {
        ImmutableList newLst = new ImmutableArrayList();
        newLst = newLst.add(0, 1);
        newLst = newLst.add(2);
        newLst = newLst.add(3);
        newLst = newLst.addAll(new Integer[]{10, 20, 30});
        int actualResult = newLst.size();
        assertEquals(6, actualResult);
    }

    @Test
    public void testSize2() {
        ImmutableList newLst = new ImmutableArrayList();
        newLst = newLst.add(0, 1);
        newLst = newLst.add(2);
        newLst = newLst.add(3);
        newLst = newLst.addAll(0, new Integer[]{10, 20, 30});
        int actualResult = newLst.size();
        assertEquals(6, actualResult);
    }

    @Test
    public void testClear() {
        ImmutableList newLst = new ImmutableArrayList();
        newLst = newLst.add(0, 1);
        newLst = newLst.add(2);
        newLst = newLst.add(3);
        String actualResult = newLst.clear().toString();
        assertEquals("", actualResult);
    }

    @Test
    public void testEmpty() {
        ImmutableList newLst = new ImmutableArrayList();
        newLst = newLst.add(0, 1);
        newLst = newLst.add(2);
        newLst = newLst.add(3);
        newLst = newLst.clear();
        boolean actualResult = newLst.isEmpty();
        assertTrue(actualResult);
    }

    @Test
    public void testEmpty2() {
        ImmutableList newLst = new ImmutableArrayList();
        newLst = newLst.add(0, 1);
        newLst = newLst.add(2);
        newLst = newLst.add(3);
        boolean actualResult = newLst.isEmpty();
        assertFalse(actualResult);
    }

    @Test
    public void testToArray() {
        ImmutableList newLst = new ImmutableArrayList();
        newLst = newLst.add(0, 1);
        newLst = newLst.add(2);
        newLst = newLst.add(3);
        assertEquals(Arrays.toString(new Object[]{1, 2, 3}), Arrays.toString(newLst.toArray()));
    }

}