import java.util.Scanner;

public class ProblemB {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);

        int i1 = hr.nextInt();
        long i2 = hr.nextLong();
        char i3 = hr.next().charAt(0);
        float i4 = hr.nextFloat();
        double i5 = hr.nextDouble();

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);

        hr.close();
    }
}