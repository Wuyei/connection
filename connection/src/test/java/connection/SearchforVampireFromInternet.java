package connection;
/**
 * 
 * @author
 * ��Ѫ������
 * ָλ��Ϊż�������֣�������һ��������˶��õ�����������ָ������˻���һ��λ�������֣�
 * ���д������������ѡȡ�����ֿ�����������
 *
 */

public class SearchforVampireFromInternet  {
    /**
     * �����������磬�����޸Ĳ������ע�� ���㷨ֻ��Ҫִ��3721��
     */
    public static void main(String[] args) {
        String[] targetNum = null;
        String[] gunNum = null; // Ŀ�����ֺ�ǹ���֣����Ա����֣�
        int sum = 0; // ��Ѫ�����ֵ��ܸ���
        int count = 0; // ��Ч�жϴ�������Щ�˻�����4λ���ľ��ų���
        for (int i = 10; i < 100; i++) {
            for (int j = i + 1; j < 100; j++) { // û���ĸ���λ������ab*ab=abab�����ſ��Ա����֤������������j��i+1��ʼ�Ϳ�����
                int i_target = i * j;
                if (i_target < 1000 || i_target > 9999)
                    continue; // ������4λ��������
                count++;
                targetNum = String.valueOf(i_target).split(""); // ����ת��Ϊһ���ַ�������
                gunNum = (String.valueOf(i) + String.valueOf(j)).split("");
                java.util.Arrays.sort(targetNum); // �������У���Ϊֻ���������ٱȽϲ��ܱ�֤����©abcd=ba*dc���������
                java.util.Arrays.sort(gunNum);
                if (java.util.Arrays.equals(targetNum, gunNum)) {
                    // �����Ƚ�,Ϊ�����ҵ�һ��
                    sum++;
                    System.out.println("��" + sum + "��: " + i_target + "=" + i + "*" + j);
                }
            }
        }
        System.out.println("��������" + count + "���жϣ��ҵ�" + sum + "����Ѫ�����֡�");
    }

}