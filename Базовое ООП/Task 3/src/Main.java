import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<Integer, List<User>> users = new HashMap<>();
        for (int i = 1; i <= 5; i++) {
            System.out.printf("Введите имя %d-го пользователя: ", i);
            String nameUser = scan.nextLine();
            System.out.printf("Введите возраст %d-го пользователя: ", i);
            int ageUser = scan.nextInt();
            if (!users.containsKey(ageUser))
                users.put(ageUser, new ArrayList<User>());
            users.get(ageUser).add(new User(nameUser, ageUser));
            scan.nextLine();
        }
        System.out.println("Введите требуемый возраст: ");
        int outResult = scan.nextInt();
        if (!users.containsKey(outResult))
            System.out.printf("Пользователь с возрастом '%d' не найден", outResult);
        else
            for (int i = 0; i < users.get(outResult).size(); i++)
                System.out.println(users.get(outResult).get(i).toString());
    }
}