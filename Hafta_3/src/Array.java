import java.util.Random;
import java.util.Scanner;

public class Array {
    //herhangi bir dizinin int elemanlarını yazdırır
    public static void arrayPrint(int[] array){
        for(int i = 0; i < array.length; i++)
        {
            System.out.println((i+1) + ". eleman: " + array[i]);
        }
    }
    //herhangi bir diziye eleman atar
    public static  void arrayAssign(int[] array){
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < array.length; i++){
            System.out.println((i+1) + ". elemanı giriniz: ");
            array[i] = input.nextInt();
        }
    }
    //herhangi bir diziye 1 den 50 e kadar rastgele sayı atar
    public static void arrayRandomAssign(int[] array){
        Random r = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = r.nextInt(51);
        }
    }
    //eleman sayısını ister ve diziye eleman atar
    public static int[] arrayAssing(){
        Scanner input = new Scanner(System.in);
        System.out.println("dizinin eleman sayısını giriniz: ");
        int[] array = new int[input.nextInt()];
        for(int i = 0; i < array.length; i++){
            System.out.println((i+1) + ". elemanı giriniz: ");
            array[i] = input.nextInt();
        }
        return array;
    }
    //herhangi bir dizinin en küçük elemanını döndürür
    public static int arrayMin(int[] array){
        int min = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
    //dizinin en büyük elemanını veren method
    public static int arrayMax(int[] array) {
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
    //dizi elemanlarının ortalamasını döndüren method
    public static double arrayAvg(int[] array) {
        double sum = 0;

        for (int num : array) {
            sum += num;
        }
        double avg = sum / array.length;
        return avg;
    }
    //diziin double elemanlarını yazdırır
    public static void arrayPrint(double[] array){
        for(int i = 0; i < array.length; i++)
        {
            System.out.println((i+1) + ". eleman: " + array[i]);
        }
    }
    //diziye double elman atar
    public static void arrayAssign(double[] array){
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < array.length; i++)
        {
            System.out.println((i+1) + ". elemanı giriniz: ");
            array[i] = input.nextDouble();
        }
    }
}
