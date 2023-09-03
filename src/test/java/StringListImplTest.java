import exception.InvalidIndexException;
import exception.NuulItemException;
import org.junit.jupiter.api.Test;

import static constants.StringListImplTestConstants.*;

import static org.junit.jupiter.api.Assertions.*;

class StringListImplTest {
    private final StringListImpl out = new StringListImpl();

    @Test
    void shouldReturnCorrectResult_add() {
        String actual = out.add(ITEM1);
        assertEquals(ITEM1, actual);
    }

    @Test
    void shouldShouldThrow_NuulItemException_Exception_add() {
        assertThrows(NuulItemException.class, () -> out.add(ITEM2));
    }

    @Test
    void shouldReturnCorrectResult_add2() {
        String actual = out.add(INDEX1, ITEM1);
        assertEquals(ITEM1, actual);
    }

    @Test
    void shouldShouldThrow_InvalidIndexException_add2() {
        assertThrows(InvalidIndexException.class, () -> out.add(INDEX2, ITEM1));
    }

    @Test
    void shouldShouldThrow_NuulItemException_add2() {
        assertThrows(NuulItemException.class, () -> out.add(INDEX1, ITEM2));
    }

    @Test
    void shouldReturnCorrectResult_set() {
        String actual = out.set(INDEX1, ITEM1);
        assertEquals(ITEM1, actual);
    }

    @Test
    void shouldShouldThrow_Exception_set() {
        assertThrows(InvalidIndexException.class, () -> out.set(INDEX2, ITEM1));
        assertThrows(NuulItemException.class, () -> out.set(INDEX1, ITEM2));
    }

    @Test
    void shouldReturnCorrectResult_removeItem() {
        out.add(ITEM1);
        String actual = out.remove(ITEM1);
        assertEquals(ITEM1, actual);
    }

    @Test
    void shouldShouldThrow_NuulItemException_removeItem() {
        assertThrows(NuulItemException.class, () -> out.remove(ITEM2));
    }

    @Test
    void shouldReturnCorrectResult_removeIndex() {
        out.add(INDEX1, ITEM1);
        String actual = out.remove(INDEX1);
        assertEquals(ITEM1, actual);
    }

    @Test
    void shouldShouldThrow_NuulItemException_removeIndex() {
        assertThrows(InvalidIndexException.class, () -> out.remove(INDEX2));
    }

    @Test
    void shouldReturnCorrectResult_contains() {
        String actual = out.set(INDEX1, ITEM1);
        assertEquals(ITEM1, actual);
    }

    @Test
    void shouldReturnCorrectResult_indexOf() {
        out.add(ITEM1);
        int expected = 0;
        int actual = out.indexOf(ITEM1);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnCorrectResult_lastIndexOf() {
        out.add(ITEM1);
        int expected = 0;
        int actual = out.lastIndexOf(ITEM1);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnCorrectResult_get() {
        out.add(INDEX1, ITEM1);
        String actual = out.get(INDEX1);
        assertEquals(ITEM1, actual);
    }

    @Test
    void shouldShouldThrow_NuulItemException_get() {
        assertThrows(InvalidIndexException.class, () -> out.get(INDEX2));
    }

    @Test
    void testEquals() {
        StringListImpl stringList1 = new StringListImpl(1);
        StringListImpl stringList2 = new StringListImpl(1);
        StringListImpl stringList3 = new StringListImpl(2);

        stringList1.add(ITEM1);
        stringList2.add(ITEM1);
        stringList3.add(ITEM1);
        stringList3.add(ITEM3);

        assertTrue(stringList1.equals(stringList2));
        assertFalse(stringList1.equals(stringList3));
    }

    @Test
    void shouldReturnCorrectResult_size() {
        int actual = out.size();
        assertEquals(SIZE, actual);
    }

    @Test
    void isEmpty() {
        boolean expected = true;
        boolean actual = out.isEmpty();
        assertEquals(expected, actual);
    }

    @Test
    void testToArray() {
        StringListImpl stringList = new StringListImpl(1);
        stringList.add(ITEM1);

        String[] array = stringList.toArray();

        assertEquals(stringList.size(), array.length);

        for(String str: array) {
            assertTrue(stringList.contains(str));
        }
    }
}