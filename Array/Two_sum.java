public class Two_sum {
    public static void main(String[] args) {
        int arr[]={3,4,6,1,7,8};
        int target=9;
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((arr[i]+arr[j])==target){
                    System.out.println("The sum is found at indexes:"+i+" and "+j);
                }
            }
        }
    }
    
}
