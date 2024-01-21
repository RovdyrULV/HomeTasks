/*
Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах, времени их работы и стоимости.
 */
public class Park {
    String nameofpark;
    String adressofpark;
    int income;
    private class Attraction {
         String nameofattraction;
         int workinghours;
         int price;

        private Attraction(String name, int workinghours, int price) {
            this.nameofattraction = name;
            this.workinghours = workinghours;
            this.price = price;
        }
        private void infoAboutAttraction(){
            System.out.println(nameofattraction);
            System.out.println(workinghours);
            System.out.println(price);
        }
    }

    public Park(String nameofpark, String adressofpark, int income) {
        this.nameofpark = nameofpark;
        this.adressofpark = adressofpark;
        this.income = income;
    }

    public void infoAboutPark(){
        System.out.println(nameofpark);
        System.out.println(adressofpark);
        System.out.println(income);
        attraction1.infoAboutAttraction();
        attraction2.infoAboutAttraction();
    }

    Attraction attraction1 = new Attraction("Canon", 10, 100);
    Attraction attraction2 = new Attraction("Wheel", 8, 200);
}
