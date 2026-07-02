public class sum_of{
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7};
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("The sum of array is:"+sum);
    }
}