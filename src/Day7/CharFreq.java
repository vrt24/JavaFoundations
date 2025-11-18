package Day7;

import java.util.HashMap;

public class CharFreq {
    public static void charfreq(String str) {
        HashMap<Character, Integer> count = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (count.containsKey(c)) {
                count.put(c, count.get(c) + 1);
            } else count.put(c, 1);
        }
        for (char s:count.keySet()){
            System.out.println(s+" : "+count.get(s));
        }
    }
    public static void main(String[] args){
        charfreq("bananaB");
    }
}
