import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstUniqueCharacterTest {

    @Test
    public void testThatTheUniqueCharacterInLeet_CodeTheIndexIs0(){
        String value = "leetcode";
        assertEquals(0, FirstUniqueCharacter.firstUniqueChar(value));
    }@Test
    public void testThatTheUniqueCharacterIn_aabbTheIndexIsMinusOne(){
        String value = "aabb";
        assertEquals(-1, FirstUniqueCharacter.firstUniqueChar(value));
    }@Test
    public void testThatTheUniqueCharacterIn_loveleetcodeTheIndexIs2(){
        String value = "loveleetcode";
        assertEquals(2, FirstUniqueCharacter.firstUniqueChar(value));
    }


}