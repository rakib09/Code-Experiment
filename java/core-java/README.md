# Code-Experiment
Learning in different topics

### Integer String Null
```
 //will happend run time exception - NumberFormatException
 Integer integer = new Integer(null);
 // accept String, StringBuilder, StringBuffer & hence happend compile time error for ambiguity
 String s = new String(null);
```
### Search More Specific in Overloading 
```
public class Test {
    //called more specific in hierarchy
    void print(String s) {
        System.out.println("String parameter Call");
    }
    void print(Object s) {
        System.out.println("Object parameter Call");
    }
    public static void main(String[] args) {
       Test test = new Test();
       test.print(null);
    }
}
```
### Search More Specific in Overloading & happened Compile time error for ambiguity
```
public class Test {
    void print(String s) {
        System.out.println("String parameter Call");
    }
    void print(StringBuilder s) {
        System.out.println("String Builder parameter Call");
    }
    void print(Object s) {
        System.out.println("Object parameter Call");
    }
    public static void main(String[] args) {
        Test test = new Test();
        test.print(null); // Compile time error. As String, StrungBuilder are same priority
    }
}
//Same as in System.out.println
// will show Ambiguous method call. Both
//println(char[])in PrintStream and
//println(String)in PrintStream match
System.out.println(null);
```
### Integer Range
```
       Integer i1 = 128;
       Integer i2 = 128;
       System.out.println(i1==i2); // false because Integer support only -128 to 127
       Integer i3 = 127;
       Integer i4 = 127;
       System.out.println(i3==i4); // true
```