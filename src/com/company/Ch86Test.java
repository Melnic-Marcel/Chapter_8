package com.company;

public class Ch86Test {
    public static void main(String[] args){
        Ch86 saver1 = new Ch86(2000.00);
        Ch86 saver2 = new Ch86(3000.00);

        Ch86.modifyInterestRate(0.04f);

        System.out.printf("saver1 initial Balance: %s\n", saver1.toString());
        System.out.printf("saver2 initial Balance: %s\n", saver2.toString());
        System.out.println();

        for(int i=0; i<12; i++){
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
        }

        System.out.printf("saver1 - 12 months at 4%% interest: %s\n", saver1.toString());
        System.out.printf("saver2 - 12 months at 4%% interest: %s\n", saver2.toString());

        System.out.println("\nIncrease interest rate to 5%\n");

        Ch86.modifyInterestRate(0.05f);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.printf("saver1 - 1 month at 5%% interest: %s\n", saver1.toString());
        System.out.printf("saver2 - 1 month at 5%% interest: %s\n", saver2.toString());

    }
}
