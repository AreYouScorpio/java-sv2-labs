package junit5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GentlemanTest {

@Test
    public void testCreate(){
    // Given
    Gentleman gentleman = new Gentleman();
    // When
    String name = gentleman.sayHello("John Doe");
    // Then
    assertEquals("Hello John Doe", name);

}



}
