package aqajava.hw13.PhoneDirectory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
Write a simple class for a Phone Directory that stores a list of last names and phone numbers.
The add() method should be used to add entries, and the get() method should be used to search
for a phone number by last name. Note that multiple phone numbers can exist under one last name
(in the case of people with the same last name), so when querying such a last name, all phone numbers
should be displayed.
*/

public class PhoneDirectory {
    public Map<String, ArrayList<String>> phoneBook;

    public PhoneDirectory() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        ArrayList<String> phoneNumbers;
        if (phoneBook.containsKey(lastName)) {
            phoneNumbers = phoneBook.get(lastName);
        } else {
            phoneNumbers = new ArrayList<>();
        }
        phoneNumbers.add(phoneNumber);
        phoneBook.put(lastName, phoneNumbers);
    }

    public void get(String lastName) {
        System.out.println(lastName + " : " + this.phoneBook.get(lastName));
    }

    @Override
    public String toString() {
        String phones = "";
        phones = phones.concat("Last name: " + " Phone number\n");
        for (Map.Entry<String, ArrayList<String>> entry : phoneBook.entrySet()) {
            phones = phones.concat(entry.getKey() + " : " + entry.getValue() + "\n");
        }
        return phones;

    }
}
