import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class regular_b implements Cloneable{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        //поиск 4 чисел которые встрет€тс€ первыми и заменить их на подстроку
        String text2 = "в 1991 году вышел новый сайт который умеет регистрировать пользователей по номеру телефона \n" +
                "та же в 1991  году его заблокировали (информаци€ не €вл€етс€ действительной она дл€ теста 2022 в году)";
        System.out.println(text2.replaceFirst("\\d{4}","1990"));


        //поиск текса с разными вариантами –осси€ –оссии росси€ россии и после замена его на подстроку
        String text3 = "ѕривет јнна ты из россии ?  ";
        System.out.println(text3.replaceAll("[–р]осси[и€]"," анады")); //замена текста во всем тексте



        //принимает текст и провер€ет его на соответствие строки "Joni" или "Jone"
        String text = "Joni";
        Pattern pattern = Pattern.compile("^Jon[ie]$");//создать правило
        Matcher matcher = pattern.matcher(text);//проверка
        System.out.println(matcher.matches() + " ->  Result equalse Joni");//получение результата проверки


        //проверка введен ли год (4 цифры)
        String text4 = "2023";
        Pattern pt2 = Pattern.compile("\\d{4}"); // or \\d\\d\\d\\d
        Matcher matcher1 = pt2.matcher(text4);
        System.out.println(matcher1.matches()+ " -> result year"); //проверка на соответствие с паттерном (состоит ли строка из 4 чисел)


        //проверка введен ли email
        //строк не менее 3 символов после @ после снова строка после точка после снова строка от 2 до 3 символов
        String text5 = "J_on123i@mail.ru";
        Pattern pt3  = Pattern.compile("\\w{3,}@\\w+.\\w{2,3}");
        Matcher matcher2 = pt3.matcher(text5);
        System.out.println(matcher2.matches());


        //вытащить из строки только года

        String text6 = "в 1951 году вышел новый сайт который был написан еще в 19112 году который умеет регистрировать ";
        Pattern pt6  = Pattern.compile("\\d{4}\\W");//поиск 4 цифр
        Matcher matcher6 = pt6.matcher(text6);
        System.out.println(matcher6.matches()+" mathcers");
//        System.out.println(matcher6.find()); //провер€т есть ли паттерн в строке

        //пока есть паттерн выводим его
        while (matcher6.find()){
            System.out.println(matcher6.group());
        }


    }
}
