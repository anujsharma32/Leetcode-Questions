public class prime {
    public static void main(String[] args) {
        int x =2;
        boolean flag =true;
        for(int i=2;i<x/2;i++){
            if(x%i==0){
                flag=false;
                System.out.println("Number is not prime.");
                break;
            }
        }
        if(flag){
            System.out.println("number is prime.");
        }
    }
}
