package com.company;

public class Ch87Test {
    public static void main(String[] args){
        Ch87 t1 = new Ch87();             // 00:00:00
        Ch87 t2 = new Ch87(2);            // 02:00:00
        Ch87 t3 = new Ch87(21, 34);       // 21:34:00
        Ch87 t4 = new Ch87(12, 25, 42);   // 12:25:42
        Ch87 t5 = new Ch87(t4);           // 12:25:42
        Ch87 t7 = new Ch87(22, 58, 59);   // 22:58:59

        System.out.println("Constructed with: ");
        System.out.println("t1: all arguments defaulted");
        System.out.printf("     %s\n", t1.toUniversalString());
        System.out.printf("     %s\n", t1.toString());

        System.out.println("t2: hour specified: minute and second defaulted");
        System.out.printf("     %s\n", t2.toUniversalString());
        System.out.printf("     %s\n", t2.toString());

        System.out.println("t3: hour and minute specified: second defaulted");
        System.out.printf("     %s\n", t3.toUniversalString());
        System.out.printf("     %s\n", t3.toString());

        System.out.println("t4: hour, minute and second specified");
        System.out.printf("     %s\n", t4.toUniversalString());
        System.out.printf("     %s\n", t4.toString());

        System.out.println("t5: Time2Enhanced object t4 specified");
        System.out.printf("     %s\n", t5.toUniversalString());
        System.out.printf("     %s\n", t5.toString());

        System.out.println("t7: hour, minute and second specified");
        System.out.printf("     %s\n", t7.toUniversalString());
        System.out.printf("     %s\n", t7.toString());

        System.out.println("t7: increment hour(1) and minute(2)");
        t7.incrementHour();
        System.out.printf("     %s\n", t7.toUniversalString());
        System.out.printf("     %s\n", t7.toString());

        t7.incrementMinute();
        t7.incrementMinute();

        System.out.printf("     %s\n", t7.toUniversalString());
        System.out.printf("     %s\n", t7.toString());

        try{
            Ch87 t6 = new Ch87(27, 74, 99);
        }catch(IllegalArgumentException e){
            System.out.printf("\nException while initialising t6: %s\n",
                    e.getMessage());
        }
    }
}
