package fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class FizzBuzzTest {

    @Test
    void shouldReturn1() {
        assertEquals("1", FizzBuzz.getReturnInt(1));
    }

    @Test
    void shouldReturn2() {
        assertEquals("2", FizzBuzz.getReturnInt(2));
    }

    @Test
    void shouldReturnFizz(){
        assertEquals("Fizz",FizzBuzz.getReturnInt(3));
    }

    @Test
    void shouldReturnBuzz(){
        assertEquals("Buzz",FizzBuzz.getReturnInt(5));
    }

    @Test
    void shouldReturnFizzBuzz(){
        assertEquals("FizzBuzz",FizzBuzz.getReturnInt(15));
    }

    @Test
    void shouldReturn0(){
        assertEquals("FizzBuzz",FizzBuzz.getReturnInt(0));
    }
}