public class printTillN {
    
    static void printNumbers(int n){

        if(n == 1){
            System.out.print(n + " ");
            return;
        }

        printNumbers(n-1);
        System.out.print(n + " ");
    }


    public static void main(String[] args){

        int n = 5;
        printNumbers(n);

    }
}
