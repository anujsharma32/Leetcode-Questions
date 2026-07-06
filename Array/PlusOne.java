import java.util.ArrayList;

public class PlusOne {
    public static void main(String[] args) {

        int arr[] = {9, 8, 9};

        ArrayList<Integer> list = new ArrayList<>();

        for (int num : arr) {
            list.add(num);
        }

        for (int i = list.size() - 1; i >= 0; i--) {

            if (list.get(i) < 9) {
                list.set(i, list.get(i) + 1);
                break;
            } else {
                list.set(i, 0);
            }
        }

        if (list.get(0) == 0) {
            list.add(0, 1);
        }

        System.out.println(list);
    }
}