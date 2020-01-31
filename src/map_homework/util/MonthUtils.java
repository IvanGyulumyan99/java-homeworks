package map_homework.util;

import map_homework.model.Months;

public class MonthUtils {
    public static boolean checkHoliday(Months month, int day) {
        for (int i = 0; i < month.getHolidays().length; i++) {
            if (month.getHolidays()[i] == day) {
                return true;
            }
        }
        return false;
    }

    public static void printEnum(Months month) {
        for (Months temp : month.values()) {
            System.out.println(temp);
        }
    }
}
