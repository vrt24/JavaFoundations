package Day7;

public class RemoveSpace {
    public static String removeSpaces(String str){
        StringBuilder str1=new StringBuilder();
        for (char c:str.toCharArray()){
            if(c !=' ') {
                str1.append(c);
            }
        }
        return str1.toString();
        }
    public static void main(String[] args){
        System.out.println(removeSpaces("Java is fun"));
    }
}
