public class second_largest {
    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 1, 3, 9};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } 
            else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("No second largest element.");
        } else {
            System.out.println("Largest: " + max);
            System.out.println("Second Largest: " + secondMax);
        }
    }
}
