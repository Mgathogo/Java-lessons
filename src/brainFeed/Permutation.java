package brainFeed;

import java.util.HashSet;
import java.util.Set;
 
public class Permutation {

    public static void main(String[] args) {
    
        System.out.println(getPermutations("ABC"));
        System.out.println(addChar("ABC",'D', 3));
 
        //Prints
        //[ACB, BCA, ABC, CBA, BAC, CAB]
    }
 
    public static Set<String> getPermutations(String string){
    
        //All permutations
        Set<String> permutationsSet = new HashSet<String>();
         
        // invalid strings
        if (string == null || string.length() == 0)
        {
            permutationsSet.add("");
        }
        else
        {
            //First character in String
            char initial = string.charAt(0);
            //System.out.println(initial);
             
            //Full string without first character
            String rem = string.substring(1);
            //System.out.println("rem"+rem);
             
            //Recursive call
            Set<String> wordSet = getPermutations(rem);
            System.out.println(wordSet);
             
            for (String word : wordSet) {
                for (int i = 0; i <= word.length(); i++) {
                    permutationsSet.add(charInsertAt(word, initial, i));
                    System.out.println("word"+word);
                }
            }
        }
        return permutationsSet;
    }
 
    public static String charInsertAt(String str, char ch, int position)
    {
        String begin = str.substring(0, position);
        System.out.println("position is"+ position);
        String end = str.substring(position);
        return begin + ch + end;
    }
    public static String addChar(String str, char ch, int position) {
        return str.substring(0, position) + ch + str.substring(position);
    }
}
