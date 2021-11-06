package junit5assert;

import org.junit.Test;

import static org.junit.Assert.*;

public class DragonTest {

    @Test
    public void testName() {
    Dragon dragon = new Dragon("MugliDragon", 1, 30);
    String name = dragon.name;
    assertEquals("MugliDragon",dragon.getName());
    assertNotSame("MugliDragon2", dragon.getName());

    }


    @Test
    public void testNumberOfHeads() {
        Dragon dragon = new Dragon("MugliDragon", 1, 30);
        String name = dragon.name;
        int head = dragon.getNumberOfHeads();
        assertEquals(1, dragon.getNumberOfHeads());
        assertTrue(dragon.getNumberOfHeads() == 1);
        assertFalse(dragon.getNumberOfHeads() == 2);

    }


    @Test
    public void testHeight() {
        Dragon dragon = new Dragon("MugliDragon", 1, 30);
        double height = dragon.getHeight();
        int head = dragon.getNumberOfHeads();
        assertEquals(30, dragon.getHeight(), 0.005);

    }

    @Test
    public void testNull() {
        Dragon dragon = new Dragon("MugliDragon", 1, 30);
        Dragon dragon2 = null;
assertNull(dragon2);
assertNotNull(dragon);
    }





}
