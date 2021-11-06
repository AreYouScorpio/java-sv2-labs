package junit5assert;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumbersTest {

    @Test
    public void testGetEvenNumbers(){
        Numbers number = new Numbers();
        int [] numbers = new int [] {2,4,5,6};
        int [] expected = new int[] {2,4,0,6};
        assertArrayEquals(expected, number.getEvenNumbers(numbers));
    }
}
