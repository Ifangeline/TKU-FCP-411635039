public class hm_17 {
    public static void main(String[] args) {

        int[][][] array3D = {{{1, 2}, {3, 4}},
                             {{5, 6}, {7, 8}}};

        int modifyX = 0;
        int modifyY = 1;
        int modifyZ = 0;
        int newValue = 10;

        array3D[modifyX][modifyY][modifyZ] = newValue;

        System.out.println("Modified three-dimensional array:");
        printArray3D(array3D);
    }

    public static void printArray3D(int[][][] array3D) {
        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {
                    System.out.print(array3D[i][j][k] + " ");
                }
                System.out.println(); 
            }
            System.out.println(); 
        }
    }
}

