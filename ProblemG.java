import java.util.Scanner;

public class ProblemG {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);
        long n = hr.nextLong();
        System.out.println(n * (n + 1) /2);

        hr.close();
    }
}