package map_homework.model;

public enum Months {
    January(31, 1, 2, 3, 4, 5, 6, 7, 28),
    February(28),
    March(31, 8),
    April(30, 1, 24),
    May(31, 1, 8, 9, 28),
    June(30, 1),
    July(31, 5),
    August(31),
    September(30, 1, 21),
    October(31),
    November(30),
    December(31, 31);

    private int days;
    private int[] holidays;

    public int getDays() {
        return days;
    }

    public int[] getHolidays() {
        return holidays;
    }

    Months(int days, int... holidays) {
        this.days = days;
        this.holidays = holidays;
    }
}
