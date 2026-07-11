import java.util.ArrayList;

public class leader {
    public static void main(String[] args) {

        int[] arr = {16, 17, 4, 3, 5, 2};

        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int j = i + 1;

            while (j < n) {
                if (arr[i] < arr[j]) {
                    break;
                }
                j++;
            }

            if (j == n) {
                list.add(arr[i]);
            }
        }

        System.out.println(list);
    }
}