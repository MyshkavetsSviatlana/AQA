package aqajava.javatest;

import java.util.HashSet;
import java.util.Set;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();
        Set<Person> ivans = new HashSet<>();
        Person ivan = new Person("Ivan", 33);
        ivans.add(ivan);
        ivans.add(ivan);
        ivans.add(ivan);
        System.out.println(ivans.size());
        people.add(new Person("Ivan", 33));
        people.add(new Person("Ivan", 33));
        people.add(new Person("Ivan", 33));
        System.out.println(people.size());

    }

}