package com.Model;

import java.util.Arrays;

public class test {
    static class Person
    {
        private String name;
        private int age;

        // Constructor
        public Person(String name, int age)
        {
            this.name = name;
            this.age = age;
        }

        // Copy Constructor
        public Person(Person person) {
            this(person.name, person.age);
        }

        @Override
        public String toString() {
            return Arrays.asList(name, String.valueOf(age)).toString();
        }

        // setters and getters
    }

    // Initialize Object in Java
    static class Main
    {
        public static void main(String[] args)
        {
            Person oldUser = new Person("John", 22);

            // Initialize user using the copy constructor
            Person newUser = new Person(oldUser);

            System.out.println(newUser);
        }
    }
}
