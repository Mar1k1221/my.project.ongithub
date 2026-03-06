package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
Animal animal = new Animal();
        System.out.println("Java welcome to work");
        System.out.println("Hello merge on GitHub");
        System.out.println("GIT");
    }

    public static class Animal {
        String name;
        int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Animal() {
            this.name = name;
            this.age = age;

        }
    }
}
