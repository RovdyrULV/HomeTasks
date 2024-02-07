import java.util.*;
/*
Я пробовал переписать метод add но мне все равно выдает ошибку когда я пытаюсь его вызвать в main
 */
public class Phonebook {
    private static Map<String, String> phonebook;
    Phonebook() {
        phonebook = new HashMap<>();
    }
    public void add(String number, String surname) {
        phonebook.put(number, surname);
    }
    public void get(String surname){
        if(phonebook.containsValue(surname)) {
            Set<Map.Entry<String, String>> set = phonebook.entrySet();
            for (Map.Entry<String, String> temp : set) {
                if(temp.getValue().equals(surname)) {
                    System.out.println(temp.getValue() + " : " + temp.getKey());
                }
            }
        } else {
            System.out.println("Такой фамилии нет в списке.");
        }
    }
}
