package Day6;

import java.util.HashMap;
import java.util.Scanner;

public class WordFreq {
    public static void main(String[] args){
        HashMap<String,Integer> wordCount=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        String[] words=text.split(" ");
        for (String i:words) {
            if (wordCount.containsKey(i)) {
                wordCount.put(i, wordCount.get(i) + 1);
            } else
                wordCount.put(i, 1);
        }
            for (String j:wordCount.keySet()){
                System.out.println( j+":"+wordCount.get(j));
            }
        }
    }