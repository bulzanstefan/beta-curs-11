package org.betania.curs11;

import java.util.List;

public class TryRecords {
    public static void main(String[] args) {
        Person person = new Person("Alex", 100000, "M");
        Person person2 = new Person("Alex", 10, "M");

        if (person.equals(person2)) {
            System.out.println(person);
            System.out.println(person2);
            System.out.println(person2);
        }
        System.out.println(person.equals(person2));
        System.out.println(person);
        System.out.println(person.name() + " is " + person.age() + " years old");
        List<String> str = List.of("trest");
        //IMMUTABLE
        // - stateul nu poate fi modificat
        // - nu poate mostenit


    }
}

record Person(
        String name,
        int age,
        String gender
) {
    public Person {
        age = Math.min(age, 120);
        System.out.println("Constructorul meu");
    }

    public Person(String name) {
        this(name, 0, "M");
    }

    public String printStatus() {
        return name + " is " + age + " years old";
    }


}


//class Person {
//    private String name;
//    private int age;
//    private String gender;
//
//    public Person(String name) {
//        this.name = name;
//    }
//
//    public Person(String name, int age, String gender) {
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public static void main(String[] args) {
//        Person alex = new Person("Alex");
//        Person alex2 = new Person("Alex");
//        System.out.println(alex.equals(alex2));
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        return age == person.age
//               && Objects.equals(name, person.name)
//               && Objects.equals(gender, person.gender);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age, gender);
//    }
//
//    @Override
//    public String toString() {
//        return "Person{" +
//               "name='" + name + '\'' +
//               ", age=" + age +
//               ", gender='" + gender + '\'' +
//               '}';
//    }
//}
