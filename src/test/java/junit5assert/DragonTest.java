package junit5assert;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

public class DragonTest {

    @Test
    public void testName() {
    Dragon dragon = new Dragon("MugliDragon", 1, 30);
    String name = dragon.name;
    assertEquals("MugliDragon",dragon.getName());
    assertNotSame("MugliDragon2", dragon.getName());

    }


  //  @Test




}
