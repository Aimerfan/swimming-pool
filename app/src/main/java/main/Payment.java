package main;

public class Payment {
    public static int weekdayCharge = 200;
    public static int weekendCharge = 250;
    public int money;
    public double totalCharge;

    public Payment(Discount discount, String dateTime) {

        String week = InputNormalization.extractWeek(dateTime);
        System.out.println(week);

        switch (week) {
            case "週一":
            case "週二":
            case "週三":
            case "週四":
            case "週五":
                money = weekdayCharge;
                break;
            case "週六":
            case "週日":
                money = weekendCharge;
                break;
        }

        totalCharge = money * discount.getDiscount();
    }

    public void print() {
        System.out.println("Please pay $" + (int) totalCharge + ".");
    }

    public double getTotalCharge(){
        return totalCharge;
    }
}
