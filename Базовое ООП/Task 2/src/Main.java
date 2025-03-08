import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<User> userList = new ArrayList<User>();
        for (int i = 1; i <= 5; i++) {
            System.out.printf("Введите имя %d-го пользователя: ", i);
            String nameUser = scan.nextLine();
            System.out.printf("Введите возраст %d-го пользователя: ", i);
            int ageUser = scan.nextInt();
            userList.add(new User(nameUser, ageUser));
            scan.nextLine();
        }
        userList.sort(new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        for (int i = 0; i < 5; i++)
            System.out.println(userList.get(i));
    }
}