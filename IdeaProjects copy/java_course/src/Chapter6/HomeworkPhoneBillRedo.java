package Chapter6;

import java.util.Scanner;

public class HomeworkPhoneBillRedo {

    static double tax = 0.15;
    static double overageCharge = 0.25;
    static char itemizedBill;

    private static double billID;
    private static double baseCost;
    private static double allottedMinutes;
    private static double minutesUsed;

    public HomeworkPhoneBillRedo(){
        billID = 0;
        baseCost = 0;
        allottedMinutes = 0;
        minutesUsed = 0;
    }

    public HomeworkPhoneBillRedo(double billID){
        this.billID = billID;
        setBaseCost(baseCost);
        setAllottedMinutes(allottedMinutes);
        setMinutesUsed(minutesUsed);
    }
    public HomeworkPhoneBillRedo(double billID, double baseCost, double allottedMinutes, double minutesUsed){
        this.billID = billID;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;
    }
    double getBillID(){
        return billID;
    }
    void setBillID(double billID){
        this.billID = billID;
    }
    double getBaseCost(){
        return baseCost;
    }
    void setBaseCost(double baseCost){
        this.baseCost = baseCost;
    }
    double getAllottedMinutes(){
        return allottedMinutes;
    }
    void setAllottedMinutes(double allottedMinutes){
        this.allottedMinutes = allottedMinutes;
    }
    double getMinutesUsed(){
        return minutesUsed;
    }
    void setMinutesUsed(double minutesUsed){
        this.minutesUsed = minutesUsed;
    }
    public static double calculateOverage(){
        return (minutesUsed - allottedMinutes) * overageCharge;
    }
    public static double calculateTax() {
        return baseCost * tax;
    }
    public static double total(){
        return calculateOverage() + calculateTax() + baseCost;
    }
}
