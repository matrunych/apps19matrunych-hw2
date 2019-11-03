package ua.edu.ucu.collections.immutable;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ImmutableLinkedListTest {

    @Test
    public void testAdd() {
        ImmutableLinkedList newLst = new ImmutableLinkedList();
        newLst = newLst.add(1);
        newLst = newLst.add(2);
        newLst = newLst.add(3);
        ImmutableList actualResult = newLst;
        assertEquals("1 2 3 ", actualResult.toString());
    }

    @Test
    public void testAdd2() {
        ImmutableList newLst = new ImmutableLinkedList();
        newLst = newLst.add(1);
        newLst = newLst.add(2);
        newLst = newLst.add(3);
        ImmutableList lst2 = newLst.add(4);
        lst2 = lst2.add(5);
        ImmutableList actualResult = lst2;
        assertEquals("1 2 3 4 5 ", actualResult.toString());
    }

    @Test
    public void testAddIndex() {
        ImmutableList newLst = new ImmutableLinkedList();
        newLst = newLst.add(1);
        newLst = newLst.add(2);
        newLst = newLst.add(3);
        newLst = newLst.add(0, 100);
        ImmutableList actualResult = newLst;
        assertEquals("100 1 2 3 ", actualResult.toString());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testIndex_Exception() {
        ImmutableList newLst = new ImmutableLinkedList();
        newLst = newLst.add(1);
        newLst = newLst.add(2);
        newLst = newLst.add(3);
        newLst = newLst.add(6, 100);

    }

    @Test
    public void testAddAll() {
        ImmutableList newLst = new ImmutableLinkedList();
        newLst = newLst.add(1);
        newLst = newLst.add(2);
        newLst = newLst.add(3);
        newLst = newLst.addAll(new Object[]{400, 500});
        ImmutableList actualResult = newLst;
        assertEquals("1 2 3 400 500 ", actualResult.toString());
    }

    @Test
    public void testAddAll2() {
        ImmutableList newLst = new ImmutableLinkedList();
        newLst = newLst.add(1);
        newLst = newLst.add(2);
        newLst = newLst.add(3);
        ImmutableList lst2 = newLst.addAll(new Object[]{400, 500, 700});
        lst2 = lst2.add(800);
        ImmutableList actualResult = lst2;
        assertEquals("1 2 3 400 500 700 800 ", actualResult.toString());
    }

    @Test
    public void testAddAllIndex() {
        ImmutableList newLst = new ImmutableLinkedList();
        newLst = newLst.add(1);
        newLst = newLst.add(2);
        newLst = newLst.add(3);
        newLst = newLst.addAll(1, new Object[]{400, 500});

        ImmutableList actualResult = newLst;
        assertEquals("1 400 500 2 3 ", actualResult.toString());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testAddAllIndex_Exception() {
        ImmutableList newLst = new ImmutableLinkedList();
        newLst = newLst.add(1);
        newLst = newLst.add(2);
        newLst = newLst.add(3);
        newLst = newLst.addAll(4, new Object[]{400, 500});
    }

    @Test
    public void testGet() {
        ImmutableList newLst = new ImmutableLinkedList();
        newLst = newLst.add(10);
        ImmutableList lst2 = newLst.add(20);
        lst2 = lst2.add(500);
        Object actualResult = lst2.get(0);
        assertEquals(10, actualResult);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGet_Exception() {
        ImmutableList newLst = new ImmutableLinkedList();
        newLst = newLst.add(1);
        newLst = newLst.add(2);
        newLst = newLst.add(3);
        newLst.get(4);
    }

    @Test
    public void testRemove() {
        ImmutableList newLst = new ImmutableLinkedList();
        ImmutableList lst2 = newLst.add(1);
        lst2 = lst2.add(2);
        lst2 = lst2.add(3);
        lst2 = lst2.add(500);
        Object actualResult = lst2.remove(3);
        assertEquals("1 2 3 ", actualResult.toString());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testRemove_Exception() {
        ImmutableList newLst = new ImmutableLinkedList();
        newLst = newLst.add(1);
        newLst = newLst.add(2);
        newLst = newLst.add(3);
        newLst.remove(7);
    }

    @Test
    public void testSet() {
        ImmutableList newLst = new ImmutableLinkedList();
        ImmutableList lst2 = newLst.add(1);
        lst2 = lst2.add(2);
        lst2 = lst2.add(3);
        lst2 = lst2.add(500);
        Object actualResult = lst2.set(2, 1000);
        assertEquals("1 2 1000 500 ", actualResult.toString());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSet_Exception() {
        ImmutableList newLst = new ImmutableLinkedList();
        newLst = newLst.add(1);
        newLst = newLst.add(2);
        newLst = newLst.add(3);
        newLst.set(7, 131);
    }

    @Test
    public void testIndexOf() {
        ImmutableList newLst = new ImmutableLinkedList();
        ImmutableList lst2 = newLst.add(1);
        lst2 = lst2.add(2);
        lst2 = lst2.add(3);
        lst2 = lst2.add(500);
        Object actualResult = lst2.indexOf(2);
        assertEquals(1, actualResult);
    }

    @Test
    public void testIndexOf_Exception() {
        ImmutableList newLst = new ImmutableLinkedList();
        ImmutableList lst2 = newLst.add(1);
        lst2 = lst2.add(2);
        lst2 = lst2.add(3);
        lst2 = lst2.add(500);
        Object actualResult = lst2.indexOf(2000);
        assertEquals(-1, actualResult);
    }

    @Test
    public void testSize() {
        ImmutableList newLst = new ImmutableLinkedList();
        newLst = newLst.add(1);
        newLst = newLst.add(2);
        newLst = newLst.add(3);
        Object actualResult = newLst.size();
        assertEquals(3, actualResult);
    }

    @Test
    public void testSize2() {
        ImmutableList newLst = new ImmutableLinkedList();
        newLst = newLst.add(1);
        newLst = newLst.add(2);
        newLst = newLst.remove(0);
        newLst = newLst.add(3);
        Object actualResult = newLst.size();
        assertEquals(2, actualResult);
    }

    @Test
    public void testClear() {
        ImmutableList newLst = new ImmutableLinkedList();
        newLst = newLst.add(1);
        newLst = newLst.add(2);
        newLst = newLst.add(3);
        Object actualResult = newLst.clear();
        assertEquals("", actualResult.toString());
    }

    @Test
    public void testEmpty() {
        ImmutableList newLst = new ImmutableLinkedList();
        boolean actualResult = newLst.isEmpty();
        assertEquals(true, actualResult);
    }

    @Test
    public void testEmpty2() {
        ImmutableList newLst = new ImmutableLinkedList();
        newLst = newLst.add(1);
        boolean actualResult = newLst.isEmpty();
        assertEquals(false, actualResult);
    }

    @Test
    public void testToArray() {
        ImmutableList newLst = new ImmutableLinkedList();
        newLst = newLst.add(1);
        newLst = newLst.add(2);
        Object[] actualResult = newLst.toArray();
        Object[] expected = {1, 2};
        assertEquals(Arrays.toString(expected), Arrays.toString(actualResult));
    }

    @Test
    public void testAddFirst() {
        ImmutableList newLst = new ImmutableLinkedList();
        newLst = newLst.add(1);
        newLst = newLst.add(2);
        newLst = newLst.add(1, 3);
        newLst = newLst.addAll(new Object[]{40, 50, 40});
        newLst = ((ImmutableLinkedList) newLst).addFirst("First");
        assertEquals("First 1 3 2 40 50 40 ", newLst.toString());
    }

    @Test
    public void testAddLast() {
        ImmutableList newLst = new ImmutableLinkedList();
        newLst = newLst.add(1);
        newLst = newLst.add(2);
        newLst = newLst.add(1, 3);
        newLst = newLst.addAll(new Object[]{40, 50, 40});
        newLst = ((ImmutableLinkedList) newLst).addLast("Last");
        assertEquals("1 3 2 40 50 40 Last ", newLst.toString());
    }

    @Test
    public void removeFirst(){
        ImmutableLinkedList newLst = new ImmutableLinkedList();
        newLst = newLst.add(2);
        newLst = newLst.add(100);
        newLst = newLst.add(1,3);
        newLst = newLst.removeFirst();
        assertEquals("3 100 ", newLst.toString());
    }
    @Test
    public void removeLast(){
        ImmutableLinkedList newLst = new ImmutableLinkedList();
        newLst = newLst.add(2);
        newLst = newLst.add(100);
        newLst = newLst.add(1,3);
        newLst = newLst.removeLast();
        assertEquals("2 3 ", newLst.toString());
    }
    @Test
    public void getFirst() {
        ImmutableList newLst = new ImmutableLinkedList();
        newLst = newLst.add(1);
        newLst = newLst.add(2);
        newLst = newLst.add(2, 3);
        Object actualResult = ((ImmutableLinkedList) newLst).getFirst();
        Object expected = "1";
        assertEquals(actualResult.toString(), expected.toString());
    }

    @Test
    public void getLast() {
        ImmutableList newLst = new ImmutableLinkedList();
        newLst = newLst.add(1);
        newLst = newLst.add(2);
        newLst = newLst.add(2, 3);
        Object actualResult = ((ImmutableLinkedList) newLst).getLast();
        Object expected = "3";
        assertEquals(actualResult.toString(), expected.toString());
    }
}