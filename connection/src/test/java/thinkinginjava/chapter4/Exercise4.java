package thinkinginjava.chapter4;

public class Exercise4 {
    public static void main(String[] args) {
        for (int i = 1; i < 30; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                } else {
                    if (j > i / 2) {
                        System.out.println(i);
                        break;
                    }
                }
            }

        }
    }
}
