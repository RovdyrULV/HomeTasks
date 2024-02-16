import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Task4 {
    static Collection<Student> students = Arrays.asList(
            new Student ("Дмитрий", 17, Gender.MAN),
            new Student ("Максим", 17, Gender.MAN),
            new Student ("Екатерина", 17, Gender.WOMAN),
            new Student ("Михаил", 28, Gender.MAN)
    );

    private enum Gender {
        MAN,
        WOMAN
    }

    private static class Student {
        private final String name;
        private final Integer age;
        private final Gender gender;

        public Student(String name, Integer age, Gender gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Gender getGender() {
            return gender;
        }

        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender=" + gender +
                    "}";
        }
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student)) return false;
            Student student = (Student) o;
            return Objects.equals(name, student.name) &&
                    Objects.equals(age, student.age) &&
                    Objects.equals(gender, student.gender);
        }
        public int HashCode(){
            return Objects.hash(name, age, gender);
        }
    }

    public static void main(String[] args) {
        List<Student> malestudents = students.stream().filter(c -> c.getGender() == Gender.MAN).collect(Collectors.toList());
        System.out.println(malestudents);
        var averageage = malestudents.stream().mapToInt(Student::getAge).average().orElse(0);
        System.out.println(averageage);
        // Возмоно это хардкодинг но до другого решения я не допер
        var conscriptstudents = malestudents.stream().filter(a -> a.getAge() >= 18).filter(b-> b.getAge() <= 27).collect(Collectors.toList());
        System.out.println(conscriptstudents);
    }
}