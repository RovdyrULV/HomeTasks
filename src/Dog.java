public class Dog extends Animal {
    public Dog() {
        count++;
    }
    @Override
    void swim(int obstaclelength){
        if (obstaclelength > 10) {
            System.out.println("Собака не может проплыть столько");
        } else {
            System.out.println("Собака проплыла " + obstaclelength);
        }

    }
    @Override
    void run(int obtaclelenght){
        if (obtaclelenght > 500) {
            System.out.println("Собака не может пробежать столько");
        } else {
            System.out.println("Собака пробежала " + obtaclelenght);
        }
    }
    static int count = 0;

    void numberOfCopies(){
        System.out.println(count);
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.run(100);
        dog.swim(100);
        dog.numberOfCopies();
    }

}
