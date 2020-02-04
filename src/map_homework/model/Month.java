package map_homework.model;

public enum Month {
    JANUARY(31, 1, 2, 3, 4, 5, 6, 7, 28),
    FEBRUARY(28),
    MARCH(31, 8),
    APRIL(30, 1, 24),
    MAY(31, 1, 8, 9, 28),
    JUNE(30, 1),
    JULY(31, 5),
    AUGUST(31),
    SEPTEMBER(30, 1, 21),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31, 31);

    private int days;
    private int[] holidays;

    public int getDays() {
        return days;
    }

    public int[] getHolidays() {
        return holidays;
    }

    Month(int days, int... holidays) {
        this.days = days;
        this.holidays = holidays;
    }
}
