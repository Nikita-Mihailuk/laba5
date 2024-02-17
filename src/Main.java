import java.util.Scanner;
class Equations {
    double x;
    double a;
    double b;
    Equations(double x, double a, double b) {
        this.x = x;
        this.a = a;
        this.b = b;
    }
    public void equation1 (double x){
        double res = 3 * x + 5;
        System.out.println("Решение уравнения 1: " + res);
    }
    public  void equation2 (double a, double b) {
        if (a-b == 0) System.out.println("Решение уравнения 2 невозможно");
        else {
            double res = (a+b)/(a-b);
            System.out.println("Решение уравнения 2: " + res);
        }
    }
    public void equation3 (double x, double a, double b){
        if (b == 0) System.out.println("Решение уравнения 3 невозможно");
        else {
            double res = factorial(a*x/b);
            System.out.println("Решение уравнения 3: " + res);
        }
    }
    public double factorial(double n) {
            double res = 1;
            for (int i = 1; i <= n; i++) {
                res *= i;
            }
            return res;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Решение уравнений: \n 1) y=3x+5 \n 2) y=(a+b)/(a-b) \n 3) y=(ax/b)!");
        System.out.println("Введите данные для первого объекта");

        System.out.print("Введите x: ");
        double x1 = in.nextDouble();

        System.out.print("Введите a: ");
        double a1 = in.nextDouble();

        System.out.print("Введите b: ");
        double b1 = in.nextDouble();

        Equations num1 = new Equations(x1,a1,b1);
        num1.equation1(x1);
        num1.equation2(a1,b1);
        num1.equation3(x1,a1,b1);

        System.out.println("Введите данные для второго объекта");

        System.out.print("Введите x: ");
        double x2 = in.nextDouble();

        System.out.print("Введите a: ");
        double a2 = in.nextDouble();

        System.out.print("Введите b: ");
        double b2 = in.nextDouble();

        Equations num2 = new Equations(x2,a2,b2);
        num2.equation1(x2);
        num2.equation2(a2,b2);
        num2.equation3(x2,a2,b2);

        System.out.println("Введите данные для третьего объекта");

        System.out.print("Введите x: ");
        double x3 = in.nextDouble();

        System.out.print("Введите a: ");
        double a3 = in.nextDouble();

        System.out.print("Введите b: ");
        double b3 = in.nextDouble();

        Equations num3 = new Equations(x3,a3,b3);
        num2.equation1(x3);
        num2.equation2(a3,b3);
        num2.equation3(x3,a3,b3);

    }
}