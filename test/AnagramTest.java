import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    public void testRemoveDuplicate(){
        String word = "Hello";
        assertEquals("Helo", Anagram.removeDuplicate(word));
    }

    @Test
    public void testRemoveAnotherDuplicate(){
        String word = "Anagram";
        assertEquals("Anagrm", Anagram.removeDuplicate(word));
    }

    @Test
    public void testTheNumberOfTimesACharacterExist(){
        String word = "anagram";
        Map<String, Integer> value = Map.of("a", 3, "n", 1, "g", 1, "r", 1, "m", 1);
        assertEquals(value, Anagram.count(word));
    }

    @Test
    public void testThatAWordReturnNumberOfHowManyItIs(){
        String word = "anagram";
        assertEquals(3, Anagram.countChars(word, "a"));
    }

    @Test
    public void testThatIfTheLengthOfWordAreNotTheSameItIsNotAnAnagram(){
        String first = "anagram";
        String second = "nagrams";
        assertFalse(Anagram.isAnagram(first, second));
    }

    @Test
    public void testThatIfTheLengthIsSameAnSameLetterCanBeFoundInSameWords(){
        String first = "anagram";
        String second = "nagaram";
        assertTrue(Anagram.isAnagram(first, second));
    }

    @Test
    public void testWhenWordsAreSameLengthButItIsNotAnagram(){
        String first = "cat";
        String second = "rat";
        assertFalse(Anagram.isAnagram(first, second));
    }

    @Test
    public void testThatPlayersAndParsleyAreAnagram(){
        String first = "players";
        String second = "parsley";
        assertTrue(Anagram.isAnagram(first, second));
    }

    @Test
    public void testThatCiderAndCriedAreAnagram(){
        String first = "cider";
        String second = "cried";
        assertTrue(Anagram.isAnagram(first, second));
    }






}