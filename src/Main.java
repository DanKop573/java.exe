import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
      final long x = scanner.nextLong();
        final long y = scanner.nextLong();
        System.out.println(x+y);
        System.out.println(x*y);
        System.out.println(x-y);
        System.out.println((double) x/y);
    }
}