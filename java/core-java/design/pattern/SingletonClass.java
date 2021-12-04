package design.pattern;

public class SingletonClass {
    private static SingletonClass singletonClass = null;
    private SingletonClass() {

    }
    public static SingletonClass getInstance() {
        if(singletonClass == null) singletonClass = new SingletonClass();
        return singletonClass;
    }
    public static void main(String[] args) {
        SingletonClass s1 = SingletonClass.getInstance();
        SingletonClass s2 = SingletonClass.getInstance();
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
