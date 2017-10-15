package main;
import java.util.*;
class Permutations
{
    int c = 0;
     
    
   
    void display(String s1, String s2)
    {
        if(s2.length()<=1)
        {
            c++;
            System.out.println(s1+s2);
        }
        else
        {
            for(int i=0; i<s2.length(); i++)
            {
                String x = s2.substring(i, i+1);
                String y = s2.substring(0, i);
                String z = s2.substring(i+1);
                System.out.println("display: "+s1+x+" "+y+z);
                display(s1+x, y+z);
            }
        }
    }
     
    public static void main(String args[])throws Exception
    {
        Permutations ob=new Permutations();
        ob.display("","ABC");
    }
}
