package connection;
/**
 * main��������ʹ�÷�ʽ
 * @author Administrator
 *
 */
public class DynamicArray {
    public static void main(String[] args) {
        Other.main(new String[] {"fiddle","de","dum"});
    }
}

class Other{
    public static void main(String[] args) {
        for (String string : args) {
            System.out.println(string +"");
        }
    }
}