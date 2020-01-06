package Chapter6;

public class PhoneBill {

    public static void main(String args[]){

        HomeworkPhoneBillRedo phoneBill1 = new HomeworkPhoneBillRedo();
        phoneBill1.setBillID(0123);
        phoneBill1.setBaseCost(80.25);
        phoneBill1.setAllottedMinutes(35);
        phoneBill1.setMinutesUsed(50);
        double phoneOverage1 = phoneBill1.calculateOverage();
        double phoneTax1 = phoneBill1.calculateTax();
        double phoneTotal1 = phoneBill1.total();

        System.out.println("For Phone bill id: " + phoneBill1.getBillID());
        System.out.println("The base cost is: " + phoneBill1.getBaseCost());
        System.out.println("The overage charge is: " + phoneOverage1);
        System.out.println("The calculated tax is: " + phoneTax1);
        System.out.println("The Phone bill total is: " + phoneTotal1);
        System.out.println("----------------------------------");


        HomeworkPhoneBillRedo phoneBill2 = new HomeworkPhoneBillRedo(0124);
        phoneBill2.setBaseCost(90.50);
        phoneBill2.setAllottedMinutes(35);
        phoneBill2.setMinutesUsed(45);
        double phoneOverage2 = phoneBill2.calculateOverage();
        double phoneTax2 = phoneBill2.calculateTax();
        double phoneTotal2 = phoneBill2.total();

        System.out.println("For Phone bill id: " + phoneBill2.getBillID());
        System.out.println("The base cost is: " + phoneBill2.getBaseCost());
        System.out.println("The overage charge is: " + phoneOverage2);
        System.out.println("The calculated tax is: " + phoneTax2);
        System.out.println("The Phone bill total is: " + phoneTotal2);
        System.out.println("----------------------------------");

        HomeworkPhoneBillRedo phoneBill3 = new HomeworkPhoneBillRedo(0125,100.00,35,40);
        double phoneOverage3 = phoneBill3.calculateOverage();
        double phoneTax3 = phoneBill3.calculateTax();
        double phoneTotal3 = phoneBill3.total();

        System.out.println("For Phone bill id: " + phoneBill3.getBillID());
        System.out.println("The base cost is: " + phoneBill3.getBaseCost());
        System.out.println("The overage charge is: " + phoneOverage3);
        System.out.println("The calculated tax is: " + phoneTax3);
        System.out.println("The Phone bill total is: " + phoneTotal3);
        System.out.println("----------------------------------");
    }
}
