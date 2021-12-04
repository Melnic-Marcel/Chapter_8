package com.company;

public class Ch88 {
    private final int MONTHS_IN_YEAR = 12;
    private int month;
    private int day;
    private int year;

    private static final int[] daysPerMonth =
            {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public Ch88(int month, int day, int year){
        setMonth(month);
        setDay(day);
        setYear(year);

        System.out.printf("DateEnhanced object constructor for day %s\n", this);
    }
    public void setDay(int day){
        this.day = checkDay(day);
    }
    public void setMonth(int month){
        this.month = checkMonth(month);
    }
    public void setYear(int year){
        this.year = checkYear(year);
    }
    public int getDay(){
        return this.day;
    }
    public int getMonth(){
        return this.month;
    }
    public int getYear(){
        return this.year;
    }
    private int checkMonth(int testMonth){
        if(testMonth > 0 && testMonth <= MONTHS_IN_YEAR)
            return testMonth;
        else
            throw new IllegalArgumentException("month must be 1-12");
    }
    private int checkDay(int testDay){
        if(testDay > 0 && testDay <= daysPerMonth[this.month])
            return testDay;
        if(this.month == 2 && testDay == 29 &&
                (this.year % 400 == 0 || (this.year % 4 == 0 && this.year % 100 != 0)))
            return testDay;

        throw new IllegalArgumentException("day out of range for the specified month and year");
    }
    private int checkYear(int testYear){
        if(testYear > 0 && testYear <= 9999)
            return testYear;
        else
            throw new IllegalArgumentException("year must be within the range 0-9999");
    }
    public void nextDay(){
        if(getDay() + 1 <= daysPerMonth[getMonth()])
            setDay(getDay() + 1);
        else{
            setDay(1);
            nextMonth();
        }
    }
    public void nextMonth(){
        if(getMonth() + 1 <= MONTHS_IN_YEAR)
            setMonth(getMonth() + 1);
        else{
            setMonth(1);
            setYear(getYear() + 1);
        }
    }
    public String toString(){
        return String.format("%02d/%02d/%4d", month, day, year);
    }
}
