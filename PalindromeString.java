
public class PalindromeString {
	   public static void main(String[] args)
	   {
		   String str = "oppo", nstr="";
		   char ch;
		   System.out.print ("Original Word");
		   System.out.println("  oppo");
	       for(int i = 0; i< str.length();i++)
	       {
	    	   ch = str.charAt(i);
	    	   nstr = ch+nstr;
	       }
	       System.out.println("Reversed word:" +  nstr);
	       if(str.equals(nstr))
	    	   System.out.println("The word is a palindrome");
	       else
	    	   System.out.println("Not a palindrome");
	   }
	}

