import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class regular_b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        Pattern pattern = Pattern.compile("^Joni$");//������� �������
        Matcher matcher = pattern.matcher(text);//��������
        System.out.println(matcher.matches());//��������� ���������� ��������
        ////////////////////////




        String text2 = "������ ���� �� �� ������ ?  ";
        //����� ����� � ������� ���������� ������ ������ ������ ������
        System.out.println(text2.replaceAll("[��]����[��]","������")); //������ ������ �� ���� ������


    }
}
