public class ReverseAnInteger {


    public static void main(String[] args) {

        System.out.println(reverse(1534236469));

    }

    public static int reverse(int x) {
        int rev = 0;
        while (x != 0){
            rev = rev*10 + x%10;
            x = x / 10;
        }
        return rev;
    }

}
