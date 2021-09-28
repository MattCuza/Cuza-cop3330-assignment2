package ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void isAnagram() {
        assertEquals(true, Anagram.isAnagram("note","tone"));
    }

    @Test
    void main() {
    }
}