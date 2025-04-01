package org.howard.edu.lsp.assignment6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntegerSetTest {
	
	@Test
    @DisplayName("Test case for clear")
    public void testClear() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        set.clear();
        assertTrue(set.isEmpty());
    }

    @Test
    @DisplayName("Test case for length")
    public void testLength() {
        IntegerSet set = new IntegerSet();
        assertEquals(0, set.length());
        set.add(1);
        set.add(2);
        assertEquals(2, set.length());
    }

    @Test
    @DisplayName("Test case for equals")
    public void testEquals() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(1);
        assertTrue(set1.equals(set2));
    }

    @Test
    @DisplayName("Test case for contains")
    public void testContains() {
        IntegerSet set = new IntegerSet();
        set.add(3);
        assertTrue(set.contains(3));
        assertFalse(set.contains(1));
    }

    @Test
    @DisplayName("Test case for largest and exception")
    public void testLargest() {
        IntegerSet set = new IntegerSet();
        assertThrows(IntegerSetException.class, () -> set.largest());
        set.add(1);
        set.add(5);
        set.add(3);
        try {
            assertEquals(5, set.largest());
        } catch (IntegerSetException e) {
            fail("Exception should not be thrown.");
        }
    }

    @Test
    @DisplayName("Test case for smallest and exception")
    public void testSmallest() {
        IntegerSet set = new IntegerSet();
        assertThrows(IntegerSetException.class, () -> set.smallest());
        set.add(1);
        set.add(5);
        set.add(3);
        try {
            assertEquals(1, set.smallest());
        } catch (IntegerSetException e) {
            fail("Exception should not be thrown.");
        }
    }

    @Test
    @DisplayName("Test case for add")
    public void testAdd() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(1); // Duplicate
        assertEquals(1, set.length());
    }

    @Test
    @DisplayName("Test case for remove")
    public void testRemove() {
        IntegerSet set = new IntegerSet();
        set.add(2);
        set.remove(2);
        assertFalse(set.contains(2));
    }

    @Test
    @DisplayName("Test case for union")
    public void testUnion() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1);
        set2.add(2);
        set1.union(set2);
        assertTrue(set1.contains(1));
        assertTrue(set1.contains(2));
    }

    @Test
    @DisplayName("Test case for intersection")
    public void testIntersect() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        set1.intersect(set2);
        assertTrue(set1.contains(2));
        assertEquals(1, set1.length());
    }

    @Test
    @DisplayName("Test case for difference")
    public void testDiff() {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set1.diff(set2);
        assertTrue(set1.contains(1));
        assertFalse(set1.contains(2));
    }

    @Test
    @DisplayName("Test case for complement")
    public void testComplement() {
        IntegerSet universal = new IntegerSet();
        universal.add(1);
        universal.add(2);
        universal.add(3);

        IntegerSet subset = new IntegerSet();
        subset.add(2);
        subset.add(3);

        subset.complement(universal);

        assertTrue(subset.contains(1));
        assertFalse(subset.contains(2));
        assertFalse(subset.contains(3));
    }

    @Test
    @DisplayName("Test case for isEmpty")
    public void testIsEmpty() {
        IntegerSet set = new IntegerSet();
        assertTrue(set.isEmpty());
        set.add(1);
        assertFalse(set.isEmpty());
    }

    @Test
    @DisplayName("Test case for toString")
    public void testToString() {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        String str = set.toString();
        assertTrue(str.contains("1") && str.contains("2"));
    }
}
