public class sum_of_digits {
     public static int find(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;

     }
    public static void main(String[] args) {
        int ans = sum_of_digits.find(642);
        System.out.println(ans);
    }
}
