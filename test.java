import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class test {

    private static boolean getBit(int num, int i){
        return ((num & (1 << i)) != 0);
    }

    public static void main(String[] args) throws ParseException {
        // String oldDateStr="2021-05-30T20:10:00+08:00";
        // DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX");
        // Date date = df.parse(oldDateStr);
        // System.out.println(date.getTime()-new Date().getTime());
        // String TimeNow = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new
        // Date().getTime());
        // System.out.println(TimeNow);
        System.out.println((4 & (1 << 0)));
    }
}
