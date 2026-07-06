public class merge_array {
    public static void main(String[] args) {
        int[] a = {1, 3, 6, 8, 10, 20};
        int[] b = {2, 6, 8, 10, 12, 40};

        int[] c = new int[a.length + b.length];

        int i = a.length-1, j = b.length-1, k = c.length-1;

        while (i>=0 && j>=0) {
            if (a[i] > b[j]) {
                c[k--] = a[i--];
            } else {
                c[k--] = b[j--];
            }
        }

        while (i>=0) {
            c[k--] = a[i--];
        }

        while (j>=0) {
            c[k--] = b[j--];
        }

        for (int el : c) {
            System.out.print(el + " ");
        }
    }
}
