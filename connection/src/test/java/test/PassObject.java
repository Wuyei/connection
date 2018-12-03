package test;

import java.util.Random;

class Letter implements Cloneable {
    char c;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }
}

public class PassObject {
    static void f(Letter y) throws CloneNotSupportedException {
        y = (Letter) y.clone();
        y.c = 'z';
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Integer a = 47;
        Integer b = 47;
        Integer c = new Integer(47);
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a == c);
        System.out.println(c == b);
    }
}
