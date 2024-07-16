public class hm_14 {
    public static void main(String[] args) {

        int[][] array = {{1, 2, 3},
                          {4, 5, 6},
                          {7, 8, 9}};

        int[][] transpose = new int[3][3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                transpose[j][i] = array[i][j];
            }
        }

        System.out.println("Original array:");
        printMatrix(array);
        System.out.println("Transpose the array:");
        printMatrix(transpose);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}

