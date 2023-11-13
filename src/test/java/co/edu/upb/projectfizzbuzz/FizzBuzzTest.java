
package co.edu.upb.projectfizzbuzz;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

    private FizzBuzz game;
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    
    @Before
    public void before() {
      game = new FizzBuzz();
    } // public void before()

    @Test
    public void mustReturnNumbersWhenNotAMultipleOf3Or5() {
        assertEquals("1", game.getNumbers().get(0));
        assertEquals("2", game.getNumbers().get(1));
        assertEquals("13", game.getNumbers().get(12));
        assertEquals("8", game.getNumbers().get(7));
    } // public void mustReturnNumbersWhenNotAMultipleOf3Or5()

    @Test
    public void mustReturnFizzWhenAMultipleOf3() {
        assertEquals(FIZZ, game.getNumbers().get(2));
        assertEquals(FIZZ, game.getNumbers().get(5));
        assertEquals(FIZZ, game.getNumbers().get(8));
        assertEquals(FIZZ, game.getNumbers().get(11));
    } // public void mustReturnFizzWhenAMultipleOf3()
    
    @Test
    public void mustReturnBuzzWhenAMultipleOf5() {
        assertEquals(BUZZ, game.getNumbers().get(4));
        assertEquals(BUZZ, game.getNumbers().get(9));
        assertEquals(BUZZ, game.getNumbers().get(19));
        assertEquals(BUZZ, game.getNumbers().get(24));
    } // public void mustReturnBuzzWhenAMultipleOf5() 
    
    @Test
    public void mustReturnFizzBuzzWhenAMultipleOf3And5() {
        assertEquals(FIZZ + BUZZ, game.getNumbers().get(14));
        assertEquals(FIZZ + BUZZ, game.getNumbers().get(29));
        assertEquals(FIZZ + BUZZ, game.getNumbers().get(44));
        assertEquals(FIZZ + BUZZ, game.getNumbers().get(59));
    } // mustReturnFizzBuzzWhenAMultipleOf3And5()
    
} // public class FizzBuzzTest
