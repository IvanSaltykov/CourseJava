import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя первого пользователя: ");
        String nameUser = scan.nextLine();
        System.out.print("Введите возраст первого пользователя: ");
        int ageUser = scan.nextInt();
        User user1 = new User(nameUser, ageUser);
        scan.nextLine();
        System.out.print("Введите имя второго пользователя: ");
        nameUser = scan.nextLine();
        System.out.print("Введите возраст второго пользователя: ");
        ageUser = scan.nextInt();
        User user2 = new User(nameUser, ageUser);
        if (user1.getAge() > user2.getAge())
            System.out.println(user2.toString());
        else
            System.out.println(user1.toString());
    }
}