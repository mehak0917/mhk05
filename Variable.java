public class Variable {

//Local variable = declared within the method.
//Instance = declare outside method but within class.
//Static = declare within the static keyword.

//    LOCAL VARIABLE

    int b;
    static int s;

    void m1() {
//        System.out.println(a);
        System.out.println(b);
        System.out.println(s);

    }

    public static void main(String[] args) {

//    Given error as 'a' is local variable.It has local scope means that it can be accessed within a method it is declaration.

        int a;
        System.out.println(s);

//     Instance variable .so can be accessed anywhere in class .
    }
}