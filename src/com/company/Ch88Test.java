package com.company;

public class Ch88Test {
    public static void main(String[] args){
        final int END_DATE = 10000;

        Ch88 date = new Ch88(11, 29, 2015);

        do{
            try{
                date.nextDay();
            }catch(IllegalArgumentException e){
                System.out.printf("Error fetching next day: %s\n", e.getMessage());
                break;
            }

            System.out.printf("%s\n", date.toString());
        }while(date.getYear() != END_DATE);
    }
}
