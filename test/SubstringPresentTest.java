import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubstringPresentTest {


    @Test
    public void testForSubstringIsPresentInTheReverseForm(){
        String word = "leetcode";
        /**
         * l-e-e-t-c-o-d-e
         * le, ee, et, tc, co, od, de
         * 01 -> 12 -> 23 -> 34 -> 45 -> 56 -> 67
         * 0 -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7
         * e-d-o-c-t-e-e-l
         * ed, do, oc, ct, te, ee, el
        **/
        assertTrue(SubstringPresent.isSubstringPresent(word));
    }

    @Test
    public void testForSubstringIsPresentInTheReverseForm2(){
        String word = "abcba";
        assertTrue(SubstringPresent.isSubstringPresent(word));
    }

    @Test
    public void testForSubstringIsNotPresentInTheReverseForm(){
        String word = "abcd";
        assertFalse(SubstringPresent.isSubstringPresent(word));
    }


}