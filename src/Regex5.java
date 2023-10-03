import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex5 {
    public static void main(String[] args) {
        String s1 = "Hello  friend .Friend how is your training going java  ?";
        System.out.println(s1);

        //замена строки на другую строку
        s1 = s1.replace("java","sql");
        System.out.println(s1);

        //замена 2 пробелов и более на 1 пробел
        s1 = s1.replaceAll(" {2,}"," ");
        System.out.println(s1);

        //замена всех строк которые начинаются на F или f на User
        String s11 = s1.replaceAll("\\b[Ff]\\w+","User");
        System.out.println(s11);

        //замена 1 строки которые начинаются на F или f на User
        String s22 = s1.replaceFirst("\\b[Ff]\\w+","User");
        System.out.println(s22);
        System.out.println();


        //допустим это номера карт 3786 5487 4633 8768 01/02/25 975;"
        String  str = "37865487463387680125975;"+
                "47365487463387681125775;"+
                "57865487463387682125175;"+
                "67865487463387681525935;"+
                "77865487463387680225275;";

        //допустим из этого нужно сделать след формат
        //карт 01/25 3786 5487 4633 8768 975;"

        //каждые скобки это группы всего их тут 7
        Pattern pattern =
                Pattern.compile("(\\d{4})(\\d{4})(\\d{4})(\\d{4})(\\d{2})(\\d{2})(\\d{3})");

        Matcher matcher = pattern.matcher(str);

        //найти все совпадения
        while (matcher.find()){
            //почему метод называется group() а не get() например
            //без параметра метод выводит все соответствие
            //с параметром он выводит только нужную группу
            System.out.println(matcher.group(7));
        }
        System.out.println();


        //изменить строку
        //$5 это например 5 группа
        String newStr = matcher.replaceAll("$5/$6 $1 $2 $3 $4 ($7)");
        System.out.println(newStr);

        //добавить карты в массив
        String [] list = newStr.split(";");
        for (String s : list) {
            System.out.println(s);
        }


    }
}
