import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Main {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        new Main().Number1();
        new Main().Number2();
        new Main().Number3();
    }

    private void Number1() {
        System.out.print("Введите строку: ");
        StringBuilder str = new StringBuilder(scanner.nextLine().trim());
        System.out.print("Введите подстроку: ");
        String str1 = scanner.nextLine().trim();
        int count = 0;
        int index = 0;
        while ((index = str.indexOf(str1, index)) != -1) {
            count++;
            index += str1.length();
        }
        System.out.println("Количество подстрок: " + count);
    }

    private void Number2() {
        System.out.print("Введите строку: ");
        String str = scanner.nextLine().trim();
        final String replacement = "вырезано цензурой";
        String result = str.replace("кака", replacement);
        String resulfFinish = result.replace("бяка", replacement);
        System.out.println(resulfFinish);
    }

    private void Number3() {
        System.out.println("Введите дату в формате 'дд.мм.гггг': ");
        String str = scanner.nextLine();
        String day = str.substring(0, 2);
        String mounth = str.substring(3, 5);
        String year = str.substring(6);
        String dateNew = String.join("-", year, mounth, day);
        System.out.println(dateNew);
        Number4(str);
    }
    private void Number4(String str) {
        SimpleDateFormat outPutFormat = new SimpleDateFormat ("yyyy-MM-dd");
        SimpleDateFormat inPutFormat = new SimpleDateFormat("dd.MM.yyyy");
        try {
            Date date = inPutFormat.parse(str);
            String dateNew = outPutFormat.format(date);
            System.out.println(dateNew);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}