import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String[] args) {
        String s =
                "Ivanov Vasiliy,Russia,Moscow,Lenin street,77,Flat 47," +
                        "email:vivanov@email.ru,Postcode 12314,Phone number: +79217001212;" +

                        "Petrov Sergey,Russia,Moscow,Pushkin street,12,Flat 5," +
                        "email:spetrov@mail.ru,Postcode 12345,Phone number: +79123456789;" +

                        "Smirnova Maria,Russia,St. Petersburg,Gagarin avenue,33,Flat 12," +
                        "email:msmirnova@gmail.com,Postcode 54321,Phone number: +79987654321;" +

                        "Kuznetsov Dmitry,Russia,Moscow,Tverskaya street,15,Flat 3," +
                        "email:dkuznetsov@yandex.ru,Postcode 54321,Phone number: +79876543210;" +

                        "Sokolov Anna,Russia,Moscow,Arbat street,29,Flat 22," +
                        "email:asokolov@hotmail.com,Postcode 98765,Phone number: +79012345678;";

//        Pattern pattern = Pattern.compile("\\w+");
//        Matcher matcher = pattern.matcher(s);
//        while (matcher.find()) {
//            System.out.println(matcher.start() + " " + matcher.group());

//        Найти все номера домов и квартир состоящие из 2 цифр
//            Pattern pattern = Pattern.compile("\\b\\d{2}\\b");
//            Matcher matcher = pattern.matcher(s);
//            while (matcher.find()) {
//                System.out.println(matcher.start() + " " + matcher.group());


//        Найти все номера телефонов состоящие из 9 символов
//        Pattern pattern = Pattern.compile("\\+\\d{9}");
//            Matcher matcher = pattern.matcher(s);
//            while (matcher.find()) {
//                System.out.println(matcher.start() + " " + matcher.group());


//        Найти все email
//        Pattern pattern = Pattern.compile("\\w+@\\w+\\.(ru|com)");
//            Matcher matcher = pattern.matcher(s);
//            while (matcher.find()) {
//                System.out.println(matcher.start() + " " + matcher.group());

        Pattern pattern = Pattern.compile("\\w+@\\w+\\.(ru|com)");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());


    }


    }
}
