import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double d;
        double x1;
        double x2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter three numbers");
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        d = (b * b) - (4 * a * c);
        double corin = Math.sqrt(d);
        if (d == 0) {
            x1 = -b / (2 * a);
            System.out.println(x1);
        }
        if (d > 0) {
            x1 = (-b + corin) / (2 * a);
            System.out.println(x1);
             x2 = (-b - corin) / (2 * a);
            System.out.println(x2);
        }
        if (d < 0) {
            System.out.println("no solution");
        }

    }
}


