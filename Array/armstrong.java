class armstrong {
    static boolean armstrongNumber(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int x = n % 10;
            sum += x * x * x;
            n /= 10;
        }

        return sum == original;
    }
    public static void main(String[] args) {
        boolean ans = armstrong.armstrongNumber(113);
        System.out.println(ans);
    }
}