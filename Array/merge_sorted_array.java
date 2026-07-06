public class merge_sorted_array {
    public static void main(String[] args) {
        int[] a ={1,3,6,8,10,20};
        int[] b ={2,6,8,10,12,40};
        int[] c = new int[a.length+b.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k] = a[i];
                i++;
            }
            else{
                c[k]=b[j];
                j++;
            }
            k++;
            if(i==a.length && j<b.length){
                c[k++]=b[j++];
            }
            if(j==b.length && i<a.length){
                c[k++]=a[i++];
            }
        }

        for(int el=0;el<c.length;el++){
            System.out.print(c[el]+" ");
        }
    }
}
