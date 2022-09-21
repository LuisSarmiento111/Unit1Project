import java.util.Scanner;

public class Unit1Project {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("How much was the total bill?");
        double totalBill = myObj.nextDouble();
        System.out.println("How many people were there?");
        Integer peopleNum  = myObj.nextInt();
        System.out.println("How much do you want to tip?");
        double tipAmount = (double) myObj.nextInt() / 100;
        double splitBill = totalBill / peopleNum;
        double tipPerPerson = splitBill * tipAmount;
        double totalPerPerson = tipPerPerson + splitBill;
    }
}
