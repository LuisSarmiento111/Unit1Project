import java.util.Scanner;

public class Unit1Project {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("How much was the total bill?"); // asks user for total bill
        double totalBill = myObj.nextDouble();
        System.out.println("How many people were there?"); // asks user for amount of people
        Integer peopleNum  = myObj.nextInt();
        System.out.println("How much do you want to tip?"); // asks user for the tip amount
        double tipAmount = (double) myObj.nextInt() / 100; // converts given value into a % number
        double splitBill = totalBill / peopleNum; // divides totalBill by peopleNum to get the split bill, then puts value into variable
        double tipPerPerson = splitBill * tipAmount;
        double roundedTipPerPerson = Math.round(tipPerPerson*100)/100d;
        double totalCostPerPerson = tipPerPerson + splitBill;
        double roundedTotalCostPerPerson = Math.round(totalCostPerPerson*100)/100d;
        double totalTipAmount = tipPerPerson * peopleNum;
        double roundedTotalTipAmount = Math.round(totalTipAmount*100)/100d;
        double totalCostWithTip = totalBill + totalTipAmount;
        double roundedTotalCostWithTip = Math.round(totalCostWithTip*100)/100d;
        System.out.println(" ");
        System.out.println("Each person must tip $" + String.format("%.2f", roundedTipPerPerson));
        System.out.print("This means that the total ");
        System.out.println("tip amount is $" + String.format("%.2f", roundedTotalTipAmount));
        System.out.print("The total cost per person ");
        System.out.println("is $" + String.format("%.2f", roundedTotalCostPerPerson));
        System.out.print("The total cost including the ");
        System.out.println("tip is $" + String.format("%.2f", roundedTotalCostWithTip));

    }
}
