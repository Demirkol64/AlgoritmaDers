public class Matrix {
    //dizinin sütun toplamlarını bulur
    public static int[] matrixSum(int[][] matrix) {
        int l = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (l < matrix[i].length) {
                l = matrix[i].length;
            }
        }
        int[] sums = new int[l];
        for (int i = 0; i < l; i++) {
            sums[i] = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (i < matrix[j].length) {
                    sums[i] += matrix[j][i];
                }
            }
        }
        return sums;
    }
    //dizinin sütun carpımlarını bulur
    public static int[] matrixProduct(int[][] matrix) {
        int l = matrix.length;
        for (int i = 0; i < l; i++) {
            if (l < matrix[i].length) {
                l = matrix[i].length;
            }
        }
        int[] products = new int[l];
        for (int i = 0; i < l; i++) {
            products[i] = 1;
            for (int j = 0; j < matrix.length; j++) {
                if (i < matrix[j].length) {
                    products[i] *= matrix[j][i];
                }
            }
        }
        return products;
    }
}

