public class HelloWorld {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5};
        int target = 9;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int result = arr[i] + arr[j];
                if (result == target) {
                    System.out.println("Your target has been achieved at indices " + i + " and " + j);
                }
            }
        }
    }
}
