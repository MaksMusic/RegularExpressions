import java.util.Random;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class regular_b {
    public static void main(String[] args) {



        String text = "Hello joni wtas are you Joni";
        Scanner scanner = new Scanner(System.in);
        String text2 = scanner.nextLine();
        String str2 = text2.replaceAll("[—с]оч[и»]","ростов"); //замена текста во всем тексте

        System.out.println(str2);



        System.out.println(text.replaceAll("[jJ]oni","Tomi")); //замена текста во всем тексте


    }
}
