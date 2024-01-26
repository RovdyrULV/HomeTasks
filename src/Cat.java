public class Cat extends Animal {
    boolean satiety = false;

    public Cat() {
        count++;
    }

    static int count = 0;

    void numberOfCopies(){
        System.out.println(count);
    }

    @Override
     void swim(int obstaclelength){
        System.out.println("Кот не умеет плавать");
    }

    @Override
      void run(int obtaclelenght){
        if (obtaclelenght > 200) {
            System.out.println("Кот не может пробежать столько");
        } else {
            System.out.println("Кот пробежал " + obtaclelenght);
        }
    }

    public static class Bowl {
        static int foodinabowl;

         void addingFoodToaBowl(int foodinabowl){
            if (foodinabowl <= 0) {
                System.out.println("В миске не может быть отрицательное количество, либо 0 еды");
            } else if (foodinabowl > 15) {
                System.out.println("Миска переполнена едой");
            } else {
                System.out.println(foodinabowl + " Еды добавлено в миску");
                this.foodinabowl = foodinabowl;
            }
        }
    }

    void meal(){
        if (Bowl.foodinabowl >= 3) {
            Bowl.foodinabowl = Bowl.foodinabowl - 3;
            satiety = true;
        } else {
            System.out.println("Коту недостаточно еды в миске");
        }
    }

    void infoAboutSatiety(){
        System.out.println(satiety);
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        cat.run(100);
        cat.swim(100);
        cat.numberOfCopies();
        Cat[] cats = new Cat[]{cat, cat1, cat2, cat3, cat4};
        Bowl bowl = new Bowl();
        bowl.addingFoodToaBowl(10);
        cat.meal();
        cat1.meal();
        cat2.meal();
        cat3.meal();
        cat4.meal();
        cat.infoAboutSatiety();
        cat1.infoAboutSatiety();
        cat2.infoAboutSatiety();
        cat3.infoAboutSatiety();
        cat4.infoAboutSatiety();
    }
}
