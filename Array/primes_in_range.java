public class primes_in_range {
    public static void main(String[] args) {
        int x = 2;
        int y = 11;

        for (int i = x; i <= y; i++) {

            boolean flag = true;

            if (i < 2) {
                flag = false;
            }

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.print(i + " ");
            }
        }
    }
}