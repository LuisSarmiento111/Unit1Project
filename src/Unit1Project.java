import java.util.Scanner;

public class Unit1Project {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("How much was the total bill?");
        double totalBill = myObj.nextDouble();
        System.out.println("How many people were there?");
        Integer peopleNum  = myObj.nextInt();
        System.out.print(totalBill);
        System.out.print(peopleNum);
    }
}
