package connection;
/**
 * 
 * @author Administrator
 * ����������򾫶�������������==���Ƚ�
 */
public class FloatEqualFloat {
    public static void main(String[] args) {
        System.out.println(3 - 2.6 == 0.4); //false
        double a = 3;
        double b = 3;
        double c = 0;
        System.out.println(3 - 0.1 == 2.9); //true
        System.out.println();
        for (int i = 0; i < 30; i++) {
            System.out.println((a - c == b)+",���:"+a+" - "+c+" = "+(a - c));
            b -= 0.1;
            c += 0.1;
        }
    }
}
