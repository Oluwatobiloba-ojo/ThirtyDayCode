public class TransposeMatrix {

    public static int[][] transpose(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];
        for (int count = 0; count < result.length; count++){
            for (int index = 0; index < result[count].length; index++) {
                result[count][index] = matrix[index][count];
            }
        }
        return result;
    }
}
