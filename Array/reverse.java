public class reverse {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};

        int temp;
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        System.out.println("Array after reverse:");
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }
}
    
    
