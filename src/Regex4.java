import java.util.regex.Pattern;

public class Regex4 {

    public static void main(String[] args) {
        String ip1 = "255.38.192.99";
        String ip2 = "255.262.91.05";
        checkIp(ip1);
        checkIp(ip2);

    }

    //проверка на соответствие ip
    static void checkIp(String ip){
        String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}"+
                "(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)";

        System.out.println(ip + " is ok ? " + Pattern.matches(regex,ip));
    }
}
