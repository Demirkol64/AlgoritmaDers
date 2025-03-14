public class Main {
    public static void main(String[] args) {
        //System.out.println(Recursive.sum(5));
        //System.out.println(Recursive.factorial(5));
        //Recursive.print(5);
        //System.out.println(Recursive.powerby(2,5));
        //System.out.println(Recursive.evenSum(11));
        //System.out.println(Recursive.fibonacci(6));
        //0 dan itibaren fibonacci elemanlarını yazdırma
        //for(int i = 0; i < 20; i++) System.out.print(Recursive.fibonacci(i) + " ");
        int[] nums = {8,4,6,1,3};
        System.out.println(Recursive.arrayMin(nums,nums.length-1));
    }
}
