package connection;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.junit.Test;

public class TheMonthCalendar {
    @Test
    public  void main() {
        LocalDate date = LocalDate.now();   //当前日期
        int month = date.getMonthValue();   //当前月份
        int today = date.getDayOfMonth();   //今天几号
        DayOfWeek week = date.getDayOfWeek();   //今天星期几
        
        date = date.minusDays(today - 1);   //设置date为1号
        System.out.println("=============="+month+"月份==============");
        System.out.println(" 星期一   星期二   星期三   星期四   星期五   星期六   星期日");
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
