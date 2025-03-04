import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    static SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
    public static void main(String[] args) {
        new Main().dataShifts(new Main().inputDate());
            }
    private Date inputDate() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите дату в формате dd.MM.yyyy: ");
        String dateStr = scan.nextLine().trim();
        try {
            Date date = dateFormat.parse(dateStr);
            return date;
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    private void dataShifts (Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, 45);
        System.out.println("Дата после увеличения на 45 дней: " + dateFormat.format(c.getTime()));
        startYear(c.getTime());
    }
    private void startYear(Date date) {
        LocalDate lDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate startOfYear = lDate.withDayOfYear(1);
        System.out.println("Дата после сдвига на начало года: " + startOfYear);
        dataShifts10(java.sql.Date.valueOf(startOfYear));
    }
    private void dataShifts10 (Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        for (int i = 1; i <= 10; i++) {
            c.add(Calendar.DATE, 1);
            if (c.get(Calendar.DAY_OF_WEEK) == 7 || c.get(Calendar.DAY_OF_WEEK) == 1)
                i--;
        }
        System.out.println("Дата после увеличения на 10 рабочих дней: " + dateFormat.format(c.getTime()));
        countWordDay(c.getTime());
    }
    private void countWordDay(Date date) {
        LocalDate dateEnd = inputDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate dateStart = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate dateCurrent = dateStart;
        int count = 0;
        while (!dateCurrent.isAfter(dateEnd)) {
            dateCurrent = dateCurrent.plusDays(1);
            if (dateCurrent.getDayOfWeek() != DayOfWeek.SATURDAY &&
                    dateCurrent.getDayOfWeek() != DayOfWeek.SUNDAY)
                count++;
        }
        System.out.println("Количество рабочих дней между введенными датами: " + count);
    }
}