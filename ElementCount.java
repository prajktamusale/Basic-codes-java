import java.util.HashMap;
import java.util.Map;
public class ElementCount {
     public static void main (String args[])
     {
    	 int[] array = {1,2,2,3,3,3,4,5,5};
    	 
    	 Map<Integer,Integer> occurrences = countOccurences(array);
    	 
    	 for(Map.Entry<Integer, Integer> entry: occurrences.entrySet())
    	 {
    		 System.out.println("Element: "+ entry.getKey()+", Count" + entry.getValue());
    	 }
     }
     public static Map<Integer, Integer> countOccurences(int[] array)
     {
    	 Map<Integer, Integer> map = new HashMap<>();
    	 for(int num: array)
    	 {
    		 map.put(num, map.getOrDefault(num, 0) + 1);
    	 }
    	 return map;
     }
}
