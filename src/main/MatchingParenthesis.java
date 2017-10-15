package main;
import java.util.*;
class MatchingParenthesis{
   
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
      
      while (sc.hasNext()) {
         String input=sc.next();
            //Complete the code
          Stack inputStack= new Stack ();
          
          for(int i = 0; i <input.length(); i++) {
              if((Character.toString(input.charAt(i)) == "(") || (Character.toString(input.charAt(i)) == "{") || (Character.toString(input.charAt(i)) == "[")) {
                  inputStack.push(input.charAt(i));
              }
              else if((Character.toString(input.charAt(i)) == ")") || (Character.toString(input.charAt(i)) == "}") || (Character.toString(input.charAt(i)) == "]")) {
                  if(!(inputStack.pop() == "(" && (Character.toString(input.charAt(i)) == ")")) || 
                		  (inputStack.pop() == "{" && (Character.toString(input.charAt(i)) == "}")) || 
                		  (inputStack.pop() == "[" && (Character.toString(input.charAt(i)) == "]"))) {
                      System.out.println("false");
                      return;
                  }
                  
              }
              else System.out.print("");
          }
          System.out.println("true");
      }
      
   }
}