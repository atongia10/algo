public class FactorialDynamic {

    public static void main(String[] args) {
        int x = 10;
        System.out.println(fib(1000));
    }

    private static int fib(int x){
        int [] storage = new int[x+1];
        int result=0;
        for(int i=1;i<=x;i++){
            if(i <= 2){
                result = 1;
            } else {
                result = storage[i-1] + storage[i-2];
            }
            storage[i] = result;
        }
        return result;
    }

}
