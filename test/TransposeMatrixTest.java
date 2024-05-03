import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransposeMatrixTest {

    @Test
    public void testThatTheTransposeOfAnArrayReturnsTheArrayFlipped(){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] transposeMatrix = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        assertArrayEquals(transposeMatrix, TransposeMatrix.transpose(matrix));
    }

    @Test
    public void testThatTheTransposeOfAnArrayReturnTheArrayFlippedIn2By3(){
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] result = {{1, 4}, {2, 5}, {3, 6}};
        assertArrayEquals(result, TransposeMatrix.transpose(matrix));
    }

}

