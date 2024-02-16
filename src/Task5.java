import java.util.ArrayList;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<String> logins = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите логин (или нажмите Enter для завершения): ");
            String login = scanner.nextLine();
            if (login.isEmpty()) {
                break;
            } else {
                logins.add(login);
            }
        }
        System.out.println("Логины, начинающиеся на букву 'f':");
        for (String login : logins) {
            if (login.toLowerCase().startsWith("f")) {
                System.out.println(login);
            }
        }
    }
}

