package connection;

import static net.mindview.util.Range.*;
public class WhileTest {
    static boolean condition() {
        boolean result = Math.random() < 0.99;
        System.out.println("result=" + result);
        return result;
    }

    public static void main(String[] args) {
        for (int i = 1, j = i + 10; j < 5; i++, j = i * 2) {
            System.out.println("");
        }
    }
}
