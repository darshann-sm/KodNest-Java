public class ElectricityBillCalculator {
    public static void main(String[] args) {
        String customerName = "Rahul";
        int unitsConsumed = 350;

        double electricityBill = 0.0;
        double surcharge = 0.0;
        double penalty = 0.0;
        double totalBill = 0.0;

        if (unitsConsumed <= 0) {
            System.out.println("Invalid Units");
            return;
        }

        if (unitsConsumed <= 100) {
            electricityBill = unitsConsumed * 2.0;
        } else if (unitsConsumed <= 200) {
            electricityBill = unitsConsumed * 3.0;
        } else if (unitsConsumed <= 300) {
            electricityBill = unitsConsumed * 5.0;
        } else {
            electricityBill = unitsConsumed * 7.0;
        }

        if (electricityBill > 1000) {
            surcharge = electricityBill * 0.05;
        } else {
            surcharge = 0.0;
        }

        totalBill = electricityBill + surcharge;

        System.out.println("Customer name: " + customerName);
        System.out.println("Units consumed: " + unitsConsumed);
        System.out.println("Electricity bill: ₹" + electricityBill);
        System.out.println("Surcharge: ₹" + surcharge);

        System.out.println("Total bill: ₹" + totalBill);
    }
}