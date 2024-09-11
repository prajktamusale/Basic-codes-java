import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class RemoveDuplicates {
     public static void main(String[] args)
     {
    	 int [] array = {1,2,2,3,4,4,5};
    	 int [] uniqueArray = removeDuplicates(array);
    	 
    	 System.out.println("Array without duplicates:" + Arrays.toString(uniqueArray));
     }
     public static int[] removeDuplicates(int[] array)
     {
    	 Set<Integer> set = new HashSet<>();
    	 
    	 for(int num : array) {
    		 set.add(num);
    	 }
    	 
    	 int [] result = new int[set.size()];
    	 int i = 0;
    	 for(int num: set) {
    		 result[i++] = num;
    	 }
    	 return result;
     }
     
}
