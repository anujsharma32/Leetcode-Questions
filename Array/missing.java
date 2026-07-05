public class missing {
    public static void main(String[] args) {
    int arr[] = {1,2,3,5,6};
    int sum = ((6*7)/2);
    int s = 0;
    for(int i=0;i<arr.length;i++){
        s+=arr[i];
    }
    int missing = sum - s;
    System.out.println("Mising number is: "+missing);

    
}
}
