public class PalindromeNumbersInRange {
    public static boolean isPalindrome(int num) {
        int original = num, reversed = 0;
        while (num > 0) {
            reversed = reversed * 10 + num % 10;
            num /= 10;
        }
        return original == reversed;
    }

    public static void printPalindromes(int start, int end) {
        System.out.println("Palindrome numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printPalindromes(1, 100);
    }
}
