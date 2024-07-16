public class hm_18 {
    public static void main(String[] args) {
        // 建立一個3x3x3的三維數組
        int[][][] array3D = {{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
                             {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}},
                             {{19, 20, 21}, {22, 23, 24}, {25, 26, 27}}};

        for (int z = 0; z < array3D.length; z++) {
            int sum = 0;
            for (int i = 0; i < array3D[z].length; i++) {
                for (int j = 0; j < array3D[z][i].length; j++) {
                    sum += array3D[z][i][j];
                }
            }
            double average = (double) sum / (array3D[z].length * array3D[z][0].length);
            System.out.println("The average value of " + (z + 1) + " row is " + average);
        }
    }
}
