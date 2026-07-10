class palindrome_array {
    public static boolean isPalinArray(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int original = arr[i];
            int temp = original;
            int rev = 0;

            while (temp > 0) {
                int mod = temp % 10;
                rev = rev * 10 + mod;
                temp /= 10;
            }

            if (original != rev) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int arr[]={121,343,111,454};
        boolean ans = palindrome_array.isPalinArray(arr);
        System.out.println(ans);
    }
}