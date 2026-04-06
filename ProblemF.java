import java.util.Scanner;

public class ProblemF {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);
        long N = hr.nextLong(), M = hr.nextLong();

        System.out.println(N % 10 + M % 10);

        hr.close();
    }
}