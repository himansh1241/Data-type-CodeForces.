import java.util.Scanner;

public class ProblemC {
    public static void main(String[] args) {
        Scanner hr = new Scanner(System.in);

        long X = hr.nextLong();
        long Y = hr.nextLong();
        
        System.out.println(X + " + " + Y + " = " + (X + Y));
        System.out.println(X + " * " + Y + " = " + (X * Y));
        System.out.println(X + " - " + Y + " = " + (X - Y));

        hr.close();
    }
}