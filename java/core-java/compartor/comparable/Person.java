package compartor.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

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



    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person person) {
        if (this.age > person.getAge()) return 1;
        if (this.age < person.getAge()) return -1;
        return this.name.compareTo(person.getName());
    }

    public static void main(String[] args) {
        checkComparatorComparable(null);
        checkComparatorComparable(new AgeComparator());
        checkComparatorComparable(new NameComparator());
        checkComparatorComparable(new AgeAndNameComparator());
    }

    private static void checkComparatorComparable(Comparator<Person> personComparator) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Rakib", 30));
        personList.add(new Person("Hasan", 32));
        personList.add(new Person("Abir", 32));
        if(personComparator == null) {
            Collections.sort(personList);
            System.out.println("Comparable is Used");
        } else {
            personList.sort(personComparator);
            System.out.println("Comparator Used: " + personComparator.getClass());
        }

        personList.forEach(System.out::println);
    }
}
