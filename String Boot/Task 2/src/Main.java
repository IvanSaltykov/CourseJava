import java.util.Scanner;
import java.util.stream.LongStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/*        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        if (a > b){
            System.out.println("Первое число должно быть больше второго");
            return;
        }*/
        new Main().getArithmeticProgressionSum(10_000_000, 1_000_000_000);
    }
    private void getArithmeticProgressionSum(int a, int b) {
        long result = LongStream.rangeClosed(a, b).reduce(0, Long::sum);
        System.out.println(result);
    }
}