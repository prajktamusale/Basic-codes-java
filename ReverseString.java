import java.io.*;
import java.util.Scanner;
public class ReverseString {
   public static void main(String[] args)
   {
	   String str = "Prajakta", nstr="";
	   char ch;
	   System.out.print ("Original Word");
	   System.out.println("  Prajakta");
       for(int i = 0; i< str.length();i++)
       {
    	   ch = str.charAt(i);
    	   nstr = ch+nstr;
       }
       System.out.println("Reversed word:" +  nstr);
 
   }
}
