import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число а: ");
        double a = scanner.nextDouble();
        System.out.print("Введите число b: ");
        double b = scanner.nextDouble();
        System.out.println("Результат сложения a и b: " + new Calculator(new Adder()).calculation(a, b));
        System.out.println("Результат вычитания a и b: " + new Calculator(new Subtractor()).calculation(a, b));
        System.out.println("Результат умножения a и b: " + new Calculator(new Multiplier()).calculation(a, b));
        System.out.println("Результат деления a и b: " + new Calculator(new Divider()).calculation(a, b));
    }
}