class solution{
    static void reverse(int arr[],int i,int j){
        int temp;
        while(i<j){
            temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
            }
        }
}

public class Rotate {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int n=arr.length;
        int d=2;
        d %=n;
        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
        solution.reverse(arr,0,d-1);
        solution.reverse(arr,d,n-1);
        solution.reverse(arr,0,n-1);
        
        System.out.println("Array after " + d + " rotation:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        }
    }
