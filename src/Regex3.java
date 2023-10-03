import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex3 {
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


        String s2 = "dkuznetsov@yandex.ru";
        boolean result = s2.matches("\\w+@\\w+\\.(ru|com|su)");
        System.out.println(result);

        String [] users  = s.split(";");

        for (String user : users) {
            System.out.println(user);
        }

        System.out.println();

        List<String> emails = new ArrayList<>();
        Matcher matcher = Pattern.compile("\\w+@\\w+\\.(ru|com|su)")
                .matcher(s);

        while (matcher.find()){
            emails.add(matcher.group());
        }

        emails.forEach(System.out::println);

    }
}
