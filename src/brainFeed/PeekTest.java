package brainFeed;

import java.util.*;

public class PeekTest {
   public static void main(String[] args) {

      // create a LinkedList
      LinkedList<String> list = new LinkedList<>();

      // add some elements
      list.add("Hello");
      list.add("2");
      list.add("Chocolate");
      list.add("10");
      
     

      // print the list
      System.out.println("LinkedList before alteration: " + list);

      // peek at the head of the list
      System.out.println("Head of the list: " + list.peek());
      System.out.println("Removing Head of the list: " + list.pop());
      System.out.println("LinkedList after alteration: " + list);
   }
}
