public class factorial {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int fact=1;
        for(int i=0;i<arr.length;i++){
            fact *= arr[i];
        }
        System.out.println("Fatorial of array:");
        System.out.println(fact);
    }
}
