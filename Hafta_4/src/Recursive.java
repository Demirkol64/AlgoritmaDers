public class Recursive {
    //birden n e kadar olan sayıların toplamını verir
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return n + sum(n - 1);
        }
    }
    //faktoriyel hesaplar
    public static int factorial(int n) {
        if(n == 0 || n == 1) {
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }
    }
    //birden n e kadar olan sayıları yazdırır
    public static void print(int n) {
        if (n == 1) {
            System.out.print(1);
        }
        else {
            System.out.print(n + " ");
            print(n - 1);
        }
    }
    //x^y işlemoni yapar
    public static int powerby(int x ,int y) {
        if (y == 1) {
            return x;
        }
        else {
            return x * powerby(x, y - 1);
        }
    }
    //birden n e kadar olan çift sayıların toplamını bulur
    public static int evenSum(int n) {
        if (n == 0) {
            return 0;
        }
        else if (n % 2 == 0) {
            return n + evenSum(n-2);
        }
        else {
            return evenSum(n-1);
        }
    }
    //fibonacci n in kaç olduğunu bulur
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    public static int arrayMin(int[] array, int index) {
        if (index == array.length-1) {
            return array[index];
        }

        int min = arrayMin(array, index+1);

        if (array[index] < min){
            return array[index];
        }
        else {
            return min;
        }
    }
}
