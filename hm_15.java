public class hm_15 {
    public static void main(String[] args) {

        int[][][] array3D = {{{1, 2}, {3, 4}},
                             {{5, 6}, {7, 8}}};

        System.out.println("All elements of a three-dimensional array:");
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
