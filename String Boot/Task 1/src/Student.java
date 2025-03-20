import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.stream.IntStream;

public class Student implements Learner {
    private String name;
    private int age;
    private int group;

    @Override
    public void learn() {
        System.out.println("Я учусь. .zZ");
        IntStream.range(0, 1000000).forEach(i -> Math.log(i));
        System.out.println("Я закончил учиться");
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        System.out.println("Текущее время: " + dateFormat.format(new Date()));
    }
}
