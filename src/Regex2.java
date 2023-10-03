import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
        String s1 = "Питер питер177 питер177 Питер117 питер107";
        //шаблон принимающее регулярное выражение
        Pattern pattern1 = Pattern.compile("[Пп]итер[1-9]+");

        //сверка шаблона со строкой
        Matcher matcher = pattern1.matcher(s1);

        //вернет true если совпадение найдено
        while (matcher.find()) {
            //выводит совпадение
            System.out.println("position " + matcher.start() +
                    " " + matcher.group());
        }
    }
}
