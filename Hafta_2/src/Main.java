public class Main {
    public static void main(String[] args) {
        Examples.mySum(3,5);
        System.out.println(Examples.myAvg(6));

        int[] nums = {10,1,7,-3,3,-1,15};
        Examples.arraySum(nums);
        System.out.println(Examples.arrayAvg(nums));
        System.out.println(Examples.arrayMin(nums));
        System.out.println(Examples.arrayMax(nums));

        int[] vector1 = {2,2,2};
        int[] vector2 = {3,4,2,2};
        int[] vectorSum = Examples.vectorSum(vector1, vector2);
        for (int i = 0; i < vectorSum.length; i++)
        {
            System.out.print(vectorSum[i] + "(" + (i+1) + ") ");
        }
        int[] vectorDot = Examples.vectorDot(vector1, vector2);
        for (int i = 0; i < vectorDot.length; i++)
        {
            System.out.print(vectorDot[i] + "(" + (i+1) + ") ");
        }

        int[][] matrix = {{1,-7,3},{3,4,19},{-1,-80,-74}};
        int[] matrixMins = Examples.matrixMins(matrix);
        for (int i = 0; i < matrixMins.length; i++)
        {
            System.out.print(matrixMins[i] + "(" + (i+1) + ") ");
        }
        int[] matrixMaxs = Examples.matrixMaxs(matrix);
        for (int i = 0; i < matrixMaxs.length; i++)
        {
            System.out.print(matrixMaxs[i] + "(" + (i+1) + ") ");
        }
    }
}
