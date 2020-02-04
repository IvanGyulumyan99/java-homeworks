package map_homework.util;

import map_homework.model.Month;

public class MonthUtils {
    public static boolean checkHoliday(Month month, int day) {
        for (int i = 0; i < month.getHolidays().length; i++) {
            if (month.getHolidays()[i] == day) {
                return true;
            }
        }
        return false;
    }

    public static void printMonthsEnum() {
        for (Month temp : Month.values()) {
            System.out.println(temp);
        }
    }
}
