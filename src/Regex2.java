import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
        String s1 = "abcd abce abc5abcg6abch";
        //шаблон принимающее регулярное выражение
        Pattern pattern1 = Pattern.compile("abc(e|5)");

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
