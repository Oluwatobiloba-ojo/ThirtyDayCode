import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PascalTriangleTest {

    @Test
    public void testThatPascalTriangleWasGivenOut(){
        int numsRow = 5;
        List<List<Integer>> result = List.of(
                List.of(1),
                List.of(1, 1),
                List.of(1, 2, 1),
                List.of(1, 3, 3, 1),
                List.of(1, 4, 6, 4, 1)
        );
        assertEquals(result, PascalTriangle.generate(numsRow));
    }

    @Test
    public void testThatPascalTriangleGivenOutINumRow1Is1(){
        int numRow = 1;
        List<List<Integer>> result = List.of(List.of(1));
        assertEquals(result, PascalTriangle.generate(numRow));
    }
}