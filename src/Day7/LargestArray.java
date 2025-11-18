package Day7;

public class LargestArray {
    public static int largest(int[] arr){
        int max=arr[0];
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] numbers={10,20,30,40,50};
        System.out.println(largest(numbers));
    }
}
