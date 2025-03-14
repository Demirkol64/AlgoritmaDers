public class Examples {
    //2 sayının toplamını yazdıran method
    public static void mySum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("toplam: " + sum);
    }
    //1 den N e kadar olan sayıların ortalamasını veren method
    public static double myAvg(int N)
    {
        double sum = 0;

        for(int i = 0; i <= N; i++)
        {
            sum += i;
        }
        double avg = sum / N;
        return avg;
    }
    //bir dizinin elemanlarının toplamını veren method
    public static void arraySum(int[] array)
    {
        int sum = 0;

        for(int num : array)
        {
            sum += num;
        }
        System.out.println("dizi elemanlarının toplamı: " + sum);
    }
    //dizi elemanlarının ortalamasını döndüren method
    public static double arrayAvg(int[] array) {
        double sum = 0;

        for (int num : array) {
            sum += num;
        }
        double avg = sum / array.length;
        return avg;
    }
    //dizinin en küçük elemanını döndüren method
    public static int arrayMin(int[] array)
    {
        int min = array[0];

        for(int i=1;i<array.length;i++)
        {
            if (array[i] < min)
            {
                min = array[i];
            }
        }
        return min;
    }
    //dizinin en büyük elemanını veren method
    public static int arrayMax(int[] array)
    {
        int max = array[0];

        for(int i = 1; i < array.length; i++)
        {
            if(array[i] > max)
            {
                max = array[i];
            }
        }
        return max;
    }
    //iki vektörün toplamını dödüren method
    public static int[] vectorSum(int[] array1, int[] array2) {
        if (array1.length == array2.length)
        {
            int[] sum = new int[array1.length];

            for(int i=0; i<array1.length; i++)
            {
                sum[i] = array1[i] + array2[i];
            }
            return sum;
        }
        else
        {
            if(array1.length < array2.length)
            {
                int[] sum = new int[array2.length];

                for(int i=0; i<array1.length; i++)
                {
                    sum[i] = array1[i] + array2[i];
                }
                for (int i= array1.length; i<array2.length; i++)
                {
                    sum[i] = array2[i];
                }
                return sum;
            }
            else
            {
                int[] sum = new int[array1.length];

                for(int i=0; i<array2.length; i++)
                {
                    sum[i] = array1[i] + array2[i];
                }
                for(int i= array2.length; i<array1.length; i++)
                {
                    sum[i] = array1[i];
                }
                return sum;
            }
        }
    }
    //dot prodact işlemini yapan ve dödüren method
    public static int[] vectorDot(int[] array1, int[] array2) {
        if (array1.length <= array2.length)
        {
            int[] dot = new int[array1.length];

            for(int i = 0; i < array1.length; i++)
            {
                dot[i] = array1[i] * array2[i];
            }
            return dot;
        }
        else
        {
            int[] dot = new int[array2.length];

            for(int i = 0; i < array2.length; i++)
            {
                dot[i] = array2[i] * array1[i];
            }
            return dot;
        }
    }
    //bir matrix in her satırının en küçük elemanını döndüren method
    public static int[] matrixMins(int[][] matrix) {
        int[] mins = new int[matrix.length];
        int min ;

        for (int i = 0; i < matrix.length; i++)
        {
            min = matrix[i][0];

            for(int j = 1; j < matrix[i].length; j++)
            {
                if(min > matrix[i][j])
                {
                    min = matrix[i][j];
                }
            }
            mins[i] = min;
        }
        return mins;
    }
    //bir matrix in her satırının en büyük elemanını döndüren method
    public static int[] matrixMaxs(int[][] matrix) {
        int[] maxs = new int[matrix.length];
        int max ;

        for (int i = 0; i < matrix.length; i++)
        {
            max = matrix[i][0];

            for(int j = 1; j < matrix[i].length; j++)
            {
                if(max < matrix[i][j])
                {
                    max = matrix[i][j];
                }
            }
            maxs[i] = max;
        }
        return maxs;
    }
}
