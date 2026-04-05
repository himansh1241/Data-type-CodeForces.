import java.util.Scanner;

public class ProblemD {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);

        long A = hr.nextLong(), B = hr.nextLong(), C = hr.nextLong(),
        D = hr.nextLong();

        long X = (A * B) - (C * D);
        System.out.println("Difference = " + X); 

        hr.close();
    }
}