package aqajava.hw13.PhoneDirectory;

public class PhoneDirectoryApp {
    public static void main(String[] args) {
        PhoneDirectory myPhoneBook = new PhoneDirectory();
        myPhoneBook.add("Piglet", "1111111");
        myPhoneBook.add("Winni", "2222222");
        myPhoneBook.add("Eeyore", "3333333");
        myPhoneBook.add("Owl", "4444444");
        myPhoneBook.add("Rabbit", "5555555");
        myPhoneBook.add("Winni", "6666666");
        myPhoneBook.add("Owl", "7777777");

        System.out.println(myPhoneBook);

        myPhoneBook.get("Owl");
        myPhoneBook.get("Rabbit");
    }
}
