package Day7;

public class CountVowels {
    public static int countVowels(String str){
        int count=0;
        for(char c :str.toCharArray()){
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'|| c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        String str="HELLO World";
        System.out.println(countVowels(str));
    }
}
