import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 2, 3, 4};
        int[] array2 = {2, 2, 4, 5};

        Set<Integer> intersection = findIntersection(array1, array2);

        // Output the intersection
        System.out.println("Intersection of the two arrays: " + intersection);
    }

    public static Set<Integer> findIntersection(int[] array1, int[] array2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        // Add elements of array1 to the set
        for (int num : array1) {
            set.add(num);
        }

        // Check if elements of array2 are in the set
        for (int num : array2) {
            if (set.contains(num)) {
                result.add(num);
            }
        }

        return result;
    }
}
