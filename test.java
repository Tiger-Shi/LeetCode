import java.util.Date;
import java.text.SimpleDateFormat;

public class test {
    public static void main(String[] args) throws Exception {

        String beginTime = "2018-07-28 14:42:32";

        String endTime = "2018-07-29 12:26:32";

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date date1 = format.parse(beginTime);

        Date date2 = format.parse(endTime);

        int compareTo = date1.compareTo(date2);

        System.out.println(compareTo);

    }
}
