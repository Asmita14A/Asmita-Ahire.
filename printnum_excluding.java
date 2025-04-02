public class PrintNumbersExcluding {
    public static void main(String[] args) {
        // Loop to print numbers from 1 to 10, excluding 5 and 6
        for (int i = 1; i <= 10; i++) {
            if (i == 5 || i == 6) {
                continue; // Skip 5 and 6
            }
            System.out.print(i + " ");
        }
        System.out.println(); // Move to the next line after printing
    }
}
