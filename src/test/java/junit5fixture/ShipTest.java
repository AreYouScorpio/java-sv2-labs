package junit5fixture;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

import static org.junit.Assert.*;



public class ShipTest {

    Ship ship ;

    @BeforeEach
    public void init() {
       ship = new Ship("Muglihajó", 1999, 35);}



        @Test
        public void testName(){
            ship = new Ship("Muglihajó", 1999, 35);

            assertEquals("Muglihajó", ship.getName());
            assertNotSame("Muglihajo", ship.getName());}


            @Test
        public void testYearOfConstruction(){
            ship = new Ship("Muglihajó", 1999, 35);

            assertEquals(1999, ship.getYearOfConstruction());
            assertTrue(ship.getYearOfConstruction()==1999);
            assertFalse(ship.getYearOfConstruction()==2001);

    }

    @Test
    public void testLength(){
        ship = new Ship("Muglihajó", 1999, 35);

        assertEquals( 35, ship.getLength(), 0.005);

    }

    @Test
    public void testNull(){
        ship = new Ship("Muglihajó", 1999, 35);
        Ship ship2 = null;

        assertNull( ship2);
        assertNotNull(ship);

    }
    @Test
    public void testSameObjects(){
        ship = new Ship("Muglihajó", 1999, 35);
        Ship ship2 = ship;

        assertSame( ship, ship2);

    }

 @Test
    public void testNotSameObjects(){
        ship = new Ship("Muglihajó", 1999, 35);
        Ship ship2 = new Ship("Barbihajó", 2020,200);

        assertNotSame( ship, ship2);

    }








        }
