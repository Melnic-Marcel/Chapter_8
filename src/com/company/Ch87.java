package com.company;

public class Ch87 {

    private final int SECONDS_IN_MINUTE = 60;
    private final int MINUTES_IN_HOUR   = 60;
    private final int SECONDS_IN_HOUR   = 3600;
    private final int HOURS_IN_DAY      = 24;

    private int secondsSinceMidnight;
    public Ch87(){
        this(0, 0, 0);  // invoke Time2Enhanced constructor with three arguments
    }
    public Ch87(int h){
        this(h, 0, 0);
    }
    public Ch87(int h, int m){
        this(h, m, 0);
    }
    public Ch87(int h, int m, int s){
        setTime(h, m, s);
    }
    public Ch87(Ch87 time){
        this(time.getHour(), time.getMinute(), time.getSecond());
    }
    public void setTime(int h, int m, int s){
        setHour(h);
        setMinute(m);
        setSecond(s);
    }
    public void setHour(int h){
        if(h >= 0 && h < HOURS_IN_DAY)
            secondsSinceMidnight += h * SECONDS_IN_HOUR;
        else
            throw new IllegalArgumentException("hour must be 0-23");
    }
    public void setMinute(int m){
        if(m >= 0 && m < MINUTES_IN_HOUR)
            secondsSinceMidnight += m * SECONDS_IN_MINUTE;
        else
            throw new IllegalArgumentException("minute must be 0-59");
    }
    public void setSecond(int s){
        if(s >= 0 && s < SECONDS_IN_MINUTE)
            secondsSinceMidnight += s;
        else
            throw new IllegalArgumentException("second must be 0-59");
    }
    public void incrementMinute(){
        if(getMinute() < MINUTES_IN_HOUR - 1)
            secondsSinceMidnight += SECONDS_IN_MINUTE;
        else{
            secondsSinceMidnight -= (MINUTES_IN_HOUR - 1) * SECONDS_IN_MINUTE;
            incrementHour();
        }
    }
    public void incrementHour(){
        if(getHour() < HOURS_IN_DAY - 1)
            secondsSinceMidnight += SECONDS_IN_HOUR;
        else
            secondsSinceMidnight -= (HOURS_IN_DAY - 1) * SECONDS_IN_HOUR;
    }
    public int getHour(){
        return secondsSinceMidnight / SECONDS_IN_HOUR;
    }
    public int getMinute(){
        return (secondsSinceMidnight % SECONDS_IN_HOUR) / MINUTES_IN_HOUR;
    }
    public int getSecond(){
        return secondsSinceMidnight % SECONDS_IN_MINUTE;
    }
    public String toUniversalString(){
        return String.format(
                "%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }
    public String toString(){
        return String.format("%d:%02d:%02d %s",
                ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
}
