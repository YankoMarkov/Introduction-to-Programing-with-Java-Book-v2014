import java.text.SimpleDateFormat;
import java.util.Date;

public class Call {

    static String formatDate = "dd.MM.yyyy";
    static String formatStartDate = "dd.MM.yyyy HH:mm";
    static String formatTimeLong = "HH:mm";

    static SimpleDateFormat fDate = new SimpleDateFormat(formatDate);
    static SimpleDateFormat fStartDate = new SimpleDateFormat(formatStartDate);
    static SimpleDateFormat fTimeLong = new SimpleDateFormat(formatTimeLong);
    static Date dateNow = new Date();

    static String date = fDate.format(dateNow);
    static String startTime = fStartDate.format(dateNow);
    static String timeLong = fTimeLong.format(dateNow);
    public static int callHistory;

    String saveDate;
    String saveStartCall;
    String saveDuration;

    public Call(String saveStartCall, String saveDuration) {
        this.saveDate = date;
        callHistory++;
    }

    public static void main(String[] args) {
        System.out.println(date);
        System.out.println(startTime);
        System.out.println(timeLong);
    }
}






