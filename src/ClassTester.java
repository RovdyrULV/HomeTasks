public class ClassTester {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivanov Ivan Ivanovich", "Boss", "BossIvanov@gmail.com", "+375331111111", 1000, 40);
        employee1.infoAboutEmployee();
        Employee employee2 = new Employee("Stepanov Stepan Stepanovich", "Techlead", "TeachleadStepanov@gmail.com", "+375332222222", 900, 35);
        Employee employee3 = new Employee("Petrov Petr Petrovich", "Engenieer", "EngenieerPetrov@gmail.com", "+375333333333", 800, 30);
        Employee employee4 = new Employee("Pavlov Pavel Pavlovich", "Engenieer", "EngenieerPavlov@gmail.com", "+375334444444", 800, 25);
        Employee employee5 = new Employee("Ivanova Elizaveta Ivanovna", "Manager", "ManagerIvanova@gmail.com", "+375335555555", 800, 25);

        Employee[] employeesArray = {employee1, employee2, employee3, employee4, employee5};

        Park parkoblivion = new Park("Oblivion", "Jonson street", 100000);
        parkoblivion.infoAboutPark();


    }
}
