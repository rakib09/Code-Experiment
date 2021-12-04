package imputable;

import java.util.Date;

public class ImputableClass {
    private final String name;
    private final Integer age;
    private final Date dob;

    public ImputableClass(String name, Integer age, Date dob) {
        this.name = name;
        this.age = age;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Date getDob() {
        return new Date(dob.getTime());
    }

    @Override
    public String toString() {
        return "imputable.ImputableClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                '}';
    }

    public static void main(String[] args) {
        ImputableClass imputableClass = new ImputableClass("Hasan", 12, new Date());
        System.out.println(imputableClass);
    }
}
