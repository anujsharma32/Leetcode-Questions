public class negative_num {
    public static void main(String[] args) {
        int arr[]={2,-3,4,-6,7,8,-10};
        int n =arr.length;
        System.out.println("All negative numbers");
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
