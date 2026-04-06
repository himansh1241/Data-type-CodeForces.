import java.util.Scanner;

public class ProblemE {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);

        double R = hr.nextDouble();
        double area = 3.141592653 * R * R;

        System.out.printf("%.9f\n", area);

        hr.close();
    }
}