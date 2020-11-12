package brainFeed;
public class ReversingRecursively {

    public static void main(String[] args) {
    
        String blogName = "revihca remmargorp llufsseccuS a leahciM";
        String name = "Michael Gathogo";
        String blog = "blog";
       System.out.println( blog.substring(1)+blog.charAt(0));
        
        
        System.out.println("\n before swapping recursively: " +blogName);
        System.out.println("\n before swapping recursively: "+name);
        System.out.println("\n before swapping recursively: "+blog);
         
        String reverseString = recursiveSwap(blogName);
        String reverseString1 = recursiveSwap(name);
        String reversedblog = recursiveSwap(blog);
         
        System.out.println("\n After recursive method: " +reverseString);
        System.out.println("\n After recursive method: "+reverseString1);
        System.out.println("\n After recursive method: "+reversedblog);
    }
     
    static String recursiveSwap(String str) {
    
         if ((null == str) || (str.length() <= 1)) {
         
                return str;
         }
         return recursiveSwap(str.substring(1)) + str.charAt(0);
    }
}
//The recursive method works in a manner that every time a new string is returned and everytime it repeats recursively
//so every new string starting at index 1 will be interchanged with characterAt 0 until there is no more characters
//left. Thank you Lord for making me understand these. I know I am making progress with these practices. Every day, make
//coding like reading a book. read and read more code, yours, other peoples, books, puzzles, etc.