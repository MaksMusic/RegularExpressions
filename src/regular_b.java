import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class regular_b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Pattern pattern = Pattern.compile("^Joni$");//создать правило
        Matcher matcher = pattern.matcher(text);//проверка
        System.out.println(matcher.matches());//получение результата проверки
        ////////////////////////




        String text2 = "Привет Анна ты из Россия ?  ";
        //поиск текса с разными вариантами Россия России россия россии
        System.out.println(text2.replaceAll("[Ро]осси[ия]","Канады")); //замена текста во всем тексте


    }
}
