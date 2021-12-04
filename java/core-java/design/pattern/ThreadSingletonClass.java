package design.pattern;

public class ThreadSingletonClass {
    private static ThreadSingletonClass singletonClass = null;
    private ThreadSingletonClass() {

    }
    public static ThreadSingletonClass getInstance() {
        if(singletonClass == null) {
            synchronized (ThreadSingletonClass.class) {
                if(singletonClass == null) {
                    singletonClass = new ThreadSingletonClass();
                }
            }
        }
        return singletonClass;
    }
    public static void main(String[] args) {
        ThreadSingletonClass s1 = ThreadSingletonClass.getInstance();
        ThreadSingletonClass s2 = ThreadSingletonClass.getInstance();
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
