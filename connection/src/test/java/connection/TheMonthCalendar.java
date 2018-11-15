package connection;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.junit.Test;

public class TheMonthCalendar {
    @Test
    public  void main() {
        LocalDate date = LocalDate.now();   //��ǰ����
        int month = date.getMonthValue();   //��ǰ�·�
        int today = date.getDayOfMonth();   //���켸��
        DayOfWeek week = date.getDayOfWeek();   //�������ڼ�
        
        date = date.minusDays(today - 1);   //����dateΪ1��
        System.out.println("=============="+month+"�·�==============");
        System.out.println(" ����һ   ���ڶ�   ������   ������   ������   ������   ������");
        for (int i = 1; i < week.getValue(); i++) {
            System.out.print("     ");
        }
        while(date.getMonthValue() == month) {
            System.out.printf("%4d",date.getDayOfMonth());
            if(date.getDayOfMonth() == today) {
                System.out.print("*");
            }else {
                System.out.print(" ");
            }
            if(date.getDayOfWeek().getValue() == 7) {
                System.out.println();
            }
            date = date.plusDays(1);
        }
    }
}
