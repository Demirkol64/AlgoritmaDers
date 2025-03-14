public class Main {
    public static void main(String[] args) {
        int[] nums = new int[3];
        //Array.arrayAssign(nums);
        //Array.arrayRandomAssign(nums);
        //Array.arrayPrint(nums);
        //int[] nums1 = Array.arrayAssing();
        //Array.arrayPrint(nums1);
        //System.out.println("dizinin en büyük elemanı: " + Array.arrayMax(nums));
        //System.out.println("diziinen en küçük elemanı: " + Array.arrayMin(nums));
        //System.out.println("dizinin ortalaması: " + Array.arrayAvg(nums));
        double[] nums2 = new double[3];
        //Array.arrayAssign(nums2);
        //Array.arrayPrint(nums2);

        int[][] matrix = Array2D.arrayAssign();
        Array2D.arrayPrint(matrix);
        //Array.arrayPrint(Array2D.arrayRowMins(matrix));
        //Array.arrayPrint(Array2D.arrayRowMaxs(matrix));
        //Array.arrayPrint(Array2D.arrayColMins(matrix));
        //Array.arrayPrint(Array2D.arrayColMaxs(matrix));
        //Array.arrayPrint(Array2D.arrayRowAvg(matrix));
        //Array.arrayPrint(Array2D.arrayColAvg(matrix));

        //Array.arrayPrint(Matrix.matrixSum(matrix));
        Array.arrayPrint(Matrix.matrixProduct(matrix));
    }
}

