package com.company;

public class Ch86 {
    private static double annualInterestRate = 0.0f;
    private double savingsBalance = 0.0f;

    public Ch86(double savingsBalance){
        setSavingsBalance(savingsBalance);
    }
    public void setSavingsBalance(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }
    public static void modifyInterestRate(double newInterestRate){
        if(newInterestRate >= 0.0f)
            annualInterestRate = newInterestRate;
        else
            throw new IllegalArgumentException("interest rate must be >= 0.0f");
    }
    public double getSavingsBalance(){
        return this.savingsBalance;
    }
    public static double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void calculateMonthlyInterest(){
        savingsBalance += (savingsBalance * annualInterestRate) / 12;
    }
    public String toString(){
        return String.format("%.2f", getSavingsBalance());
    }
}
