import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.StrictMath.sqrt;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинны катетов прямоугольного треугольника");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double area = (double) 1 / 2 * a * b;
        System.out.println("Площадь треугольника равна " + area);
        double gipotenuse = sqrt((pow(a, 2) + pow(b, 2)));
        double perimeter = a + b + gipotenuse;
        System.out.println("Периметр треугольника равен " + perimeter);

    }
}
