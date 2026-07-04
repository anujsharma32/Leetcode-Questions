public class minimum {
    public static void main(String[] args) {
        int arr[]={2,4,-1,-3,7,9,2};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The samllest element is:"+min);
    }
}
