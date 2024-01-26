import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = a/b;

        sc.close();

        System.out.printf("%.2f\n", c);
    }
}
