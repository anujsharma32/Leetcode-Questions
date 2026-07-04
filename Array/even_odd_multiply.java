public class even_odd_multiply {
    public static void main(String[] args) {
        int arr[] ={2,3,1,5,4,7,9};
        int n=arr.length;

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
        for(int i=0;i<n;i++){
            if(i%2==0){
                System.out.print(10+arr[i]+" ");
            }
            else{
                System.out.print(2*arr[i]+" ");
            }
        }
    }
    
}
