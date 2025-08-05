import java.time.LocalDate;
import java.time.ZoneId;

public class Baekjoon_16170 {
    public static void main(String[] args) {
        LocalDate utcDate = LocalDate.now(ZoneId.of("UTC"));

        System.out.printf("%d\n%02d\n%02d\n",
                utcDate.getYear(),
                utcDate.getMonthValue(),
                utcDate.getDayOfMonth());
    }
}
