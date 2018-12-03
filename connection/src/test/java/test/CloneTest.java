package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class CloneTest {
    float f;
    public static void main(String[] args) throws CloneNotSupportedException, ParseException {
        CloneTest c1 = new CloneTest();
        CloneTest c2 = new CloneTest();
        c1.f = 3.0f;
        c2.f = 1.0f;
        System.out.println("1:c1.f="+c1.f+", c2.f="+c2.f);
        c1 = c2;
        System.out.println("1:c1.f="+c1.f+", c2.f="+c2.f);
        c1.f = 4.0f;
        System.out.println("1:c1.f="+c1.f+", c2.f="+c2.f);
    }
}
