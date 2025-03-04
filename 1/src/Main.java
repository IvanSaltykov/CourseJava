import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Как тебя зовут?");
        Scanner scan = new Scanner(System.in);
        String myName = scan.nextLine();
        System.out.println("Привет, " + myName);
    }
}