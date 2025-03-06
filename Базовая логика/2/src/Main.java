import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите 3 числа: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        new Main().outDivisible5(a, b, c);
        new Main().outResultIntAB(a, b);
        new Main().outResultAB(a, b);
        new Main().outResultMaxAB(a, b);
        new Main().outResultMinAB(a, b);
        new Main().outResultMatAB(a, b);
        new Main().outSurplusBC(b, c);
        new Main().outMinAB(a, b);
        new Main().outMaxAB(b, c);
    }
    private void outDivisible5(int a, int b, int c){            // Вывод переменных, значения которых делятся на 5
        System.out.print("Делимое числа 5: ");
        if (a % 5 == 0 || b % 5 == 0 || c % 5 == 0) {
            if (a % 5 == 0)
                System.out.print(a + " ");
            if (b % 5 == 0)
                System.out.print(b + " ");
            if (c % 5 == 0)
                System.out.print(c + " ");
        } else {
            System.out.print("нет значений, кратных 5");
        }
    }
    private void outResultIntAB(int a, int b) {                    // Вывести на консоль значение от целочисленного деления a на b
        System.out.println("\nРезультат целочисленного деления a на b: " + a / b);
    }
    private void outResultAB(int a, int b) {                        // Вывести на консоль значение от деления a на b
        System.out.println("\nРезультат деления a на b: " + (float)a / b);
    }
    private void outResultMaxAB(int a, int b) {                        // Вывести на консоль значение от деления a на b, округленного до ближайшего целого в большую сторону
        System.out.println("\nРезультат деления a на b с округлением в большую сторону: " + Math.ceil((float)a / b));
    }
    private void outResultMinAB(int a, int b) {                        // Вывести на консоль значение от деления a на b, округленного до ближайшего целого в меньшую сторону
        System.out.println("\nРезультат деления a на b с округлением в меньшую сторону: " + Math.floor((float)a / b));
    }
    private void outResultMatAB(int a, int b) {                        // Вывести на консоль значение от деления a на b, округленного до ближайшего целого математическим округлением
        System.out.println("\nРезультат деления a на b с математическим округлением: " + Math.round((float)a / b));
    }
    private void outSurplusBC(int b, int c) {                        // Вывести на консоль остаток от деления b на c
        System.out.println("\nОстаток от деления b на c: " + b % c);
    }
    private void outMinAB(int a, int b) {                        // Вывести на консоль наименьшее значение из a и b
        System.out.println("\nНаименьшее значение из a и b: " + Math.min(a, b));
    }
    private void outMaxAB(int b, int c) {                        // Вывести на консоль наибольшее значение из b и c
        System.out.println("\nНаибольшее значение из b и c: " + Math.max(b, c));
    }
}