public class hm_17 {
    public static void main(String[] args) {
        // 創建一個2x2x2的三維陣列
        int[][][] array3D = {
            {{1, 2}, {3, 4}},
            {{5, 6}, {7, 8}}
        };

        // 要修改的位置
        int modifyX = 0;
        int modifyY = 1;
        int modifyZ = 0;
        int newValue = 10;

        // 修改指定位置的元素
        array3D[modifyX][modifyY][modifyZ] = newValue;

        // 輸出修改後的結果
        System.out.println("修改後的三維陣列：");
        printArray3D(array3D);
    }

    // 輔助方法，用來輸出三維陣列的元素
    public static void printArray3D(int[][][] array3D) {
        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {
                    System.out.print(array3D[i][j][k] + " ");
                }
                System.out.println(); // 換行
            }
            System.out.println(); // 換行
        }
    }
}
