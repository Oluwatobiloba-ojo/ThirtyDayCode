import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReversePrefixOfWordTest {


    @Test
    public void testThatWhenGivenAWord_abcdefd_IsReverseByAPerfix_d_Gives_dcbaefd(){
        String word = "abcdefd";
        char ch = 'd';
        String result = "dcbaefd";
        assertEquals(result, ReversePrefixOfWord.reversePrefix(word, ch));
    }

    @Test
    public void testThatAnotherOneAgain(){
        String word = "xyxzxe";
        char ch = 'z';
        String result = "zxyxxe";
        assertEquals(result, ReversePrefixOfWord.reversePrefix(word, ch));
    }

    @Test
    public void testSomethingElseByMe(){
        String word = "abcd";
        char ch = 'z';
        String result = "abcd";
        assertEquals(result, ReversePrefixOfWord.reversePrefix(word, ch));
    }
}
