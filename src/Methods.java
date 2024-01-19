public class Methods {

    static boolean checkSum(int a, int b){

       int c = a + b;
       if (c >=10 && c <= 20 ){
           return true;
       } else {
           return false;
       }
    }

    static void checkNumberPrint(int a){

        if (a >= 0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }

    }

    static boolean checkNumberBoolean(int a){

        if (a >= 0){
            return true;
        } else {
            return false;
        }
    }

    static void printString(String text, int a){

        for (int i = 1; i <= a; i++){
            System.out.println(text);
        }

    }

    static boolean leapYearCheck(int year){

        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0){
            return true;
        } else {
            return false;
        }
    }



    public static void main(String[] args) {
        checkSum(6,5);
        checkNumberPrint(0);
        checkNumberBoolean(1);
        printString("Ура", 5);
        leapYearCheck(404);
    }
}
