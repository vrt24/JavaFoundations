package Day7;

import java.util.HashMap;

public class Duplicate {
    public static void isDuplicate(String str){
        HashMap<Character,Integer> duplicate=new HashMap<>();
        for (char c:str.toCharArray()){
            if (duplicate.containsKey(c)){
                duplicate.put(c, duplicate.get(c)+1);
            }
            else duplicate.put(c,1);
        }
        for (char c:duplicate.keySet()){
            if(duplicate.get(c)>1){
                System.out.println(c+" : "+duplicate.get(c));
            }
        }
    }
    public static void main(String[] args){
        isDuplicate("banana");
    }
}
