package roman;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ConvRomanTest {

    @BeforeEach

    @Test
    void shouldReturn0WhenStringIsEmpty() {
        assertEquals(0, ConvRoman.romanToInt(""));
    }

    @Test
    void shouldReturn1WhenStringIsI() {
        assertEquals(1, ConvRoman.romanToInt("I"));
    }

    @Test
    void shouldReturn5WhenStringIsV() {
        assertEquals(5, ConvRoman.romanToInt("V"));
    }

    @Test
    void shouldReturn10WhenStringIsX() {
        assertEquals(10, ConvRoman.romanToInt("X"));
    }

    @Test
    void shouldReturn50WhenStringIsL() {
        assertEquals(50, ConvRoman.romanToInt("L"));
    }

    @Test void shouldReturn100WhenStringIsC() {
        assertEquals(100, ConvRoman.romanToInt("C"));
    }

    @Test
    void shouldReturn500WhenStringIsD() {
        assertEquals(500, ConvRoman.romanToInt("D"));
    }

    @Test
    void shouldReturn1000WhenStringIsM() {
        assertEquals(1000, ConvRoman.romanToInt("M"));
    }

    @Test
    void shouldThrowErrorWhenStringIsF(){
        assertThrows(LettreNomRomaineException.class, () -> ConvRoman.romanToInt("F"));
    }

    @Test
    void shouldReturn2WhenStringIsII() {
        assertEquals(2, ConvRoman.romanToInt("II"));
    }

    @Test
    void shouldReturn3WhenStringIsIII() {
        assertEquals(3, ConvRoman.romanToInt("III"));
    }

    @Test
    void shouldReturn4WhenStringIsIV() {
        assertEquals(4, ConvRoman.romanToInt("IV"));
    }

    @Test
    void shouldReturn9WhenStringIsIX() {
        assertEquals(9, ConvRoman.romanToInt("IX"));
    }

    @Test
    void shouldReturn90WhenStringIsXC() {
        assertEquals(90, ConvRoman.romanToInt("XC"));
    }
}