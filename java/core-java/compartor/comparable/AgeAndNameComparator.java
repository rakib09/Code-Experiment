package compartor.comparable;

import java.util.Comparator;

public class AgeAndNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if(o1.getAge() > o2.getAge()) return 1;
        if(o1.getAge() < o2.getAge()) return -1;
        return o1.getName().compareTo(o2.getName());
    }
}
