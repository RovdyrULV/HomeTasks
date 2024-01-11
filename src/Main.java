public class Main {
 static void printThreeWords(){
        System.out.println(
                "Orange\nBanana\nApple"
        );
 }
 static void checkSumSign(){
        int a = 10;
        int b = 20;
        int c = a + b;
        if (c > 0){
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
 }
 static void printColor(){
     int value = 101;
     if (value <= 0){
         System.out.println("Красный");
     } else if (value > 0 && value <= 100) {
         System.out.println("Желтый");
     } else if (value > 100){
         System.out.println("Зеленый");
     }

}
static void compareNumbers(){
     int a = 122;
     int b = 101;
     if( a >= b ){
        System.out.println("a >= b");
    } else {
         System.out.println("a < b");
    }
}
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
}
