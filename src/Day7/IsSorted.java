package Day7;

public class IsSorted {
    public static boolean isSorted(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[] numbers={10,20,30,40,50};
        System.out.println(isSorted(numbers));
    }
}
