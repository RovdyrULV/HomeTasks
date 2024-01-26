public class Animal {
    public Animal() {
        count++;
    }

    void swim(int obstaclelength){
        System.out.println("Животное проплыло " + obstaclelength);
    }

     void run(int obtaclelenght){
        System.out.println("Животное пробежало " + obtaclelenght);
    }

    static int count = 0;

    void numberOfCopies(){
        System.out.println(count);
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal animal1 = new Animal();
        animal.run(100);
        animal.swim(100);
        animal1.numberOfCopies();
    }
}
