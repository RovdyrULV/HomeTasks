import java.util.ArrayList;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<String> arrayofstrings = new ArrayList<>();
        arrayofstrings.add("Highload");
        arrayofstrings.add("High");
        arrayofstrings.add("Load");
        arrayofstrings.add("Highload");
        long n = Stream.of(arrayofstrings).filter("High"::equals).count();
        System.out.println(n);
        //Почему код в строке 11 не работает?
        long m = arrayofstrings.stream().filter("High"::equals).count();
        System.out.println(m);
        String firstelement = arrayofstrings.stream().findFirst().orElse("0");
        System.out.println(firstelement);
        String lastelement = arrayofstrings.stream().skip(3).findFirst().get();
        System.out.println(lastelement);

    }

}
