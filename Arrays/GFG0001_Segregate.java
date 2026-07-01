public class GFG0001_Segregate {
    public static void main(String[] args) {
         int[] arr={0,1,0,1,0,0,0,0,1,1,1,0,0,1};
        GFG0001_Segregate obj= new GFG0001_Segregate();
        obj.segregatearray(arr);
        for(int i : arr ){
            System.out.print(i+" ");
        }
}
    void segregatearray(int[] arr){
    int numofzeros=0;
    int numofones=0;
    for(int ele : arr){
        if(ele == 0){
            numofzeros++;
        }
        else{
            numofones++;
            }
        }
    int i=0;
    while (numofzeros > 0) {
        arr[i]=0;
        i++;
        numofzeros--;
        }
     while (numofones > 0) {
        arr[i]=1;
        i++;
        numofones--;
        }

    }

}
