import java.util.Scanner;

public class Unit1Project {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // creates scanner
        System.out.println("How much was the total bill?");
        double totalBill = myObj.nextDouble(); // puts given value into variable, totalBill
        System.out.println("How many people were there?");
        Integer peopleNum  = myObj.nextInt(); // puts given value into variable, peopleNum
        System.out.println("How much do you want to tip?");
        double tipAmount = (double) myObj.nextInt() / 100; // converts given value into a % number
        double splitBill = totalBill / peopleNum; // divides total bill by number of people to find the split bill
        double tipPerPerson = splitBill * tipAmount; // multiplies split bill with tip amount to find the tip per person
        double roundedTipPerPerson = Math.round(tipPerPerson*100)/100d; // rounds to the hundredths place
        double totalCostPerPerson = tipPerPerson + splitBill; // finds total cost per person using tipPerPerson and splitBill
        double roundedTotalCostPerPerson = Math.round(totalCostPerPerson*100)/100d; // rounds to the hundredths place
        double totalTipAmount = tipPerPerson * peopleNum; // finds total tip amount using tipPerPerson and peopleNum
        double roundedTotalTipAmount = Math.round(totalTipAmount*100)/100d; // rounds to the hundredths place
        double totalCostWithTip = totalBill + totalTipAmount; // adds total bill with total tip amount to find total cost of everything
        double roundedTotalCostWithTip = Math.round(totalCostWithTip*100)/100d; // rounds to the hundredths place
        System.out.println(" ");
        System.out.println("Each person must tip $" + String.format("%.2f", roundedTipPerPerson)); // prints value to hundredths place
        System.out.print("This means that the total ");
        System.out.println("tip amount is $" + String.format("%.2f", roundedTotalTipAmount)); // prints value to hundredths place
        System.out.print("The total cost per person ");
        System.out.println("is $" + String.format("%.2f", roundedTotalCostPerPerson)); // prints value to hundredths place
        System.out.print("The total cost including the ");
        System.out.println("tip is $" + String.format("%.2f", roundedTotalCostWithTip)); // prints value to hundredths place

    }
}
