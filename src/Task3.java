import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Task3 {
        public static void main(String[] args) {
            ArrayList<String> arrayofstrings = new ArrayList<>();
            arrayofstrings.add("f10");
            arrayofstrings.add("f15");
            arrayofstrings.add("f2");
            arrayofstrings.add("f4");
            arrayofstrings.add("f4");
            //Как работает сортировка в 15 строке?
            List<String> sortedarrayofstrings = arrayofstrings.stream().sorted().collect(Collectors.toList()); ;
            System.out.println(sortedarrayofstrings);
}
}
