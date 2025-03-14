import java.util.Scanner;

public class Array2D {
    //2 boyutlu bir dizinin elemanlarını yazdırır
    public static void arrayPrint(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    //dizinin kaç satırlı olduğunu ve her satırın kaç elemanlı olduğunu sorar ve eleman atar
    public static int[][] arrayAssign() {
        Scanner input = new Scanner(System.in);
        System.out.println("Dizinin satır sayısını giriniz: ");
        int row = input.nextInt();
        int[][] array = new int[row][];

        for (int i = 0; i < row; i++) {
            System.out.println("dizinin " + (i+1) + ". satırının eleman sayısını giriniz: ");
            int column = input.nextInt();
            array[i] = new int[column];

            for (int j = 0; j < column; j++) {
                System.out.println((i+1) + ". satırın " + (j+1) + ". elemanını giriniz: ");
                array[i][j] = input.nextInt();
            }
        }
        return array;
    }
    //çok boyutlu bir diziin her satırının en küçük elemanını bulur
    public static int[] arrayRowMins(int[][] array) {
        int[] mins = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            mins[i] = array[i][0];
            for (int j = 1; j < array[i].length; j++) {
                if (mins[i] > array[i][j]) {
                    mins[i] = array[i][j];
                }
            }
        }
        return mins;
    }
    //çok boyutlu bir diziin her satırının en büyük elemanını bulur
    public static int[] arrayRowMaxs(int[][] array) {
        int[] maxs = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            maxs[i] = array[i][0];
            for (int j = 1; j > array[i].length; j++) {
                if (maxs[i] > array[i][j]) {
                    maxs[i] = array[i][j];
                }
            }
        }
        return maxs;
    }
    //dizi sütunlarındaki en küçük elemanları bulur
    public static int[] arrayColMins(int[][] array) {
        int l = 0;
        int[] m = null;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length>l){
                l = array[i].length;
                m = array[i];
            }
        }
        int[] mins = m;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i < array[j].length ){
                    if (mins[i] > array[j][i]) {
                        mins[i] = array[j][i];
                    }
                }
            }
        }
        return mins;
    }
    //dizi sütunlarındaki en büyük elemanları bulur
    public static int[] arrayColMaxs(int[][] array) {
        int l = 0;
        int[] m = null;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length>l){
                l = array[i].length;
                m = array[i];
            }
        }
        int[] maxs = m;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i < array[j].length ){
                    if (maxs[i] < array[j][i]) {
                        maxs[i] = array[j][i];
                    }
                }
            }
        }
        return maxs;
    }
    //dizi satırlarındaki elemanların ortalamasını bulur
    public static double[] arrayRowAvg(int[][] array) {
        double[] avgs = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            double sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            avgs[i] = sum/array[i].length;
        }
        return avgs;
    }
    //dizi sütunlarındaki elemanların ortalamasını bulur
    public static double[] arrayColAvg(int[][] array) {
        int l = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length>l){
                l = array[i].length;
            }
        }
        double[] sums = new double[l];
        double[] avgs = new double[l];
        for (int i = 0; i < l; i++) {
            sums[i] = 0;
            int s = 0;
            for (int j = 0; j < array.length; j++) {
                if (i < array[j].length ){
                    sums[i] += array[j][i];
                    s++;
                }
            }
            avgs[i] = sums[i]/s;
        }
        return avgs;
    }
}
