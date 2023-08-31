import exception.InvalidIndexException;
import exception.NuulItemException;
import org.junit.jupiter.api.Test;

import static constants.StringListImplTestConstants.*;

import static org.junit.jupiter.api.Assertions.*;

class StringListImplTest {
    private final StringListImpl out = new StringListImpl();

    @Test
    void shouldReturnCorrectResult_add() {
        String expected = ITEM1;
        String actual = out.add(ITEM1);
        assertEquals(expected, actual);
    }

    @Test
    void shouldShouldThrow_NuulItemException_Exception_add() {
        assertThrows(NuulItemException.class, () -> out.add(ITEM2));
    }

    @Test
    void shouldReturnCorrectResult_add2() {
        String expected = ITEM1;
        String actual = out.add(INDEX1, ITEM1);
        assertEquals(expected, actual);
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
        String expected = ITEM1;
        String actual = out.set(INDEX1, ITEM1);
        assertEquals(expected, actual);
    }

    @Test
    void shouldShouldThrow_Exception_set() {
        assertThrows(InvalidIndexException.class, () -> out.set(INDEX2, ITEM1));
        assertThrows(NuulItemException.class, () -> out.set(INDEX1, ITEM2));
    }

    @Test
    void shouldReturnCorrectResult_removeItem() {
        String expected = ITEM1;
        out.add(ITEM1);
        String actual = out.remove(ITEM1);
        assertEquals(expected, actual);
    }

    @Test
    void shouldShouldThrow_NuulItemException_removeItem() {
        assertThrows(NuulItemException.class, () -> out.remove(ITEM2));
    }

    @Test
    void shouldReturnCorrectResult_removeIndex() {
        String expected = ITEM1;
        out.add(INDEX1, ITEM1);
        String actual = out.remove(INDEX1);
        assertEquals(expected, actual);
    }

    @Test
    void shouldShouldThrow_NuulItemException_removeIndex() {
        assertThrows(InvalidIndexException.class, () -> out.remove(INDEX2));
    }

    @Test
    void shouldReturnCorrectResult_contains() {
        String expected = ITEM1;
        String actual = out.set(INDEX1, ITEM1);
        assertEquals(expected, actual);
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
        String expected = ITEM1;
        out.add(INDEX1, ITEM1);
        String actual = out.get(INDEX1);
        assertEquals(expected, actual);
    }

    @Test
    void shouldShouldThrow_NuulItemException_get() {
        assertThrows(InvalidIndexException.class, () -> out.get(INDEX2));
    }

//    @Test
//    void testEquals() {
//        String[] temp = new String[1];
//        temp[0] = ITEM1;
//
//        out.add(ITEM1);
//
//        boolean expected = out.equals(StringList new );
//        String[] actual = out.toArray();
//
//        assertEquals(expected, actual);
//
//    }

    @Test
    void shouldReturnCorrectResult_size() {
        int expected = 0;
        int actual = out.size();
        assertEquals(expected, actual);
    }

    @Test
    void isEmpty() {
        boolean expected = true;
        boolean actual = out.isEmpty();
        assertEquals(expected, actual);
    }

//    @Test
//    void toArray() {
//        String[] temp1 = new String[1];
//        temp1[0] = ITEM1;
//        String[] expected = temp1;
//        out.add(ITEM1);
//
////        String[] expected= out.toArray();
//        String[] actual = out.toArray();
//
//        assertEquals(expected, actual);
//    }
}