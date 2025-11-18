package Day7;

public class ReverseArray {
    public static void reverse(int[] arr){
        for (int i=(arr.length-1);i>=0;i--){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        int[] numbers={10,20,30,40,50};
        reverse(numbers);
    }
}
