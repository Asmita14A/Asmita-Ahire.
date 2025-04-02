public class ReverseNumber {
    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        int num = 1234;
        System.out.println("Reverse of " + num + " is: " + reverseNumber(num));
    }
}
