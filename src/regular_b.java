import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class regular_b implements Cloneable{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        //����� 4 ����� ������� ���������� ������� � �������� �� �� ���������
        String text2 = "� 1991 ���� ����� ����� ���� ������� ����� �������������� ������������� �� ������ �������� \n" +
                "�� �� � 1991  ���� ��� ������������� (���������� �� �������� �������������� ��� ��� ����� 2022 � ����)";
        System.out.println(text2.replaceFirst("\\d{4}","1990"));


        //����� ����� � ������� ���������� ������ ������ ������ ������ � ����� ������ ��� �� ���������
        String text3 = "������ ���� �� �� ������ ?  ";
        System.out.println(text3.replaceAll("[��]����[��]","������")); //������ ������ �� ���� ������



        //�������� ����� � ��������� ��� �� ������������ ������ "Joni"
        String text = "Joni";
        Pattern pattern = Pattern.compile("^Joni$");//������� �������
        Matcher matcher = pattern.matcher(text);//��������
        System.out.println(matcher.matches());//��������� ���������� ��������


        //�������� ������ �� ��� (4 �����)
        String text4 = "2022";
        Pattern pt2 = Pattern.compile("\\d\\d\\d\\d"); // or "\\d{4}"
        Matcher matcher1 = pt2.matcher(text4);
        System.out.println(matcher1.matches()); //�������� �� ����������� � ��������� (������� �� ������ �� 4 �����)


        //�������� ������ �� email
        String text5 = "J_on123i@mail.ru";
        Pattern pt3  = Pattern.compile("\\w{3,}@\\w+.\\w{2,3}");
        Matcher matcher2 = pt3.matcher(text5);
        System.out.println(matcher2.matches());


        //�������� �� ������ ������ ����

        String text6 = "� 1951 ���� ����� ����� ���� ������� ��� ������� ��� � 19112 ���� ������� ����� �������������� ";
        Pattern pt6  = Pattern.compile("\\d{4}\\W");//����� 4 ����
        Matcher matcher6 = pt6.matcher(text6);
        System.out.println(matcher6.matches()+" mathcers");
//        System.out.println(matcher6.find()); //�������� ���� �� ������� � ������

        while (matcher6.find()){
            System.out.println(matcher6.group());
        }


    }
}
