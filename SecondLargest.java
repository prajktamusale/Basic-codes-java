
public class SecondLargest {
     public static void main(String[] args)
     {
    	 int[] array = {12,35,1,10,34,1};
    	 int secondLargest = findSecondLargest(array);
    	 
    	 if(secondLargest == Integer.MIN_VALUE)
    	 {
    		 System.out.println("No second largest element found");
    	 }
    	 else
    		 System.out.println("The second largest element is: "+ secondLargest);
     }
     public static int findSecondLargest(int[] array)
     
     {
    	 if(array.length < 2)
    	 {
    		 return Integer.MIN_VALUE;
    	 }
    	 int largest = Integer.MIN_VALUE;
    	 int secondLargest = Integer.MIN_VALUE;
    	 
    	 for(int num: array)
    	 {
    		 if(num > largest) {
    			 secondLargest = largest;
    			 largest = num;
    		 }else if (num > secondLargest && num != largest) {
    			 secondLargest = num;
    		 }
    	 }
    	 return secondLargest;
     }
}
