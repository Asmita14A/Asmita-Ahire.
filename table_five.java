public class TableOfFive {
    public static void main(String[] args) {
        int num = 5; // Number for which the table is printed
        
        // Loop to generate multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
