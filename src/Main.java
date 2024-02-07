import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    static String[] array = {"Отвертка", "Гайки", "Гвозди", "Болты", "Шуроповерт", "Ключ гаечный",
            "Ключ разводной", "Шестигранник", "Молоток", "Изолента", "Гвозди", "Скотч", "Отвертка"};
    public static void main(String[] args) {
        Set<String> arrayfilter = new HashSet<String>(Arrays.asList(array));
        System.out.println(arrayfilter);
        System.out.println(arrayfilter.size());
    }
}
