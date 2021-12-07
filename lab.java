import java.util.Scanner;
public class lab {
    public static void main(String[] args) {
        Scanner password = new Scanner(System.in);
        System.out.println("Введите пароль: ");
        String p = password.next();
        password.close();

        String pattern = "(?=.*[a-z]+)(?=.*[A-Z]+)(?=.*[0-9]+)(?=.*[_])(?=\\S+$).{8,}";

        System.out.println(p.matches(pattern));

    }




}
