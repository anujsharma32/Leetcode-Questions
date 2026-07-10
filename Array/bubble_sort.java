public class bubble_sort {
    public static void main(String[] args) {
        int arr[]={3,2,1,4,6};
        int n= arr.length;
        int temp;
        for(int i =0;i<n;i++){
            for(int j =0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                     temp = arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;
                }
            }
        }    
        for(int el : arr){
            System.out.print(el+" ");
        }
    }

    
}
