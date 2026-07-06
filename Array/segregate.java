public class segregate {
    public static void main(String[] args) {
        int arr[]={1,0,1,1,1,1};
        int zeros=0;
       
        for(int el : arr){
            if(el==0)zeros++;
        
        }
        for(int i=0;i<zeros;i++){
            arr[i]=0;
        }
        for(int j=zeros;j<arr.length;j++){
            arr[j]=1;
        }
        System.out.println("Array after segregation:");
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
       }
    }
    
}
