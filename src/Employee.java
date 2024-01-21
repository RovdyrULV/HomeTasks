public class Employee {
    String fullname;
    String jobtitle;
    String email;
    String fhone;
    int salary;
    int age;

    public Employee(String fullname, String jobtitle, String email, String fhone, int salary, int age) {
        this.fullname = fullname;
        this.jobtitle = jobtitle;
        this.email = email;
        this.fhone = fhone;
        this.salary = salary;
        this.age = age;
    }

    void infoAboutEmployee(){
        System.out.println(this.fullname);
        System.out.println(this.jobtitle);
        System.out.println(this.email);
        System.out.println(this.fhone);
        System.out.println(this.salary);
        System.out.println(this.age);

    }

}
